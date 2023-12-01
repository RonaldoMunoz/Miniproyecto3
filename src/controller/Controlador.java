package controller;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import model.C_origen;
import model.Candidato;
import model.CandidatoException;
import model.FormularioException;
import model.Inclinacion;
import model.Modelo;
import model.Partido_p;

public class Controlador implements ControladorGeneral {
    public static boolean flag = false;

    public Controlador() {

    }

    @Override
    public void addCandidato(String name, String cedula, String partido, String ciudad, ArrayList<String> propuestas,
            String inclinacion) {
        try {
            if (Modelo.modelo.buscarId(cedula)) {
                throw new FormularioException("La cedula que ingresaste ya se encuentra registrada.");
            } else if (name.equals("") || cedula.equals("") || propuestas == null || inclinacion.equals("")|| partido.equals("") || ciudad.equals("")) {
                throw new FormularioException("Debes llenar todos los datos del candidato");

            }
            Modelo.modelo.setNombre(name);
            Modelo.modelo.setCedula(cedula);
            Modelo.modelo.setPartido(partido);
            Modelo.modelo.setCiudad(ciudad);
            Modelo.modelo.setProm(propuestas);
            Modelo.modelo.setInclinacion(inclinacion);
            Modelo.modelo.addCandidato(Modelo.candidatos);
        } catch (FormularioException e) {

            if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, e, "Error al ingresar los datos", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("No haz ingresado La ciudad, partido o inclinacion del candidato correctamente");
            return;
        }
    }

    @Override
    public Candidato buscarCandidato(String target) {
        Modelo.modelo.setTarget(target);
        Candidato candidatoEncontrado = Modelo.modelo.buscar();
        try {
            if (Modelo.candidatos.isEmpty()) {
                throw new FormularioException("No hay candidatos registrados");
            }

            JTextArea showInfoCandidato = new JTextArea();
            if (candidatoEncontrado != null) {
                // Si se encuentra el candidato, actualizar la interfaz con sus datos
                showInfoCandidato = new JTextArea();
                showInfoCandidato.setEditable(false);
                showInfoCandidato.append("Candidato encontrado:\n");
                showInfoCandidato.append(candidatoEncontrado.listarDatos()); // Mostrar los datos del candidato

                // Mostrar los datos del candidato en una ventana emergente (JOptionPane)
                if (Controlador.flag) {
                    JOptionPane.showMessageDialog(null, showInfoCandidato, "Información del Candidato",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                return candidatoEncontrado;
            } else {
                throw new FormularioException("EL USUARIO NO SE ENCUENTRA REGISTRADO");
                // Si no se encuentra el candidato, mostrar un mensaje indicando que no se
                // encontró

            }
        } catch (FormularioException e) {
            if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
            }
            return candidatoEncontrado;
        }

    }

    @Override
    public Candidato AccederCandidato(String target) {
        Modelo.modelo.setTarget(target);
        Candidato candidatoEncontrado = Modelo.modelo.buscar();
        return candidatoEncontrado;

    }

    @Override
    public void updateCandidato(Candidato candidato, String nombre, String cedula, String ciudad,
            String partido, String inclinacion, ArrayList<String> propuestas) {
        try {
            if (nombre.equals("") || cedula.equals("") || propuestas == null || inclinacion.equals("")|| partido.equals("") || ciudad.equals("")) {
                throw new FormularioException("Debes llenar todos los datos del candidato");

            }

            if(!Modelo.modelo.checkDatos(ciudad,partido,inclinacion)){
                throw new FormularioException("Se deben digitar valores validos en la ciudad,partido y inclinacion del candidato");
            }
            Modelo.modelo.setNombre(nombre);
            Modelo.modelo.setCedula(cedula);
            Modelo.modelo.setCiudad(ciudad);
            Modelo.modelo.setPartido(partido);
            Modelo.modelo.setInclinacion(inclinacion);
            Modelo.modelo.setProm(propuestas);
            Modelo.modelo.update(candidato);
        } catch (FormularioException e) {
            if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
                return;
            }

    }

    @Override
    public void deleteCandidato(String id) {
        Modelo.modelo.setTarget(id);
        try {
            if (Modelo.candidatos.isEmpty()) {
                throw new FormularioException("No hay candidatos registrados");
            } else if (id.equals("") || id == null) {
                throw new FormularioException("Digite la cedula del candidato.");
            } else if (Modelo.modelo.delete(Modelo.candidatos)) {
                System.out.println("El candidato se elimino con exito!");
                JOptionPane.showMessageDialog(null, "El candidato se elimino con exito!", "CRUD",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                throw new FormularioException("El usuario no se encuentra registrado");
            }
        } catch (FormularioException e) {
            if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
            }
            return;
        }
    }

    public void votacion(int index, String votos) {
        try {
            int voto = Integer.parseInt(votos);
            if (votos.equals("")) {
                throw new FormularioException("Digite un valor numerico");
            }
            getCandidato(index).setN_votos(voto);
        } catch (NumberFormatException e) {
            if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, "Digite una entrada valida", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
            } }
            catch(FormularioException e){
                if (Controlador.flag) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println(e.getMessage());
            }
        }
        }


    public String mostrarCandidatos() {
        if (Modelo.modelo.mostrarCandidatos().isEmpty()) {
            CandidatoException exception = new CandidatoException("No hay candidatos registrados");
            return exception.getMessage();
        }
        return Modelo.modelo.mostrarCandidatos().toString();
    }

    @Override
    public Candidato getCandidato(int index) {
        try {
            return Modelo.candidatos.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public Candidato getGanador() {
        return Modelo.modelo.obtenerGanador();
    }

    @Override
    public String getPartidoMasCandidatos() {
        return Modelo.modelo.encontrarPartidoConMasCandidatos();
    }

    @Override

    public DefaultListModel<String> getTopciudades(){
        return Modelo.modelo.topCiudades();
    }
}

