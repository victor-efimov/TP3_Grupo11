package ar.edu.unju.escmi.tp3.ejercicio3;
 
import java.util.Scanner;
 
public class Ejercicio3 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int opcion;
 
        do {
            System.out.println("----- MENU -----");
            System.out.println("1- Crear empleado");
            System.out.println("2- Aumentar Salario");
            System.out.println("3- Mostrar los datos del empleado");
            System.out.println("4- Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
 
            switch (opcion) {
 
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = sc.nextLine();
 
                    System.out.print("Ingrese el legajo: ");
                    int legajo = sc.nextInt();
 
                    System.out.print("Ingrese el salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
 
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado correctamente.");
                    break;
 
                case 2:
                    if (empleado == null) {
                        System.out.println("Todavia no se creo ningun empleado.");
                    } else {
                        System.out.print("Ingrese el legajo del empleado a aumentar: ");
                        int legajoBuscado = sc.nextInt();
                        sc.nextLine();
 
                        if (legajoBuscado == empleado.getLegajo()) {
                            empleado.aumentar();
                            System.out.println("Salario aumentado correctamente.");
                        } else {
                            System.out.println("No se encontro un empleado con ese legajo.");
                        }
                    }
                    break;
 
                case 3:
                    if (empleado == null) {
                        System.out.println("No se creo ningun empleado.");
                    } else {
                        empleado.mostrar();
                    }
                    break;
 
                case 4:
                    System.out.println("Saliendo...");
                    break;
 
                default:
                    System.out.println("¡¡¡Opcion invalida!!!");
            }
 
        } while (opcion != 4);
 
        sc.close();
    }
}