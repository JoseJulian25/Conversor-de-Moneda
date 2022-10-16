package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class ConversorDeMonedas {
	/**
	 * Esta clase tendra todos los metodos para convertir el valor en cualquier moneda
	 * @param valor
	 */
	public void ConvertirPesosDominicanosADolar(double valor){
		/**
		 * Este metodo recibira el valor que el usuario ingresa y se dividira por el valor
		 * de la moneda a la que quiere convertir, de esta forma el valor sera convertido
		 * a la moneda elegida.
		 */
		double monedaValor = valor / 53.35;
		monedaValor = (double) Math.round(monedaValor * 100d / 100);
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaValor + " Dolares");
	}
	
	public void ConvertirPesosDominicanosAEuro(double valor){
		double monedaValor = valor / 53.18;
		monedaValor = (double) Math.round(monedaValor * 100.00 / 100.00);
		JOptionPane.showMessageDialog(null, "Tienes €" + monedaValor + " Euros");
	}
	public void ConvertirPesosDominicanosALibrasEsterlinas(double valor){
		double monedaValor = valor / 62.70;
		monedaValor = (double) Math.round(monedaValor * 100.00 / 100.00);
		JOptionPane.showMessageDialog(null, "Tienes £" + monedaValor + " Libras Esterlinas");
	}
	public void ConvertirPesosDominicanosAYenJapones(double valor){
		double monedaValor = valor / 0.39;
		monedaValor = (double) Math.round(monedaValor * 100.00 / 100.00);
		JOptionPane.showMessageDialog(null, "Tienes ¥" + monedaValor + " Yen Japones");
	}
	public void ConvertirPesosDominicanosAWonSulCoreano(double valor){
		double monedaValor = valor / 0.040;
		monedaValor = (double) Math.round(monedaValor * 100.00 / 100.00);
		JOptionPane.showMessageDialog(null, "Tienes ₩" + monedaValor + " Won Sur-Coreano");
	}
}
