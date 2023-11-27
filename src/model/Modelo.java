package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;

public class Modelo {

    public static Modelo modelo = new Modelo();



    private Modelo() {
    }

    public static ArrayList<Candidato> candidatos = new ArrayList<>();
    private ArrayList<String> prom;
    private String nombre, cedula, partido, ciudad, inclinacion;
    private int votos;
    private String target;


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    public ArrayList<String> getProm() {
        return prom;
    }

    public void setProm(ArrayList<String> prom) {
        this.prom = prom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getInclinacion() {
        return inclinacion;
    }

    public void setInclinacion(String inclinacion) {
        this.inclinacion = inclinacion;
    }

    public void addCandidato(ArrayList<Candidato> candidatos) {
        try{
        candidatos.add(new Candidato(this.nombre, this.cedula, C_origen.valueOf(this.ciudad.toUpperCase()),
                Partido_p.valueOf(this.partido.toUpperCase()), this.prom, Inclinacion.valueOf(this.inclinacion), 0));}
        catch(NullPointerException e){
            return;
        }
    }

    public Candidato buscar() {
        String buscar = this.target;
        for (int i = 0; i < Modelo.candidatos.size(); i++) {
            if (Modelo.candidatos.get(i) != null) {
                if (Modelo.candidatos.get(i).getCedula().equals(buscar)) {
                    return candidatos.get(i);
                }
            }
        }
        return null;
    }

    public boolean buscarId(String id){
            for (Candidato c1 : Modelo.candidatos) {
                if(c1.getCedula().equals(id)){
                    return true;
                }
            }
            return false;
    }   

    public boolean delete(ArrayList<Candidato> candidatos) {
        String buscar = this.target;
        for (int i = 0; i < Modelo.candidatos.size(); i++) {
            if (Modelo.candidatos.get(i) != null) {
                if (Modelo.candidatos.get(i).getCedula().equals(buscar)) {
                    Modelo.candidatos.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCandidato(){
        String buscar = this.target;
        for (int i = 0; i < Modelo.candidatos.size(); i++) {
            if (Modelo.candidatos.get(i) != null) {
                if (Modelo.candidatos.get(i).getCedula().equals(buscar)) {
                    return true;

                }
            }
        }
        return false;
    }

    public void update(Candidato candidato) {

        candidato.setNombre(this.nombre);
        candidato.setCedula(this.cedula);
        candidato.setPartido_politico(Partido_p.valueOf(this.partido.toUpperCase()));
        candidato.setC_origen(C_origen.valueOf(this.ciudad.toUpperCase()));
        candidato.setPromesas(this.prom);
        
    }


    public StringBuilder mostrarCandidatos() {
        StringBuilder datos = new StringBuilder();
        for (int i = 0; i < Modelo.candidatos.size(); i++) {
            String text = Modelo.candidatos.get(i).listarDatos();
            datos.append(text + "\n");

        }
        return datos;
    }

    public void votacion(ArrayList<Candidato> candidatos, int i) {
        candidatos.get(i).setN_votos(this.votos);

    }

    public Partido_p encontrarPartidoConMasCandidatos(ArrayList <Candidato> candidatos) {
        Map<Partido_p, Integer> contadorPartidos = new HashMap<>();
        for (Candidato candidatoActual : candidatos) {
            Partido_p partido = candidatoActual.getPartido_politico();
            contadorPartidos.put(partido, contadorPartidos.getOrDefault(partido, 0) + 1);
        }

        Partido_p partidoMasCandidatos = null;
        int maxCandidatos = 0;

        for (Map.Entry<Partido_p, Integer> entry : contadorPartidos.entrySet()) {
            if (entry.getValue() > maxCandidatos) {
                maxCandidatos = entry.getValue();
                partidoMasCandidatos = entry.getKey();
            }
        }
        return partidoMasCandidatos;
    }

    public Candidato encontrarGanador(ArrayList<Candidato> candidatos) {
        Candidato ganador = candidatos.get(0);
        for (int i = 1; i < candidatos.size(); i++) {
            if (candidatos.get(i).getN_votos() > ganador.getN_votos()) {
                ganador = candidatos.get(i);
            }
        }
        // Mostrar el candidato ganador
        return ganador;
    }

    public DefaultListModel<String> topCiudades(ArrayList <Candidato> candidatos){
        Map<String, Integer> conteoCiudades = new HashMap<>();
        Map<Partido_p, Integer> conteoPartidos = new HashMap<>();  // Contador de candidatos por partido
        ArrayList<String> ciudades = new ArrayList<>();

        // Iterar sobre los candidatos
        for (Candidato c : candidatos) {
            String ciudadOrigen = c.getC_origen().toString();
            ciudades.add(ciudadOrigen);
            conteoCiudades.merge(ciudadOrigen, 1, Integer::sum);

            // Contar candidatos por partido
            conteoPartidos.merge(c.getPartido_politico(), 1, Integer::sum);
        }

        ArrayList<String> top3Ciudades = new ArrayList<>(conteoCiudades.keySet());
        top3Ciudades.sort(Comparator.comparingInt(conteoCiudades::get));
        top3Ciudades = new ArrayList<>(top3Ciudades.subList(0, Math.min(3, top3Ciudades.size())));

        DefaultListModel<String> ciudadesListModel = new DefaultListModel<>();
        for (String ciudad : top3Ciudades) {
            ciudadesListModel.addElement(ciudad + ": " + conteoCiudades.get(ciudad));
        }
        return ciudadesListModel;
    }

    
    
    public void reiniciarVariables(){
        this.prom = new ArrayList <String>();
        this.nombre =" ";
        this.cedula =" ";
        this.ciudad =" ";
        this.partido =" ";
        this.inclinacion =" ";
    }
}