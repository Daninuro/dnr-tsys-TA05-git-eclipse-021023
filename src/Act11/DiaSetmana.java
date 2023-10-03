package Act11;

import javax.swing.JOptionPane;


public class DiaSetmana 
{

	public static void main(String[] args) 
	{
		
		
		String dia_texto=JOptionPane.showInputDialog("Que día es hoy?");
	
		
		switch (dia_texto) 
		{
		
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día laboral");		
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día laboral");		
			break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día laboral");		
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día laboral");		
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día laboral");		
			break;
		case "Sabado":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día NO laboral");		
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "Hoy és, "+dia_texto+" y es día NO laboral");		
			break;
		default:
			JOptionPane.showMessageDialog(null, "El día introducido no es correcto");		

			
		
		
		}
		
	}

}
