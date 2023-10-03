package Act3;

import javax.swing.JOptionPane;

public class IntroducirNombrePanel 
{

	public static void main(String[] args) 
	{

		String nombre_texto=JOptionPane.showInputDialog("Hola, Introduce tu nombre por favor");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre_texto+"!");		
		
		
		//	Para pasar el nombre a mayusculas

		//JOptionPane.showMessageDialog(null, "Bienvenido "+nombre.toUpperCase()+"!");
		
	}

}
