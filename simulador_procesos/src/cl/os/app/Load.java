package cl.os.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Load implements ActionListener{

	//private Panel1 pan1;
	private String dato;
	private JTextField objeto1;
	private JTextField objeto2;
	private JTextField objeto3;
	private JTextField objeto4;

	
	public Load(JTextField procesoTxt, JTextField tiempoTxt,
				 JTextField rafagaTxt, JTextField priorityTxt, Panel1 panel1){
	
		
		this.objeto1 = procesoTxt;
		this.objeto2 = tiempoTxt;
		this.objeto3 = rafagaTxt;
		this.objeto4 = priorityTxt;
	}

	
	
	public String getDato() {
		return dato;
	}



	public void setDato(String dato) {
		this.dato = dato;
	}



	public JTextField getObjeto1() {
		return objeto1;
	}



	public void setObjeto1(JTextField objeto1) {
		this.objeto1 = objeto1;
	}



	public JTextField getObjeto2() {
		return objeto2;
	}



	public void setObjeto2(JTextField objeto2) {
		this.objeto2 = objeto2;
	}



	public JTextField getObjeto3() {
		return objeto3;
	}



	public void setObjeto3(JTextField objeto3) {
		this.objeto3 = objeto3;
	}



	public JTextField getObjeto4() {
		return objeto4;
	}



	public void setObjeto4(JTextField objeto4) {
		this.objeto4 = objeto4;
	}



	



	



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		this.dato = this.objeto1.getText()+" "+ this.objeto2.getText()+" "+this.objeto3.getText()
		+" "+objeto4.getText();
		Panel2 p2 = new Panel2();
		Panel1 p1 = new Panel1();
	}



	



	
	

}
