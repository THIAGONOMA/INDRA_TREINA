package lista2701;

public class TesteSalario {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado peao = new Empregado("Jo�o", "Analista de Sistemas", 5400 );
		
		peao.aumetarsalario(600);
		
		System.out.println("Nome do Pe�o :  " +peao.getNome() + "\n fun��o :  " +peao.getFuncao() + " \n Salario :  " +peao.getSalario());

	}

}
