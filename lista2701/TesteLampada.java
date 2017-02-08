package lista2701;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada holo = new Lampada();
		Lampada flur = new Lampada("BRANCA");
		Lampada dicro = new Lampada("amarela", false);
		
		holo.estado();
		flur.estado();
		dicro.estado();
		
		
	}

}
