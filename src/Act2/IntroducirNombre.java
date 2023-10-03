package Act2;

import java.util.Scanner;

public class IntroducirNombre 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		//Pedimos variables String
		
		System.out.print("Introduce tu nombre: ");

		String nombre_texto = sc.nextLine();
		sc.close();
		
		System.out.println("Bienvenido "+nombre_texto+"!");
		
		//Para pasar el nombre a mayusculas
		
		// System.out.println("Bienvenido "+nombre.toUpperCase()+"!");

		
		
	}

}
