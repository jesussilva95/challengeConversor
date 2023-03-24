package conversorMonedas;

import javax.swing.JOptionPane;

import Inicio.mensajeFinal;


public class CurrencyConverter {
	public void converter() {
	//ingresar tipo moneda que va a convertir el usuario
	Object [] opcionesDeMoneda = {"De Pesos(COP) a Dolar(USD)","De Pesos (COP) a Euro (EUR)"
			,"De Pesos (COP) a Libras Esterlinas (GBP)",
			"De Pesos (COP) a Yen Japones (JPY)","De Pesos (COP)  a Won sul-coreano (KRW)",
					
			"De Dolar(USD) a Pesos(COP)","De Euro(EUR) a Pesos(COP)",
			"De Libras Esterlinas(GBP) a Pesos(COP)","De Yen Japones(JPY) a Pesos(COP)",
			"De Won sul-coreano(KRW) a Pesos(COP)"}; 
				
	Object opcionesElegirMoneda = JOptionPane.showInputDialog(null,
		"Seleccione una opción de conversión","Menu",JOptionPane.QUESTION_MESSAGE,
		null,opcionesDeMoneda,opcionesDeMoneda[0]);
		System.out.println(opcionesElegirMoneda);
		String MonedaSeleccionada = (String)opcionesElegirMoneda;
		
		
		 
		// por si no elige ninguna opcion de conversion
				if (MonedaSeleccionada == null) {
					mensajeFinal mnsFinal = new mensajeFinal();
					mnsFinal.mensajeFinal();
					// por si escoge no seguir se sale del programa
					System.exit(0);
				}		

			{
				try {
					//ingresar valor monetario		
					String cantidadDinero = JOptionPane.showInputDialog
							("Ingrese la cantidad de dinero que desea convertir \n "
									+ "Opción Elegida: " + MonedaSeleccionada);	
					double valorPesos = Double.parseDouble(cantidadDinero);
					
					switch(MonedaSeleccionada) {
					case "De Pesos(COP) a Dolar(USD)":
						conversionDePesos(4818.99, valorPesos);					
					break;
					case "De Pesos (COP) a Euro (EUR)":
						conversionDePesos(5175.98, valorPesos);
						break;
					case "De Pesos (COP) a Libras Esterlinas (GBP)":
						conversionDePesos(5902.81, valorPesos);
						break;
					case "De Pesos (COP) a Yen Japonés (JPY)":
						conversionDePesos(36.35, valorPesos);
						break;
					case "De Pesos (COP)  a Won sul-coreano (KRW)":
						conversionDePesos(3.682, valorPesos);
						break;
	//esta seccion sirve para devolver la conversion a pesos la cual llama a otra funcion
					case "De Dolar(USD) a Pesos(COP)":
						conversionAPesos(4818.99, valorPesos);					
					break;
					case "De Euro(EUR) a Pesos(COP)":
						conversionAPesos(5175.98, valorPesos);
						break;
					case "De Libras Esterlinas(GBP) a Pesos(COP)":
						conversionAPesos(5902.81, valorPesos);
						break;
					case "De Yen Japones(JPY) a Pesos(COP)":
						conversionAPesos(36.35, valorPesos);
						break;
					case "De Won sul-coreano(KRW) a Pesos(COP)":
						conversionAPesos(3.682, valorPesos);
						break;
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
				
					
	}
	
//Para convertir de Pesos Colombianos a la moneda seleccionada
public void conversionDePesos(double valor1, double valor2 ) {

	double resultadoConversion = valor2 / valor1;		
	resultadoConversion = (double) Math.round(resultadoConversion * 100d) / 100;
	JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " +
									resultadoConversion);
	}

//para converti de la moneda seleccionada a Pesos colombianos
public void conversionAPesos(double valor1, double valor2 ) {

	double resultadoConversion = valor2 * valor1;		
	resultadoConversion = (double) Math.round(resultadoConversion * 100d) / 100;
	JOptionPane.showMessageDialog(null,"El resultado de la Coversion es: " + 
									resultadoConversion);
	}
}
