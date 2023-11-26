package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Candidato;
import model.FormularioException;
import model.Modelo;

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

    public Candidato buscarCandidato(String target){
        
        Modelo.modelo.setTarget(target);
        return Modelo.modelo.buscar();

    }

    public void updateCandidato(String target, JPanel panel){
        try{
        Modelo.modelo.setTarget(target);
        if(Modelo.modelo.checkCandidato()){
            
            Modelo.modelo.update();
        } 
        else{
            throw new FormularioException("El candidato no se encontro en la base de datos!");
        }

    }
        catch(FormularioException e) {
            JOptionPane.showMessageDialog(panel, e.getMessage());
            }    
        }
    
    public void deleteCandidato(String id){
        Modelo.modelo.setTarget(id);
        Modelo.modelo.delete(Modelo.candidatos);
    }



}
