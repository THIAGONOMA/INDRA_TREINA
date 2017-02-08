package lista2701;

public class TesteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data zero = new Data();
		
		System.out.println(zero.toString());
		
		zero.validadia();
		zero.validames();
		zero.validaano();
		
		zero.toString();
		
		Data hoje = new Data(17, 1, 2017);
		
		System.out.println(hoje.toString());
		
	}

}
