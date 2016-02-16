package cl.os.app;

public class Main {

	public static void main(String[] args) {
		try{
		MainWin principal = new MainWin();
		principal.getAlignmentX();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
