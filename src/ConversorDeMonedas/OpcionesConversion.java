package ConversorDeMonedas;

import javax.swing.*;
public class OpcionesConversion {
	/**
	 * Esta clase se encarga de crear las opciones y llamar a otra clase
	 */
	ConversorDeMonedas moneda = new ConversorDeMonedas();
	/**
	 * Se crea una instancia de conversor de moneda que contiene todos los metodos de 
	 * convertir.
	 * @param valor
	 */
	
	public void ConvertirMonedas(double valor){
		/**
		 * Este metodo tendra un objeto con las diferentes opciones que el usuario querra 
		 * convertir la moneda, se le asigna el parametro valor que sera el valor que el
		 * usuario ingrese.
		 */
		String opciones = (JOptionPane.showInputDialog(null, "Elige la moneda que deseas convertir", 
				"monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De pesos a Dolar", "De pesos a Euros", "De pesos a Libras Esterlinas",
				"De pesos a Yen Japones", "De pesos a Won Sul-coreano"},"Seleccion")).toString();
		
		switch(opciones) {
		/**
		 * Mientras se elija una opcion del input esta verificara cual se elijio y en ese
		 * caso que metodo tendria que utilizar
		 */
		case "De pesos a Dolar":{
			moneda.ConvertirPesosDominicanosADolar(valor);
			break;
		}
		case "De pesos a Euros" : {
			moneda.ConvertirPesosDominicanosAEuro(valor);
			break;
		}
		case "De pesos a Libras Esterlinas" : {
			moneda.ConvertirPesosDominicanosALibrasEsterlinas(valor);
			break;
		}
		case "De pesos a Yen Japones" : {
			moneda.ConvertirPesosDominicanosAYenJapones(valor);
			break;
		}
		case "De pesos a Won Sul-coreano" : {
			moneda.ConvertirPesosDominicanosAWonSulCoreano(valor);
			break;
		}
		
		
		}
	}
	
}
