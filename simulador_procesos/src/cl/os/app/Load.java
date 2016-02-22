package cl.os.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Load implements ActionListener{

	//private Panel1 pan1;
	private JTextField objeto1;
	private JTextField objeto2;
	private JTextField objeto3;
	private JTextField objeto4;
	private String[] tableData;
	
	public static Load load1;
	
	public Load(){
	
		load1=this;	
		
	}


	@Override
	public void actionPerformed(ActionEvent Arg0){
			
		/*debo poner un switch
		 * 
		 * switch()
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
			if(Panel1.p1.getAlgType().getSelectedItem().equals("FIFO"))
			{
			String[] tableData = new String[5];
			tableData[0]=Panel1.p1.getProcesoTxt().getText();
			tableData[1]=Panel1.p1.getTiempoTxt().getText();
			tableData[2]=Panel1.p1.getRafagaTxt().getText();
			Panel2.p2.getTableModel().addRow(tableData);
			}else{
				if(Panel2.p2.getTableModel().getColumnCount()==3){
					Panel2.p2.getTableModel().addColumn("Quantum");
					System.out.println("se crea la columna");
				}else{
					System.out.println("no se crea la columna");
				}
				
			}
			
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


	public String[] getTableData() {
		return tableData;
	}


	public void setTableData(String[] tableData) {
		this.tableData = tableData;
	}
	
}
