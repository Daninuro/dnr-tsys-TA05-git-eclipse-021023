package Act10;

import javax.swing.JOptionPane;


public class Ventas 
{

	public static void main(String[] args) 
	{
		String numVentas_texto=JOptionPane.showInputDialog("Escriba un número de ventas que quiere realizar ");
		
		int Ventas = Integer.parseInt(numVentas_texto);
		int cantidadVentas=1;
		float suma=0;
		
		
		
		while (cantidadVentas<=Ventas) 
		{
			String precioArticulos_texto=JOptionPane.showInputDialog("Escriba el precio del articulo nº "+cantidadVentas);
			cantidadVentas++;
			
			
			float precioArticulo = Float.parseFloat(precioArticulos_texto);
			
			suma += precioArticulo;
			
			
			if(cantidadVentas>Ventas) 
			
			{
				//Resultado se muestra redondeando los ultimos decimales (2 decimales)
				JOptionPane.showMessageDialog(null, "El precio total de los "+Ventas+" articulos es igual a: "+Math.round(suma*100.0)/100.0+"€.");	

				
			}
			
		}

	}

}
