
import javax.swing.*;

import ConversorDeMonedas.OpcionesConversion;
public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion(); 
		
		/**
		 * Se crea una instancia de Opciones de conversion que contiene las opciones de 
		 * convertidor
		 */
		
		boolean validar = true;
		
		while(validar) {
			String opciones = JOptionPane.showInputDialog(null, "Selecciones una opcion de conversion"
					, "menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de "
							+ "monedas", "Conversor de temperatura"}, "Elegir").toString();
			switch(opciones) {
			case "Conversor de monedas":
				
				try {
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				
				/**
				 * El valor ingresado en el input se convertira en un double
				 */
				
				conversion.ConvertirMonedas(valorRecibido);
				}
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Valor Invalido", "WARNING_MENSSAGE" , JOptionPane.WARNING_MESSAGE);
					/**
					 * Si al ingresar valor detecta que es de otro tipo que no sea numero lanzara
					 * un mensaje de Valor Invalido, de esta forma se haria una validacion.
					 */
				}
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
				if(JOptionPane.OK_OPTION == respuesta) {
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
					validar = false;
					
				}
				break;
			}
			
		}
	}
}
