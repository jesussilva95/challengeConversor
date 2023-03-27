package conversorTemperatura;



import javax.swing.JOptionPane;

import Inicio.Desarrollo;
import Inicio.mensajeFinal;

public class TemperatureConverter {
	public void temperature() {
		Object [] tipoDeTemperatura = {"Convertir Fahrenheit a Celsius",
				"Convertir Fahrenheit a Kelvin","Convertir Celsius a Kelvin",
				"Convertir Celsius a Fahrenheit","Convertir Kelvin a Fahrenheit",
				"Convertir Kelvin a Celsius"}; 
		Object temperaturaElegida = JOptionPane.showInputDialog(null,
				"Seleccione el tipo de Temperatura que desea convertir","Menu",
				JOptionPane.QUESTION_MESSAGE,null,tipoDeTemperatura,tipoDeTemperatura[0]);
		System.out.println(temperaturaElegida);
		String TemperaSeleccionada = (String)temperaturaElegida;
			 
	// por si no elige ninguna opcion de conversion
			if (temperaturaElegida == null) {
				mensajeFinal mensFinal = new mensajeFinal();
				mensFinal.mensajeFinal();
				// por si escoge no seguir se sale del programa
				System.exit(0);
			}
			try {
				String cantidadTemperatura = JOptionPane.showInputDialog
						("Ingrese la cantidad de dinero que desea convertir \n "
								+ "Opción Elegida: " + temperaturaElegida);	
				float valorTemperatura = Float.parseFloat(cantidadTemperatura);
				 switch(TemperaSeleccionada){
				 
			case "Convertir Fahrenheit a Celsius":
				fahrenheitACelsius(valorTemperatura);					
			break;
			case "Convertir Fahrenheit a Kelvin":
				fahrenheitAKelvin(valorTemperatura);
				break;
			case "Convertir Celsius a Fahrenheit":
				celsiusAFahrenheit(valorTemperatura);
				break;
			case "Convertir Celsius a Kelvin":
				celsiusAKelvin(valorTemperatura);
				break;
			case "Convertir Kelvin a Fahrenheit":
				kelvinAFahrenheit(valorTemperatura);
				break;
			case "Convertir Kelvin a Celsius":
				kelvinACelsius(valorTemperatura);
			default:
				break;
			}
				//Pregunta al Usuario si desea seguir en la app
					mensajeFinal mnsFinal = new mensajeFinal();
					mnsFinal.mensajeFinal();
				}
			// Si el Valor ingresado es Invalido
			catch(NumberFormatException | NullPointerException exception) {
				JOptionPane.showMessageDialog(null,"Valor no valido","Error",
						JOptionPane.ERROR_MESSAGE);
				
				Desarrollo intenteDeNuevo = new Desarrollo();
				intenteDeNuevo.Inicio();
	}
	}

	public void fahrenheitACelsius(float valor) {
	    float resultadoTemperatura =  (float) ((valor - 32) / 1.8);
	    JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°C");
	}
	public void fahrenheitAKelvin(float valor) {
		float resultadoTemperatura = (float) (((valor - 273.15) * 1.8) + 32);
		JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°K");
	}
	
	public void celsiusAFahrenheit(float valor) {
	    float resultadoTemperatura =  (float) ((1.8 * valor) + 32);
	    JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°F");
	}
	public void celsiusAKelvin(float valor) {
		float resultadoTemperatura = (float) (valor + 273.15);
		JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°K");
	}
	
	public  void kelvinAFahrenheit(float valor) {
		float resultadoTemperatura =  (float) ((valor - 32 ) / 1.8 + 273.15);
		JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°F");
	}
	public void kelvinACelsius(float valor) {
		float resultadoTemperatura = (float) (valor - 273.15);
		JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
				resultadoTemperatura + "°C");
	}
}
