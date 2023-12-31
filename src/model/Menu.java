package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {

    public Menu() {
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

    public void menu2(ArrayList<Candidato> candidato) {
        Scanner dato = new Scanner(System.in);
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i) != null) {
                System.out.println("Ingrese los votos del candidato: \n");
                candidato.get(i).listarDatos();
                System.out.println("N. Votos: \n");
                int votos = dato.nextInt();
                candidato.get(i).setN_votos(votos);
            }
        }
        dato.close();
    }
    public void mostrarEnums(){
        ArrayList<String> nombresEnum = new ArrayList<>();
        
        for (C_origen ciudad : C_origen.values()) {
            nombresEnum.add(ciudad.displayNameEnum());
        }
        for (String nombre : nombresEnum) {
            System.out.println("\t"+nombre+ " ");
        }
    }
    public void mostrarEnumsP(){
        ArrayList<String> nombresEnum = new ArrayList<>();
        
        for (Partido_p partido : Partido_p.values()) {
            nombresEnum.add(partido.displayNameEnum());
        }
        for (String nombre : nombresEnum) {
            System.out.println("\t"+nombre+ " ");
        }
    }

    public static String capitalizeString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
    }

    public void cleanScreen() {
        System.out.print("\033[H\033[2J"); /* Limpiar consola */
        System.out.flush();
    }
    
    public void propuestaAdd(ArrayList<String> promesas) {
        Scanner prop = new Scanner(System.in);
        String promesa = "";
        System.out.println("Agrege su propuesta");
        do {
            promesa = prop.nextLine();
            promesas.add(promesa);
            System.out.println("Propuesta ingresada con exito... \n");
            System.out.println("Si desea agregar una promesa digite -> [S] \n De lo contrario digite -> [N]");
            promesa = prop.nextLine().toUpperCase();
            if (promesa.equals("N")) {
                break;
            } else if (promesa.equals("S")) {
                promesa = " ";
            } else {
                System.out.println("Digite una opcion valida");
            }

        } while (true);

    }

    public void insertCandidato(ArrayList<Candidato> candidato) {
        String request = " ";
        Partido_p p1 = null;
        C_origen c1 = null;
        Inclinacion inclinacion = null;
        Scanner dato = new Scanner(System.in);
        while (true) { 
            System.out.println("Ingrese el nombre del candidato:");
            String nombre = dato.nextLine();
            nombre = capitalizeString(nombre);
            System.out.println("Ingrese la identificación del candidato:");
            String identificacion = dato.nextLine();
            do {
                try {
                    mostrarEnums();
                    System.out.println("Ingrese la ciudad de origen del candidato:");
                    String c_origen = dato.nextLine().replace(" ", "_");
                    c_origen.replace(" ", "_");
                    c1 = C_origen.valueOf(c_origen.toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Ingrese una ciudad valida");
                }
            } while (true);
            do {
                try {
                    mostrarEnumsP();
                    System.out.println("Ingrese el partido politico al que pertenece:");
                    String partido_politico = dato.nextLine().replace(" ", "_");
                    p1 = Partido_p.valueOf(partido_politico.toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Digite una opcion valida");
                }

            } while (true);
            ArrayList<String> promesas = new ArrayList<>();
            propuestaAdd(promesas);

            do {
                try {
                    System.out.println("Ingrese Su inclinacion politica: Derecha o Izquierda");
                    String inclinacion_p = dato.nextLine().replace(" ", "_");
                    inclinacion = Inclinacion.valueOf(inclinacion_p.toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Digite una opcion valida");
                }
            } while (true);
            candidato.add(new Candidato(nombre, identificacion, c1, p1, promesas, inclinacion, 0));
            System.out.println("Agregamos otro candidato? s/n");
            request = dato.nextLine();
            if(request.equals("n")){
                break;
            }
        }
    }

    public void actualizarCandidato(ArrayList<Candidato> candidato) {
        Scanner target = new Scanner(System.in);
        Scanner dato = new Scanner(System.in);
        String inclinacion_p;
        System.out.println("Digite el nombre del candidato que desea actualizar;... \n");
        String buscar = target.nextLine();
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i) != null) {
                if (candidato.get(i).getNombre().equals(buscar)) {
                    System.out.println("Se va actualizar el candidato:" + candidato.get(i).getNombre());
                    Partido_p p1 = null;
                    C_origen c1 = null;
                    Inclinacion inclinacion = null;
                    System.out.println("Ingrese el nombre del candidato:");
                    String nombre = dato.nextLine();
                    nombre = capitalizeString(nombre);
                    System.out.println("Ingrese la identificación del candidato:");
                    String identificacion = dato.nextLine();
                    do {
                        try {
                            mostrarEnums();
                            System.out.println("Ingrese la ciudad de origen del candidato:");
                            String c_origen = dato.nextLine().replace(" ", "_");
                            c_origen.replace(" ", "_");
                            c1 = C_origen.valueOf(c_origen.toUpperCase());

                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Ingrese una ciudad valida");
                        }
                    } while (true);
                    do {
                        try {
                            mostrarEnumsP();
                            System.out.println("Ingrese el partido politico al que pertenece");
                            String partido_politico = dato.nextLine().replace(" ", "_");
                            p1 = Partido_p.valueOf(partido_politico.toUpperCase());
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Digite una opcion valida");
                        }

                    } while (true);
                    ArrayList<String> promesas = new ArrayList<>();
                    propuestaAdd(promesas);
                    do {
                        try {
                            System.out.println("Ingrese Su inclinacion politica;....");
                            inclinacion_p = dato.nextLine();
                            inclinacion = Inclinacion.valueOf(inclinacion_p.toUpperCase());
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Digite una opcion valida");
                        }
                    } while (true);

                    candidato.get(i).setNombre(nombre);
                    candidato.get(i).setCedula(identificacion);
                    candidato.get(i).setC_origen(c1);
                    candidato.get(i).setInclinacion(inclinacion);
                    candidato.get(i).setPromesas(promesas);
                    candidato.get(i).setPartido_politico(p1);
                }
            } else {
                System.out.println("El usuario no fue encontrado.\n Revisa si escribiste su nombre bien");
            }

        }

    }

    public void buscarCandidato(ArrayList<Candidato> candidato) {
        Scanner target = new Scanner(System.in);
        System.out.println("Digite el nombre del candidato que desea buscar;... \n");
        String buscar = target.nextLine();
        boolean find = false;
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i) != null) {
                if (candidato.get(i).getNombre().equals(buscar)) {
                    find = true;
                    candidato.get(i).listarDatos();
                }
            }
        }
        if (!find) {
            System.out.println("No se encontro el candidato");
        }
    }

    public void eliminarCandidato(ArrayList<Candidato> candidato) {
        Scanner target = new Scanner(System.in);
        System.out.println("Digite el numero de cedula del candidato que desea eliminar;... \n");
        String buscar = target.nextLine();
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i) != null) {
                if ((candidato.get(i).getCedula()).equals(buscar)) {
                    candidato.get(i).listarDatos();
                    System.out.println(" Ha sido eliminado con exito \n");
                    candidato.remove(i);
                    break;
                }
                else{
                    System.out.println("El candidato con la cedula:"+ buscar + "no se ha encontrado");
                }
            }
        }

    }

    public boolean nullArray(ArrayList<Candidato> candidato) {
        for (int i = 0; i < candidato.size(); i++) {
            if (candidato.get(i) != null) {
                return false;
                // Si encontramos un elemento no nulo, salimos del bucle
            }
        }
        return true;
    }

    public void votacion(ArrayList <Candidato> candidato) {
        Scanner votos = new Scanner(System.in);
        while (true) {
            try {
                for (int i = 0; i < candidato.size(); i++) {
                    if (candidato.get(i) != null) {
                        System.out.println("Ingrese el número de votos para " + candidato.get(i).getNombre() + ": ");
                        int voto = votos.nextInt();
                        candidato.get(i).setN_votos(voto);
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Haz ingresado un tipo de dato no valido\n");
                votos.nextLine(); /* Limpiamos el buffer */
            }
        }
    }

}
