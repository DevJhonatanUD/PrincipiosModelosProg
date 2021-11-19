package prueba;

import java.util.Scanner;

public class LiskovProfesor {
	
	Scanner entrada = new Scanner(System.in);



		 public Double salario=800000.0;
		 Double retiro;
		public String Nombre;
		
		public void pedirSalario() {
			
			System.out.println("Digite el salario a retirar esta semana: (Saldo: $"+salario+")");
			retiro = entrada.nextDouble();
		}
		
		public void mostrarSalario() {
			System.out.println("El dinero que retiro es: $"+retiro+" le queda por retirar: $" +(salario-retiro) );
		}
		
		
		
		
	}



