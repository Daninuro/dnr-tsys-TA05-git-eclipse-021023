package Act6;

import javax.swing.JOptionPane;


public class PrecioConIVA 
{

	public static void main(String[] args) 
	{

		double IVA = 0.21;
		double iva, resultado;
		
		String numero_texto=JOptionPane.showInputDialog("Introduzca el precio del producto");
		
		int numero=Integer.parseInt(numero_texto);
		
		iva=numero*IVA;
		resultado=numero+iva;
		
		
		JOptionPane.showMessageDialog(null, "El precio con IVA del producto és de, "+resultado+"€");		

		
		
	}

}
