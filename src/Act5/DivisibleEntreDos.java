package Act5;

import javax.swing.JOptionPane;

public class DivisibleEntreDos 
{

	public static void main(String[] args) 
	{

		String numero_texto=JOptionPane.showInputDialog("Escriba un número ");
		
		
		int Numero = Integer.parseInt(numero_texto);
		int resto;
		
		resto=Numero%2;
		
		
		if(resto==0) 
		{
			JOptionPane.showMessageDialog(null, "Felicidades "+Numero+" es divisible entre 2!");		

		}
		
		else 
		{
			JOptionPane.showMessageDialog(null, "Lo siento, "+Numero+" no es divisible entre 2!");		

		}
		
	}

}
