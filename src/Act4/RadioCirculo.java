package Act4;

import java.util.Scanner;


public class RadioCirculo 
{

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("--Vamos a calcular el área de un circulo--");
		System.out.print("Introduce el radio: ");
		
		
		String radio_texto = sc.nextLine();
		sc.close();
		
		
		//Pasamos de String a Double
		double Radio = Double.parseDouble(radio_texto);
		
		
		//Calculamos área del circulo
		double Area = Math.PI * Math.pow(Radio, 2);
		
		
		
		System.out.println("El área del circulo és de: "+Area);

		
	}

}
