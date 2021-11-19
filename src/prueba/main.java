package prueba;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;

		Scanner entrada = new Scanner(System.in);

		//Establecemos las opciones como men� de principios
		do {
			System.out.println("\n\tPrincipios");
			System.out.println("1. KISS");
			System.out.println("2. Liskov Substitution (LSP)");
			System.out.println("5. Salir");
			System.out.println("\nDigite la opcion que desea ver: ");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				KISS Beso = new KISS();
				
				System.out.println("\nEl principio de KISS nos dice que no debemos complicarnos"
						+ "\na la hora de escribir el c�digo en este caso se pide un n�mero, que ser� "
						+ "\nel dia de la semana correspondiente, en consola se imprimira dos veces el"
						+ "\nresultado, aunque el primer m�todo simplemente utilice switch y return"
						+ "\nel otro m�todo, utiliza operaciones matem�ticas y arreglos: ");
				System.out.println("\nIngrese un n�mero 1-7");
				int NumDia = entrada.nextInt();
				System.out.println("\nMetodoUno:\n" + Beso.diasemana1(NumDia));
				System.out.println("\nMetodoDos:\n" + Beso.diasemana2(NumDia));
				break;

			case 2:
				System.out.println("\n El principio de Liskov Substitution (LSP) nos dice que"
						+ "\nsi en alguna parte de nuestro c�digo estamos usando una clase, "
						+ "\ny esta clase es extendida, tenemos que poder utilizar cualquiera de"
						+ "\nlas clases hijas y que el programa siga siendo v�lido.");

				System.out.println("\n En este ejemplo vamos a tener dos clases, una PROFESOR y otra ESTUDIANTE,"
						+ "\nla cual ESTUDIANTE va a ser la que le herede a PROFESOR, en la clase PROFESOR tenemos un "
						+ "\nparametro llamado Salario, que vamos a iniciar en 100.000, y dos m�todos, uno para que el"
						+ "\nProfesor retire el dinero ganado semanalmente, y otro que le muestre en consola, cuanto "
						+ "\ndinero le queda en la cuenta, lo cual son cosas irrelevantes para Estudiante, pero aun asi"
						+ "\nlas puede usar: ");

				int Seleccion;
				do {
					System.out.println("\n\nEs usted \n1. Profesor\n2. Estudiante\n3. Salir");

					Seleccion = entrada.nextInt();

					switch (Seleccion) {

					case 1:
						LiskovProfesor LiskovP = new LiskovProfesor();
						LiskovP.pedirSalario();
						LiskovP.mostrarSalario();
						break;

					case 2:
						LiskovEstudiante LiskovE = new LiskovEstudiante();
						LiskovE.metodoSobrante();

					}

				} while (Seleccion != 3);

				break;
			case 3:
				System.out.println("jaja");
				break;
			case 4:
				System.out.println("jaja");
				break;
			case 5:

				break;

			}

		} while (opcion != 5);

	}

}
