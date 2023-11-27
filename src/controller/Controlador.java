package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.Candidato;
import model.FormularioException;
import model.Modelo;


public class Controlador implements ControladorGeneral {
    
    public Controlador(){

    }
    @Override
    public void addCandidato(String name, String cedula, String partido, String ciudad, ArrayList <String> propuestas,String inclinacion){
        try{
        if(Modelo.modelo.buscarId(cedula) ){
            throw new FormularioException("La cedula que ingresaste ya se encuentra registrada.");
        }
        else if(name.equals("") || cedula.equals("") || propuestas == null || inclinacion == null ){
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
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, e, "Error al ingresar los datos", JOptionPane.ERROR_MESSAGE);
    }
    }
    @Override
    public Candidato buscarCandidato(String target){
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
            JOptionPane.showMessageDialog(null, showInfoCandidato, "Información del Candidato",
                    JOptionPane.INFORMATION_MESSAGE);
            return candidatoEncontrado;
        } else {
            throw new FormularioException("EL USUARIO NO SE ENCUENTRA REGISTRADO");
            // Si no se encuentra el candidato, mostrar un mensaje indicando que no se encontró 
        
        }
    }
        catch(FormularioException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return candidatoEncontrado;
        }

    }
    @Override
    public Candidato AccederCandidato(String target){
        Modelo.modelo.setTarget(target);
        Candidato candidatoEncontrado = Modelo.modelo.buscar();
        return candidatoEncontrado;

    }

    @Override
    public void updateCandidato(Candidato candidato, String nombre, String cedula, String ciudad,
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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    @Override
    public void deleteCandidato(String id){
        
        Modelo.modelo.setTarget(id);
        try{
        if(id.equals("") || id == null){
            throw new FormularioException("Digite la cedula del candidato."); }
        
        else if(Modelo.modelo.delete(Modelo.candidatos)){
            System.out.println("El candidato se elimino con exito!");
            JOptionPane.showMessageDialog(null, "El candidato se elimino con exito!", "CRUD", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            throw new FormularioException("El usuario no se encuentra registrado");
        } 
    }
        catch(FormularioException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public StringBuilder mostrarCandidatos(){
        return Modelo.modelo.mostrarCandidatos();
    }



}
