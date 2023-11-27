package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.C_origen;
import model.Candidato;
import model.FormularioException;
import model.Inclinacion;
import model.Modelo;
import model.Partido_p;

;

public class Controlador  {

   
    
    
    public Controlador(){

    }

    public void addCandidato(String name, String cedula, String partido, String ciudad, ArrayList <String> propuestas,String inclinacion, JPanel panel){
        try{
        if(name.equals("") || cedula.equals("") || propuestas == null || inclinacion == null ){
            throw new FormularioException("Debes llenar todos los datos del candidato");
            
        }
        Modelo.modelo.setNombre(name);
        Modelo.modelo.setCedula(cedula);
        Modelo.modelo.setPartido(partido);
        Modelo.modelo.setCiudad(ciudad);        
        Modelo.modelo.setProm(propuestas);
        Modelo.modelo.setInclinacion(inclinacion);
        Modelo.modelo.addCandidato(Modelo.candidatos);
    }
    catch(FormularioException e){
        JOptionPane.showMessageDialog(panel, e, "Error al ingresar los datos", 0);
    }
    }

    public Candidato buscarCandidato(String target, JPanel panel){
        Modelo.modelo.setTarget(target);
        Candidato candidatoEncontrado = Modelo.modelo.buscar();
        try{
        
        
            
            JTextArea showInfoCandidato = new JTextArea();
        if (candidatoEncontrado != null) {
            // Si se encuentra el candidato, actualizar la interfaz con sus datos
            showInfoCandidato = new JTextArea();
            showInfoCandidato.setEditable(false);
            showInfoCandidato.append("Candidato encontrado:\n");
            showInfoCandidato.append(candidatoEncontrado.listarDatos()); // Mostrar los datos del candidato
            
            // Mostrar los datos del candidato en una ventana emergente (JOptionPane)
            JOptionPane.showMessageDialog(panel, showInfoCandidato, "Información del Candidato",
                    JOptionPane.INFORMATION_MESSAGE);
            return candidatoEncontrado;
        } else {
            throw new FormularioException("EL USUARIO NO SE ENCUENTRA REGISTRADO");
            // Si no se encuentra el candidato, mostrar un mensaje indicando que no se encontró 
        
        }
    }
        catch(FormularioException e){
            JOptionPane.showMessageDialog(panel, e, "Error", JOptionPane.ERROR_MESSAGE);
            return candidatoEncontrado;
        }

    }

    public Candidato AccederCandidato(String target){
        Modelo.modelo.setTarget(target);
        Candidato candidatoEncontrado = Modelo.modelo.buscar();
        return candidatoEncontrado;

    }


    public void updateCandidato(Candidato candidato, JPanel panel, String nombre, String cedula, String ciudad,
            String partido, String inclinacion, ArrayList<String> propuestas) {
        try {
            if (nombre.equals("") || cedula.equals("") || propuestas == null || inclinacion == null) {
                throw new FormularioException("Debes llenar todos los datos del candidato");

            }
            
            Modelo.modelo.setNombre(nombre);
            Modelo.modelo.setCedula(cedula);
            Modelo.modelo.setCiudad(ciudad);
            Modelo.modelo.setPartido(partido);
            Modelo.modelo.setInclinacion(inclinacion);
            Modelo.modelo.setProm(propuestas);
            Modelo.modelo.update(candidato);
        } catch (FormularioException e) {
            JOptionPane.showMessageDialog(panel, e, "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void deleteCandidato(String id){
        Modelo.modelo.setTarget(id);
        Modelo.modelo.delete(Modelo.candidatos);
    }



}
