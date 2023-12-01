package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
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
        try{
        
        candidato.setNombre(this.nombre);
        candidato.setCedula(this.cedula);
        candidato.setPartido_politico(Partido_p.valueOf(this.partido.toUpperCase()));
        candidato.setC_origen(C_origen.valueOf(this.ciudad.toUpperCase()));
        candidato.setPromesas(this.prom);
        }catch(IllegalArgumentException e){
            return;
        }
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
    public boolean checkDatos (String ciudad, String partido, String inclinacion){
        try{
            ciudad.replace(" ", "_");
            partido.replace(" ", "_");
            inclinacion.replace(" ", "_");
        C_origen c = C_origen.valueOf(ciudad.toUpperCase());
        Partido_p p = Partido_p.valueOf(partido.toUpperCase());
        Inclinacion i = Inclinacion.valueOf(inclinacion.toUpperCase());
        return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }
    public Candidato obtenerGanador() {
        // Verificar si la lista de candidatos no está vacía
        if (candidatos.isEmpty()) {
            // Manejar el caso de una lista vacía según tus necesidades
            return null;
        }

        // Inicializar variables para realizar un seguimiento del candidato con más votos
        Candidato candidatoConMayorVotos = null;
        int votosMaximos = Integer.MIN_VALUE;
        // Iterar sobre la lista de candidatos
        for (Candidato candidato : candidatos) {
            int votos = candidato.getN_votos();

            // Verificar si los votos actuales son mayores que los votos máximos registrados
            if (votos > votosMaximos) {
                votosMaximos = votos;
                candidatoConMayorVotos = candidato;
            }
        }

        // Devolver el candidato con el mayor número de votos
        return candidatoConMayorVotos;
    }

    public DefaultListModel<String> topCiudades(){
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


    public String encontrarPartidoConMasCandidatos() {
        Map <String , Integer > listaPartidos = new HashMap<>();
        for (Candidato candidato : candidatos) {

            listaPartidos.merge(candidato.getPartido_politico().displayNameEnum(), 1, Integer::sum);
            
        }

        String partidoConMayorValor = null;
        int valorMaximo = Integer.MIN_VALUE;

        // Iterar sobre las entradas del map
        for (Map.Entry<String, Integer> entry : listaPartidos.entrySet()) {
            String partido = entry.getKey();
            int valor = entry.getValue();

            // Verificar si el valor actual es mayor que el valor máximo registrado
            if (valor > valorMaximo) {
                valorMaximo = valor;
                partidoConMayorValor = partido;
            }
        }

        return partidoConMayorValor;
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