package cl.os.app;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BarraMenu extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu archivo;
	private JMenuItem salir;
	private JMenu edicion;
	private JMenuItem atras;
	private JMenu ayudaMenu;
	private JMenuItem ayuda;
	private JMenuItem acerca;
	
	public BarraMenu(){
		this.archivo = new JMenu("Archivo");
		this.salir = new JMenuItem("Salir");
		this.edicion = new JMenu("Edición");
		this.atras = new JMenuItem("Atrás");
		this.ayudaMenu = new JMenu("Ayuda");
		this.ayuda = new JMenuItem("Ayuda");
		this.acerca = new JMenuItem("Acerca de");
		this.add(archivo);
		this.add(edicion);
		this.add(ayudaMenu);
		this.archivo.add(salir);
		this.edicion.add(atras);
		this.ayudaMenu.add(ayuda);
		this.ayudaMenu.add(acerca);
		
	}
	
}
