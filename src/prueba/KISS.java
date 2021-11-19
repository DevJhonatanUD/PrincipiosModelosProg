package prueba;

import java.util.Scanner;

public class KISS {
	
	
	
	//Atributos
	
	
	//En el primer método solo utilizamos Switch y return

	public String diasemana1(int numDia) {
	
	    switch (numDia)
	    {
	        case 1: return "El dia "+numDia+" corresponde al LUNES"; 
	        case 2: return "El dia "+numDia+" corresponde al MARTES";
	        case 3: return "El dia "+numDia+" corresponde al MIERCOLES";
	        case 4: return "El dia "+numDia+" corresponde al JUEVES";
	        case 5: return "El dia "+numDia+" corresponde al VIERNES";
	        case 6: return "El dia "+numDia+" corresponde al SÁBADO";
	        case 7: return "El dia "+numDia+" corresponde al DOMINGO";
	        default: return "El número "+numDia +" esta fuera del rando de 1 a 7";
	    }
	    
	   
	}
	
	
	
	//Por otro lado, en el segundo método utilizamos arreglos, operaciones matemáticas, y retornos 
	
	public String diasemana2(int diaSemana)
	{
	    if ((diaSemana < 1) || (diaSemana > 7))
	        return "El número debe estar entre el 1 y el 7";
	 
	    final String[] Dias = {
	        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	 
	    return Dias[diaSemana-1];
	}
	
	//ambos cumplen la misma función
}
