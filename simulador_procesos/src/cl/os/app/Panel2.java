package cl.os.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Panel2 extends JPanel  {

	
	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private DefaultTableModel tableModel;
	private int captado;
	private String[] datos;
	public static Panel2 p2;
	public JButton analizar;
	
	public Panel2(ActionListener a1){
		
		p2=this;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		TitledBorder titulo2 = BorderFactory.createTitledBorder("Lista de Procesos");
		this.setBorder(titulo2);
		String[] cabecera = {"Proceso", "Tiempo Llegada", "Ráfaga"};
		tableModel = new DefaultTableModel(cabecera,0);
	    tabla = new JTable(tableModel);
		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);
		tabla.setModel(tableModel);
		JButton analizar = new JButton("Analizar");
		this.add(analizar);
		analizar.addActionListener(Analizar.a1);
	}


	public JTable getTabla() {
		return tabla;
	}


	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}


	public DefaultTableModel getTableModel() {
		return tableModel;
	}


	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}


	public String[] getDatos() {
		return datos;
	}


	public void setDatos(String[] datos) {
		this.datos = datos;
	}


	public int getCaptado() {
		return captado;
	}


	public void setCaptado(int captado) {
		this.captado = captado;
	}
	
	
}
