package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.C_origen;
import model.FormularioException;
import controller.Controlador;
import model.Menu1op;

public class VistaConsola implements VistaGeneral {
    public String nombre, cedula, ciudad, partido, inclinacion, voto;
    public ArrayList<String> promesas = new ArrayList<String>();
    public Controlador controlador = new Controlador();
    public boolean flag = false;
    public int index = 0;

    public VistaConsola() {
    }

    public void menu1() {
        System.out.println("   [C R U D] \n");
        System.out.println("[A]<- Insertar candidato \n");
        System.out.println("[B}<- Actualizar candidato \n");
        System.out.println("[C]<- Eliminar candidato \n");
        System.out.println("[D]<- Buscar candidato \n");
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

    public void enterToContinue() {
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
                votacion();
                enterToContinue();
                break;
            }
            default:
                System.out.println("Selecciona una opcion valida");
                break;
        }
    }

    public void buscar() {
        Scanner dato = new Scanner(System.in);
        String target;
        System.out.println("Ingresa la cedula del candidato");
        target = dato.nextLine();
        if (controlador.buscarCandidato(target) == null) {
            System.out.println("");
        }
        System.out.println(controlador.buscarCandidato(target).listarDatos());
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

    public void menuVotaciones(Menu1op opciones) {
        
        switch (opciones) {
            case A: {
                System.out.println(controlador.getGanador().listarDatos());
                enterToContinue();
                break;
            }
            case B: {
                cleanScreen();
                System.out.println(controlador.getPartidoMasCandidatos());
                enterToContinue();
                break;
            }
            case C: {
                cleanScreen();
                System.out.println(controlador.getTopciudades().toString());
                
                enterToContinue();
                break;
            }
            case D:{
                cleanScreen();
                System.out.println("Saliendo del programa!!");
                this.flag=true;
            }
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

    public void votacion() {
        Scanner dato = new Scanner(System.in);
        while (true) {
            System.out.println("Digite los votos de:" + controlador.getCandidato(index).getNombre());
            voto = dato.nextLine();
            controlador.votacion(index, voto);
            if (controlador.getCandidato(index + 1) != null) {
                index++;
            } else
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
        this.flag = false;
        while(flag != true){
        System.out.println("[A]<- Ver Ganador \n");
        System.out.println("[B}<- Partido con más candidatos \n");
        System.out.println("[C]<- Top 3 ciudades con menos candidatos \n");
        System.out.println("[D]<- Salir del programa \n");
        opcionUser = dato.nextLine();
        menuVotaciones(Menu1op.valueOf(opcionUser)); 
        }
    }
}
