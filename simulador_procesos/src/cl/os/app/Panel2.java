package cl.os.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Panel2 extends JPanel  {

	
	private static final long serialVersionUID = 1L;
	private JTable tabla;
	private DefaultTableModel datos;
	private String captado;
	private String[] fila;

	
	public Panel2(){
		
		
		TitledBorder titulo2 = BorderFactory.createTitledBorder("Lista de Procesos");
		this.setBorder(titulo2);
		
		String[] columnNames = {"Proceso", "Tiempo Llegada", "Ráfaga"};
		
			datos = new DefaultTableModel(columnNames,5);
	        
			
		
		tabla = new JTable(datos);
		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);
		tabla.setModel(datos);

		
        //datos.addRow(fila);
        
	}



	


		
	
}
