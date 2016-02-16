package cl.os.app;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private JTable tablaResult;
	private JLabel tiempoEspera;
	private JTextField tEsperaTxt;
	private JTextField tRetornoTxt;
	private JLabel tiempoRetorno;
	//private String 
	
	
	public Panel3(){
		
		TitledBorder titulo3 = BorderFactory.createTitledBorder("Lista de Procesos");
		this.setBorder(titulo3);
		tiempoEspera = new JLabel("Tiempo Promedio Espera:");
		tEsperaTxt = new JTextField(5);
		tiempoRetorno = new JLabel("Tiempo Promedio Retorno:");
		tRetornoTxt = new JTextField(5);
		this.add(tiempoEspera);
		this.add(tEsperaTxt);
		this.add(tiempoRetorno);
		this.add(tRetornoTxt);
		
	}


	
}
