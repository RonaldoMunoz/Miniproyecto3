package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.C_origen;
import model.FormularioException;
import controller.Controlador;

public class VistaConsola implements VistaGeneral {
    public String nombre, cedula, ciudad, partido, inclinacion;
    public ArrayList<String> promesas;
    public Scanner dato = new Scanner(System.in);
    public Controlador controlador = new Controlador();

    public VistaConsola() {
    }

    public void menu1() {
        System.out.println("   [C R U D] \n");
        System.out.println("[A]<- Insertar candidato \n");
        System.out.println("[B}<- Actualizar candidato \n");
        System.out.println("[C]<- Eliminar candidato \n");
        System.out.println("[D]<- Buscar candidato por nombre \n");
        System.out.println("[E]<- Listar todos los candidatoS \n");
        System.out.println("[F]<- Si desea continuar con el ingreso de votos \n");
    }

    public void mostrarEnums() {
        ArrayList<String> nombresEnum = new ArrayList<>();

        for (C_origen ciudad : C_origen.values()) {
            nombresEnum.add(ciudad.displayNameEnum());
        }
        for (String nombre : nombresEnum) {
            System.out.println("\t" + nombre + " ");
        }
    }

    public static String capitalizeString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getCedula() {
        return this.cedula;
    }

    @Override
    public String getCiudad() {
        return this.ciudad;
    }

    @Override
    public String getPartido() {
        return this.partido;
    }

    @Override
    public ArrayList<String> getPromesas() {
        return this.promesas;
    }

    @Override
    public String getInclinacion() {
        return this.inclinacion;
    }

    public void cleanScreen() {
        System.out.print("\033[H\033[2J"); /* Limpiar consola */
        System.out.flush();
    }

    public String buscar(){
        String target;
        System.out.println("Ingresa la cedula del candidato que vas a actualizar");
        dato.nextLine();
        target = dato.nextLine();
        return controlador.buscarCandidato(target).listarDatos();
    }

    public void actualizar(){
        String target;
        try{
        System.out.println("Ingresa la cedula del candidato que vas a actualizar");
        dato.nextLine();
        target = dato.nextLine();
        if(controlador.buscarCandidato(target) != null){
            pedirDatosUpdate();
            controlador.updateCandidato(controlador.buscarCandidato(target), getNombre(), getCedula(), getCiudad().toUpperCase(), getPartido().toUpperCase(), getInclinacion().toUpperCase(), getPromesas());
        }
        else{
            throw new FormularioException("No se ha encontrado el candidato");
        }}
        catch(FormularioException e){
            System.out.println(e.getMessage());
        }
    }

    public void pedirDatosUpdate(){
            System.out.println("Ingresa el nombre del candidato:");
            System.out.println("\t");
            this.nombre = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la cedula del candidato:");
            System.out.println("\t");
            this.cedula = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la ciudad del candidato:");
            System.out.println("\t");
            this.ciudad = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa el partido del candidato:");
            System.out.println("\t");
            this.partido = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la inclinacion del candidato:");
            System.out.println("\t");
            this.inclinacion = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa las promesas del candidato:");
            System.out.println("\t");
            String prom = dato.nextLine();
            this.promesas.add(prom);
            dato.nextLine();
    }

    public void pedirDatos() {
        while (true) {
            System.out.println("Ingresa el nombre del candidato:");
            System.out.println("\t");
            this.nombre = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la cedula del candidato:");
            System.out.println("\t");
            this.cedula = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la ciudad del candidato:");
            System.out.println("\t");
            this.ciudad = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa el partido del candidato:");
            System.out.println("\t");
            this.partido = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa la inclinacion del candidato:");
            System.out.println("\t");
            this.inclinacion = dato.nextLine();
            dato.nextLine();
            System.out.println("Ingresa las promesas del candidato:");
            System.out.println("\t");
            this.promesas.add(dato.nextLine());
            dato.nextLine();
            controlador.addCandidato(getNombre(), getCedula(), getPartido().toUpperCase(), getCiudad().toUpperCase(), getPromesas(), getInclinacion().toUpperCase());
            try {
                System.out.println("¿Desea ingresar otro candidato?: S/N");
                String request = dato.nextLine();
                if (request.toUpperCase().equals("N")) {
                    break;
                } else if (request.toUpperCase().equals("S")) {
                    cleanScreen();

                } else {
                    throw new FormularioException("Selecciona una opcion valida");
                }
            } catch (FormularioException e) {
                System.out.println(e.getMessage());
                dato.nextLine();
            }
        }

    }

    public void iniciarVistaConsola() {
        Menu1op option1 = null;
        String opcionUser = "";

        System.out.println("\t Bienvenido" + "\n " + "\t A continuacion debera ingresar los candidatos \n");
        pedirDatos();
        while (true) {
            opcionUser = this.dato.nextLine();
            menu1();
            opcionUser = dato.nextLine();
            option1 = Menu1op.valueOf(opcionUser);
            switch (option1) {
                case A:
                    cleanScreen();
                    pedirDatos();
                    break;
                case B: // update
                    dato.nextLine();
                    cleanScreen();
                    actualizar();
                    break;
                case C: // delete
                    cleanScreen();
                    System.out.println("\n Ingresa la identificacion del candidato que quieres borrar: ");
                    String id = dato.nextLine();
                    controlador.deleteCandidato(id);
                    break;
                case D: // search
                    break;
                case E: // Listar candidatos
                    //StringBuilder datos = controlador.mostrarCandidatos();
                    System.out.println("Candidatos");
                    //System.out.println(datos.toString());
                    break;
                case F: //   continuar votacion
                    break;
                default:
                    cleanScreen();
                    System.out.println("\tIngrese una opcion valida\n");
            }
        }
    }
}
