package conversorTemperatura;



import javax.swing.JOptionPane;

public class TemperatureConverter {
	public void temperature() {
		Object [] tipoDeTemperatura = {"Convertir a Celsius","Convertir a Fahrenheit"
				,"Convertir a Kelvin","Convertir a Rankine",}; 
		Object temperaturaElegida = JOptionPane.showInputDialog(null,
				"Seleccione el tipo de Temperatura que desea convertir","Menu",
				JOptionPane.QUESTION_MESSAGE,null,tipoDeTemperatura,tipoDeTemperatura[0]);
	}
}
