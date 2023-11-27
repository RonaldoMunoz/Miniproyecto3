package controller;

import java.util.ArrayList;

import javax.swing.JPanel;

import model.Candidato;

public interface ControladorGeneral {
    public void addCandidato(String name, String cedula, String partido, String ciudad, ArrayList <String> propuestas,String inclinacion);
    public Candidato buscarCandidato(String target);
    public Candidato AccederCandidato(String target);
    public void updateCandidato(Candidato candidato, String nombre, String cedula, String ciudad,
            String partido, String inclinacion, ArrayList<String> propuestas);
    public  void deleteCandidato(String id);

}
