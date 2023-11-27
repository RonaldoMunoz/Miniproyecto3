import javax.swing.JOptionPane;

import view.GraficaUser;
import view.VistaConsola;

public class App {
    
    public static void main(String[] args) throws Exception {
        Object[] opciones = {"Vista GUI", "Vista consola"};
        GraficaUser grafica = new GraficaUser();
        grafica.setVisible(true);
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Deseas ver la vista GUI o la Vista en consola", "Selecciona la vista", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, JOptionPane.CLOSED_OPTION);
        if(opcionSeleccionada == 0){
            grafica.setVisible(true);
        }
        if(opcionSeleccionada == 1){
            grafica.setVisible(false);
            VistaConsola consola = new VistaConsola();
            consola.iniciarVistaConsola();

        }
        if (opcionSeleccionada != 0 && opcionSeleccionada != 1){
            System.exit(0);
        }
    }
}
