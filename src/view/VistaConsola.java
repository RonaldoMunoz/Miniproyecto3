package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.C_origen;
import model.FormularioException;
import controller.Controlador;

public class VistaConsola implements VistaGeneral {
    public String nombre, cedula, ciudad, partido, inclinacion;
    public ArrayList<String> promesas = new ArrayList<String>();
    public Controlador controlador = new Controlador();
    public boolean flag = false;

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

    public void delete() {
        Scanner dato = new Scanner(System.in);
        System.out.println("\n Ingresa la identificacion del candidato que quieres borrar: ");
        String id = dato.nextLine();
        controlador.deleteCandidato(id);
    }

    public void listar() {
        System.out.println(controlador.mostrarCandidatos().toString());
    }

    public void enterToContinue(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Enter Para continuar");
        dato.nextLine();
    }

    public void solicitarDatos(Menu1op opciones) {
        Scanner dato = new Scanner(System.in);
        switch (opciones) {
            case A: {
                cleanScreen();
                pedirDatosCandidato();
                enterToContinue();
                break;
            }
            case B: {
                cleanScreen();
                actualizar();
                enterToContinue();
                break;
            }
            case C: {
                cleanScreen();
                delete();
                enterToContinue();
                break;
            }
            case D: {
                cleanScreen();
                buscar();
                enterToContinue();
                break;
            }
            case E: {
                cleanScreen();
                listar();
                enterToContinue();
                break;
            }
            case F: {
                this.flag = true;
                enterToContinue();
                break;
            }
            default:
                System.out.println("Selecciona una opcion valida");
                break;
        }
    }

    public String buscar() {
        Scanner dato = new Scanner(System.in);
        String target;
        System.out.println("Ingresa la cedula del candidato");
        target = dato.nextLine();
        if(controlador.buscarCandidato(target) == null){
            return "";
        }
        return controlador.buscarCandidato(target).listarDatos();
    }

    public void actualizar() {
        Scanner dato = new Scanner(System.in);
        String target;
        try {
            System.out.println("Ingresa la cedula del candidato que vas a actualizar");
            target = dato.nextLine();
            if (controlador.buscarCandidato(target) != null) {
                pedirDatosUpdate();
                controlador.updateCandidato(controlador.buscarCandidato(target), getNombre(), getCedula(),
                        getCiudad().toUpperCase(), getPartido().toUpperCase(), getInclinacion().toUpperCase(),
                        getPromesas());
            } else {
                throw new FormularioException("No se ha encontrado el candidato");
            }
        } catch (FormularioException e) {
            System.out.println(e.getMessage());
        }
    }

    public void pedirDatosUpdate() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el nombre del candidato:");
        System.out.println("\t");
        this.nombre = dato.nextLine();

        System.out.println("Ingresa la cedula del candidato:");
        System.out.println("\t");
        this.cedula = dato.nextLine();

        System.out.println("Ingresa la ciudad del candidato:");
        System.out.println("\t");
        this.ciudad = dato.nextLine();

        System.out.println("Ingresa el partido del candidato:");
        System.out.println("\t");
        this.partido = dato.nextLine();

        System.out.println("Ingresa la inclinacion del candidato:");
        System.out.println("\t");
        this.inclinacion = dato.nextLine();

        System.out.println("Ingresa las promesas del candidato:");
        System.out.println("\t");
        String prom = dato.nextLine();
        this.promesas.add(prom);
    }

    public void pedirDatosCandidato() {
        Scanner dato = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresa el nombre del candidato:");
            System.out.println("\t");
            this.nombre = dato.nextLine();

            System.out.println("Ingresa la cedula del candidato:");
            System.out.println("\t");
            this.cedula = dato.nextLine();

            System.out.println("Ingresa la ciudad del candidato:");
            System.out.println("\t");
            this.ciudad = dato.nextLine();

            System.out.println("Ingresa el partido del candidato:");
            System.out.println("\t");
            this.partido = dato.nextLine();

            System.out.println("Ingresa la inclinacion del candidato:");
            System.out.println("\t");
            this.inclinacion = dato.nextLine();

            System.out.println("Ingresa las promesas del candidato:");
            System.out.println("\t");
            String prom = dato.nextLine();
            this.promesas.add(prom);
            controlador.addCandidato(getNombre(), getCedula(), getPartido().toUpperCase(),
                    getCiudad().toUpperCase(), getPromesas(), getInclinacion().toUpperCase());
            return;
        }
    }

    public void iniciarVistaConsola() {
        cleanScreen();
        Scanner dato = new Scanner(System.in);
        Menu1op option1 = null;
        String opcionUser;
        System.out.println("\t Bienvenido" + "\n " + "\t A continuacion debera ingresar los candidatos \n");
        while (flag != true) {
            menu1();
            System.out.println("Digita una opcion");
            opcionUser = dato.nextLine();
            try {
                solicitarDatos(Menu1op.valueOf(opcionUser));
            } catch (IllegalArgumentException e) {
                System.out.println("Seleccione una opcion valida");
            }

        }
    }
}
