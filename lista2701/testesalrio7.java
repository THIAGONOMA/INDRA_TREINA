package lista2701;

import java.util.Scanner;

public class testesalrio7 {

	public static void main(String[] args) {
		
		Salario sal = new Salario();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" digite o salario");
		sal.setSalario(entrada.nextDouble());
		
		int operacao = 0;
		
		
		while(operacao != 4){
		
			System.out.println(" didite a opção desejada \n" + " 1 - imposto \n" + " 2 - Novo Salario \n" + "3 - Classificação\n" + "4 - finalizar programa\n")
			;
			operacao = entrada.nextInt();
			
			
			switch (operacao) {
		
		case '1':
			
			sal.imposto();
			System.out.println(sal.imposto());
			
			break;

		case '2':
			
			sal.novosalario();
			
			break;	
			
		case '3':
			
			sal.classificacao();
			
			break;
			
		case '4':
			
			System.exit(0);
			
			break;
			
			
		default: 
			break;
		}
	}
	
		entrada.close();
		
	}
	
}
