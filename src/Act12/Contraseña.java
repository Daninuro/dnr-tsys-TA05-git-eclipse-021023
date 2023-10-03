package Act12;

import javax.swing.JOptionPane;


public class Contraseña 
{

	public static void main(String[] args) 
	{
		String contraseña_texto=JOptionPane.showInputDialog("Escriba una contraseña ");
		
		int contador=1;
		
		
		JOptionPane.showMessageDialog(null, "---Solo tienes 3 intentos---");		

		
		
		while(contador<=3) 
		{
			
			String introduce_texto=JOptionPane.showInputDialog("Intento número "+contador+":     \n--Introduce la contraseña-- ");
			
						
			if(introduce_texto.equals(contraseña_texto)) 
			{
				
				JOptionPane.showMessageDialog(null, "Enhorabuena has ganado");
				break;
				
			}
			else if(contador==3) 
			{
				JOptionPane.showMessageDialog(null, "Perdiste");
				contador++;

			}
			
			else
			{
				
				JOptionPane.showMessageDialog(null, "Lastima, otra oportunidad");	
				contador++;
				
			}

		}
		
		 if (contador>=4)
		{
			 
			JOptionPane.showMessageDialog(null, "Lo siento te has quedado sin intentos");	

		}
	}
}
