package ar.edu.unju.escmi.tp3.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int cantidadClientes = 0;
        int opcion = 0;
        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1.Crear cliente");
            System.out.println("2.Mostrar los datos de un cliente");
            System.out.println("3.Mostrar todos los clientes");
            System.out.println("4.Mostrar todos los clientes por categoria");
            System.out.println("5.Salir");
            System.out.print("Ingrese una opcion: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Opcion no valida.");
                scanner.nextLine();
                continue;
            }
            switch (opcion) {
                case 1:
                    if (cantidadClientes < clientes.length) {
                        System.out.print("Ingresa DNI: ");
                        String dni = scanner.nextLine();
                        System.out.print("Ingresa Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingresa Categoria : ");
                        char categoria = scanner.nextLine().charAt(0);
                        clientes[cantidadClientes] = new Cliente(dni, nombre, categoria);
                        cantidadClientes++;
                        System.out.println("Cliente registrado");
                    } else {
                        System.out.println("Capacidad maxima del arreglo alcanzada (4 clientes).");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el DNI a buscar: ");
                    String dniBuscar = scanner.nextLine();
                    boolean encontradoDni = false;
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getDni().equalsIgnoreCase(dniBuscar)) {
                            System.out.println("Cliente encontrado: " + clientes[i].toString());
                            encontradoDni = true;
                            break;
                        }
                    }
                    if (!encontradoDni) {
                        System.out.println("No se encontro el dni");
                    }
                    break;
                case 3:
                    if (cantidadClientes == 0) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        System.out.println("\nLISTA DE TODOS LOS CLIENTES");
                        for (int i = 0; i < cantidadClientes; i++) {
                            System.out.println(clientes[i].toString());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la categoria a buscar: ");
                    char catBuscar = scanner.nextLine().charAt(0);
                    boolean encontradoCat = false;
                    System.out.println("\n--- CLIENTES EN CATEGORIA '" + catBuscar + "' ---");
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (Character.toUpperCase(clientes[i].getCategoria()) == Character.toUpperCase(catBuscar)) {
                            System.out.println(clientes[i].toString());
                            encontradoCat = true;
                        }
                    }
                    if (!encontradoCat) {
                        System.out.println("No hay clientes en esa categoria.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}