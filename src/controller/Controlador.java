package controller;

import java.util.ArrayList;

import model.Candidato;
import model.Modelo;


public class Controlador  {

    private Modelo modelo = new Modelo();
    
    public Controlador(){

    }

    public void addCandidato(String name, String cedula, String partido, String ciudad, ArrayList <String> propuestas,String inclinacion){
        
        modelo.setNombre(name);
        modelo.setCedula(cedula);
        modelo.setPartido(partido);
        modelo.setCiudad(ciudad);        
        modelo.setProm(propuestas);
        modelo.setInclinacion(inclinacion);
        modelo.addCandidato(Modelo.candidatos);
        
    }

    public Candidato buscarCandidato(String target){
        
        modelo.setTarget(target);
        return modelo.buscar(Modelo.candidatos);

    }

    public void deleteCandidato(String id){
        modelo.setTarget(id);
        modelo.delete(Modelo.candidatos);
    }


}
