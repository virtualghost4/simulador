package cl.os.app;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainWin extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private int ANCHO = 640;
	private int ALTO = 380;
	
	private BarraMenu menu;
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	
	public MainWin(){
		super("Simulador de Procesos");
		this.menu = new BarraMenu();
		this.p1 = new Panel1();
		this.p2 = new Panel2();
		this.p3 = new Panel3();
		super.setSize(ANCHO,ALTO);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(new BorderLayout());
		super.setJMenuBar(menu);
		super.add(p1,BorderLayout.NORTH);
		super.add(p2,BorderLayout.CENTER);
		super.add(p3,BorderLayout.SOUTH);

		
		super.setVisible(true);
		super.setLocationRelativeTo(p1);
		
	}
	

}
