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
	public static Load load;
	
	public MainWin(){
		super("Simulador de Procesos");
		this.menu = new BarraMenu();
		Load load = new Load();
		Analizar analizar = new Analizar();
		
		this.p1 = new Panel1(Load.load1);
		this.p2 = new Panel2(Analizar.a1);
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
