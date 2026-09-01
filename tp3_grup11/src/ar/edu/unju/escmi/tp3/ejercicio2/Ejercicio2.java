package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;
public class Ejercicio2{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		GatoSimple gato = null;
		GatoSimple gatoContrincante = null;
		String comida,nombre,raza,color,tamaño,color_Ojos,pelaje;
		int op,edad,peso;
		boolean sexo;
		do {
			System.out.println("----- MENU -----");
            System.out.println("1- Crear gato simple");
            System.out.println("2- Dar de comer a gato simple");
            System.out.println("3- Mostrar todos los gatos");
            System.out.println("4- Crear gato contrincante");
            System.out.println("5- Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
		
		switch (op) {
		case 1:
			System.out.print("Ingrese el nombre del gato: ");
			nombre = sc.nextLine();

			System.out.print("Ingrese el peso del gato: ");
			peso = sc.nextInt();
			sc.nextLine();

			System.out.print("Ingrese la raza del gato: ");
			raza = sc.nextLine();

			System.out.print("Ingrese la edad del gato: ");
			edad = sc.nextInt();
			sc.nextLine();

			System.out.print("Ingrese el color del gato: ");
			color = sc.nextLine();

			System.out.print("Ingrese el sexo del gato (true para macho, false para hembra): ");
			sexo = sc.nextBoolean();
			sc.nextLine();

			System.out.print("Ingrese el tamaño del gato: ");
			tamaño = sc.nextLine();

			System.out.print("Ingrese el color de ojos del gato: ");
			color_Ojos = sc.nextLine();

			System.out.print("Ingrese el tipo de pelaje del gato: ");
			pelaje = sc.nextLine();
			
			gato = new GatoSimple(nombre,peso,raza,edad,color,sexo,tamaño,color_Ojos,pelaje);
			System.out.println("Gato simple creado con exito");
			break;
		case 2:
			System.out.println("Ingrese alimento: ");
			comida = sc.nextLine();
			gato.comer(comida);
		break;
		case 3:
			if (gato == null) {
				System.out.println("Gato simple no fue inicializado");
			}
			else
			{
				System.out.println(gato.toString());
			}
			if (gatoContrincante == null) {
				System.out.println("Gato contrincante no fue inicializado");
			}
			else {
				System.out.println(gatoContrincante.toString());;			}
		break;
		case 4:
			System.out.print("Ingrese el nombre del gato contrincante: ");
			nombre = sc.nextLine();

			System.out.print("Ingrese el peso del gato contrincante: ");
			peso = sc.nextInt();
			sc.nextLine();

			System.out.print("Ingrese la raza del gato contrincante: ");
			raza = sc.nextLine();

			System.out.print("Ingrese la edad del gato contrincante: ");
			edad = sc.nextInt();
			sc.nextLine();

			System.out.print("Ingrese el color del gato contrincante: ");
			color = sc.nextLine();

			System.out.print("Ingrese el sexo del gato contrincante (true para macho, false para hembra): ");
			sexo = sc.nextBoolean();
			sc.nextLine();

			System.out.print("Ingrese el tamaño del gato contrincante: ");
			tamaño = sc.nextLine();

			System.out.print("Ingrese el color de ojos del gato contrincante: ");
			color_Ojos = sc.nextLine();

			System.out.print("Ingrese el tipo de pelaje del gato contrincante: ");
			pelaje = sc.nextLine();
			
			gatoContrincante = new GatoSimple(nombre,peso,raza,edad,color,sexo,tamaño,color_Ojos,pelaje);
			System.out.println("Gato contrincante creado con exito");
			System.out.println("Peleando...");
			gato.pelear(gatoContrincante);
			break;
		case 5:
			System.out.println("Saliendo...");
		break;
		default:
			System.out.println("Ingrese una opcion valida");
		break;
		}
		
		}while (op != 5);
		sc.close();
		
	}
}