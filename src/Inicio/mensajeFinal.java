package Inicio;



import javax.swing.JOptionPane;

import conversorMonedas.Desarrollo;

public class mensajeFinal {

	public void mensajeFinal() {
			System.out.println("terminar");
			Object opcionDeMensaje = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
					"Selecciona una opción", JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
			int mensaje = (Integer) opcionDeMensaje;
			
			
			if (mensaje == 0) {
				   //desea continuar
				Desarrollo intenteDeNuevo = new Desarrollo();
				intenteDeNuevo.Inicio();
			}
			
			else if (mensaje == 1) {
				//desea salirce 
				JOptionPane.showMessageDialog(null, "Programa Finalizado","Gracias ",
						JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
