package exe10;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente minha = new ContaCorrente();
		Scanner entrada = new Scanner(System.in);
		
		
		minha.setAgencia("Sao Bernardo");
		minha.setNumero(4455);
		minha.setSaldo(1000.00);
		minha.setLimite(1000.00);
		minha.setSenha(12345);

		
		minha.deposita(1500);
		minha.saca(100);
		minha.saldocomlim();
		
		int senhad;
		
		do{
			System.out.println(" Digite a Senha");
			senhad = entrada.nextInt();
		}
		
		while ( minha.autentica(senhad) == false );
	

		entrada.close();
}
}