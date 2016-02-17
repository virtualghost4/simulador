package cl.os.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
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
	
	public Panel2(){
		
		p2=this;
		TitledBorder titulo2 = BorderFactory.createTitledBorder("Lista de Procesos");
		this.setBorder(titulo2);
		String[] cabecera = {"Proceso", "Tiempo Llegada", "Ráfaga"};
		tableModel = new DefaultTableModel(cabecera,0);
	    tabla = new JTable(tableModel);
		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);
		tabla.setModel(tableModel);
		
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
