package Act1;

import java.util.Scanner;

// Indica si los dos valores añadidos por consola son mayor, menor o igual.

public class MayorMenorQue 
{

	public static void main(String[] args) 
	{

				Scanner sc= new Scanner(System.in);
				
				//Pedimos variables String
				
				System.out.println("--Introduce las dos variables--");
				
				System.out.print("Número 1: ");
				String num1_texto = sc.nextLine();
				
				System.out.print("Número 2: ");
				String num2_texto = sc.nextLine();
				
				sc.close();
				
				//Cambiamos de String a Integer
				
				int Num1 = Integer.parseInt(num1_texto);
				int Num2 = Integer.parseInt(num2_texto);

			if(Num1>Num2) 
			
			{
				System.out.print("El número "+Num1+" és mayor que el número "+Num2);
			}
			
			else if(Num1<Num2)
			{
				System.out.print("El número "+Num1+" és menor que el número "+Num2);

			}
			
			else 
			{
				System.out.print("El número "+Num1+" és igual que el número "+Num2);

			}	
	}

}
