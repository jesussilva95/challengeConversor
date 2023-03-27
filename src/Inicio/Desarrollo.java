package Inicio;


import javax.swing.JOptionPane;

import conversorMonedas.CurrencyConverter;

public class Desarrollo {
	public void Inicio(){
	Object [] opciones = {"Conversor de Moneda","Conversor de Temperatura"}; 
	Object opcionElegir = JOptionPane.showInputDialog(null,"Seleccione una"
			+ "opción de conversión", "Menu",JOptionPane.QUESTION_MESSAGE,null,opciones,
			opciones[0]);
	String opcionElegida = (String) opcionElegir;
	
	 
	if (opcionElegida != null ) {
		switch(opcionElegida) {
		case "Conversor de Moneda":
			CurrencyConverter conversorMoneda = new CurrencyConverter();
			conversorMoneda.converter();
			break;
			
		case "Conversor de Temperatura":
			conversorTemperatura.TemperatureConverter temperatureConverter = new conversorTemperatura.TemperatureConverter();
			temperatureConverter.temperature();
			break;
			default:
				break;
	}
	}
	}
}
