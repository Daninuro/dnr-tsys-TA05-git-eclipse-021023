package Act13;

import javax.swing.JOptionPane;


public class Calculadora 
{

	public static void main(String[] args) 
	{
		
		JOptionPane.showMessageDialog(null, "----Añade 2 números----");

		String num1_texto=JOptionPane.showInputDialog("Asignale valor a el primer número: ");
		String num2_texto=JOptionPane.showInputDialog("Asignale valor a el segundo número: ");
		String signo_texto=JOptionPane.showInputDialog("Asignale la operación que quieres hacer: \n --- (   +   -   *   /   ^   %   ) --- ");
		
		
		int Num1=Integer.parseInt(num1_texto);
		int Num2=Integer.parseInt(num2_texto);
		

		switch(signo_texto) 
		
		{
		case "+":
			JOptionPane.showMessageDialog(null, Num1+Num2);
			break;
		case "-":
			JOptionPane.showMessageDialog(null, Num1-Num2);
			break;
		case "*":
			JOptionPane.showMessageDialog(null, Num1*Num2);
			break;
		case "/":
			JOptionPane.showMessageDialog(null, Num1/Num2);
			break;
		case "^":
			JOptionPane.showMessageDialog(null, Num1^Num2);
			break;
		case "%":
			JOptionPane.showMessageDialog(null, Num1%Num2);
			break;

		}
	}
}
