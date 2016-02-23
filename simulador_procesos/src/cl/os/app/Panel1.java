package cl.os.app;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel1 extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel proceso;
	public JTextField procesoTxt;
	private JButton cargar;
	private JLabel tiempo;
	public JTextField tiempoTxt;
	private JLabel rafaga;
	public JTextField rafagaTxt;
	private JLabel priority;
	public JTextField priorityTxt;
	private JComboBox<String> algType; //para elegir el tipo de algoritmo
	private JLabel quantum;
	public JTextField quantumTxt;
	public static Panel1 p1;
	
	public Panel1(ActionListener load){
		//this.setBackground(Color.BLUE);
		
		p1=this;
		this.proceso = new JLabel("Proceso");
		this.cargar = new JButton("Cargar");
		this.procesoTxt = new JTextField(10);
		this.tiempo = new JLabel("Tiempo Llegada");
		this.tiempoTxt = new JTextField(10);
		this.rafaga = new JLabel("Rafaga");
		this.rafagaTxt = new JTextField(10);
		this.priority = new JLabel("Prioridad");
		this.priorityTxt = new JTextField(10);
		this.quantum = new JLabel("Quantum");
		this.quantumTxt = new JTextField(4);
		this.algType = new JComboBox<String>();
		this.quantumTxt.setEnabled(false);
		TitledBorder titulo1 = BorderFactory.createTitledBorder("Datos de Proceso");
		this.setBorder(titulo1);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		algType.addActionListener(new Preload());
		cargar.addActionListener(Load.load1);
		
		//cargar.setActionCommand("cargar");
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		this.add(proceso,c);

		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(procesoTxt,c);
		
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(tiempo,c);
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(tiempoTxt,c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill=GridBagConstraints.SOUTH;
		this.add(rafaga,c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(rafagaTxt,c);
		
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(priority,c);
		
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(priorityTxt,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(algType,c);
		algType.addItem("FIFO");
		algType.addItem("Round Robin");
		//algType.addItem("SJF");
		//algType.addItem("SRTF");
		//algType.addItem("Prioridad");
		
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(quantum, c);
		
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		this.add(quantumTxt, c);
		
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 1.0;
		this.add(cargar,c);
		
		
	}


	public JTextField getProcesoTxt() {
		return procesoTxt;
	}


	public JTextField getTiempoTxt() {
		return tiempoTxt;
	}


	public JTextField getRafagaTxt() {
		return rafagaTxt;
	}


	public JTextField getPriorityTxt() {
		return priorityTxt;
	}


	public JComboBox<String> getAlgType() {
		return algType;
	}


	public void setAlgType(JComboBox<String> algType) {
		this.algType = algType;
	}


	public JTextField getQuantumTxt() {
		return quantumTxt;
	}


	public void setQuantumTxt(JTextField quantumTxt) {
		this.quantumTxt = quantumTxt;
	}


	public JLabel getProceso() {
		return proceso;
	}


	public void setProceso(JLabel proceso) {
		this.proceso = proceso;
	}


	public JButton getCargar() {
		return cargar;
	}


	public void setCargar(JButton cargar) {
		this.cargar = cargar;
	}


	public JLabel getTiempo() {
		return tiempo;
	}


	public void setTiempo(JLabel tiempo) {
		this.tiempo = tiempo;
	}


	public JLabel getRafaga() {
		return rafaga;
	}


	public void setRafaga(JLabel rafaga) {
		this.rafaga = rafaga;
	}


	public JLabel getPriority() {
		return priority;
	}


	public void setPriority(JLabel priority) {
		this.priority = priority;
	}


	public JLabel getQuantum() {
		return quantum;
	}


	public void setQuantum(JLabel quantum) {
		this.quantum = quantum;
	}


	public static Panel1 getP1() {
		return p1;
	}


	public static void setP1(Panel1 p1) {
		Panel1.p1 = p1;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setProcesoTxt(JTextField procesoTxt) {
		this.procesoTxt = procesoTxt;
	}


	public void setTiempoTxt(JTextField tiempoTxt) {
		this.tiempoTxt = tiempoTxt;
	}


	public void setRafagaTxt(JTextField rafagaTxt) {
		this.rafagaTxt = rafagaTxt;
	}


	public void setPriorityTxt(JTextField priorityTxt) {
		this.priorityTxt = priorityTxt;
	}
	
	

}
