package view;
import controller.Controlador;

public interface VistaGeneral {
    public String getNombre();
    public String getCedula();
    public String getCiudad();
    public String getPartido();
    public String getPromesas();
    public String getInclinacion();
    public void iniciar(Controlador controller);

}
