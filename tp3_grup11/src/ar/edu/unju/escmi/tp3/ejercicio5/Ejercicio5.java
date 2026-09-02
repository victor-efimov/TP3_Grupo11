package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Producto[] productos = new Producto[3];
        int contadorProductos = 0; 
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú de Gestión de Productos ---");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar los productos que superen un precio");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                 
                    if (contadorProductos < 3) {
                        Producto nuevoProducto = new Producto(); 
                        
                        System.out.print("Ingrese el código del producto: ");
                        nuevoProducto.setCodigo(scanner.nextInt()); 
                        scanner.nextLine(); 
                        
                        System.out.print("Ingrese la descripción: ");
                        nuevoProducto.setDescripcion(scanner.nextLine());
                        
                        System.out.print("Ingrese el precio: ");
                        nuevoProducto.setPrecio(scanner.nextDouble());
                        
                        productos[contadorProductos] = nuevoProducto;
                        contadorProductos++;
                        System.out.println("¡Producto creado y guardado con éxito!");
                    } else {
                        System.out.println("Error: La capacidad máxima del array (3 productos) ha sido alcanzada.");
                    }
                    break;

                case 2:
                    if (contadorProductos == 0) {
                        System.out.println("No hay productos cargados todavía.");
                    } else {
                        System.out.println("\n--- Lista de Productos ---");
                        for (int i = 0; i < contadorProductos; i++) {
                            System.out.println(productos[i].toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto a modificar: ");
                    int codigoBuscar = scanner.nextInt();
                    boolean encontrado = false;
                    
                    for (int i = 0; i < contadorProductos; i++) {
                        if (productos[i].getCodigo() == codigoBuscar) {
                            System.out.print("Ingrese el nuevo precio para " + productos[i].getDescripcion() + ": ");
                            double nuevoPrecio = scanner.nextDouble();
                            productos[i].setPrecio(nuevoPrecio);
                            System.out.println("¡Precio modificado con éxito!");
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("No se encontró ningún producto con ese código.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el precio límite a superar: ");
                    double precioLimite = scanner.nextDouble();
                    boolean hayMayores = false;
                    
                    System.out.println("\n--- Productos con precio mayor a $" + precioLimite + " ---");
                    for (int i = 0; i < contadorProductos; i++) {
                        if (productos[i].getPrecio() > precioLimite) {
                            System.out.println(productos[i].toString());
                            hayMayores = true;
                        }
                    }
                    
                    if (!hayMayores) {
                        System.out.println("No hay productos que superen ese precio.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }
}