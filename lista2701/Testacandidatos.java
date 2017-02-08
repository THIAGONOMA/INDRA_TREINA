package lista2701;

import java.util.ArrayList;
import java.util.Scanner;


public class Testacandidatos {

	public static void main(String[] args) {
		
		int fem = 0;
		int mas = 0;
		int expmas = 0;
		int mas45 = 0;
		int fem21 = 0;
		
		
		
		ArrayList<Candidatos> candi = new ArrayList<Candidatos>();
		
		Scanner entrada = new Scanner(System.in);
		
		int in;
		do {

			Candidatos c = new Candidatos();
			System.out.println(" digite a idade do Candidato");
			in = entrada.nextInt();
			c.setIdade(in);
			
			System.out.println(" digite o Sexo do Candidato");
			c.setSexo(entrada.next().charAt(0));
			
			System.out.println(" digite se o func tem experiência");
			c.setExperiencia(entrada.next().charAt(0));
			
			candi.add(c);
			
			}
			
		
		
	while( in != 0);
		
		int menor = candi.get(0).getIdade();
			
		
		for (Candidatos c: candi){
			
			int init = 0;
			
			if (c.getSexo() == 'F') {

				fem++;

			} 
			if ( c.getSexo() == 'M'){
				mas++;
			}
			
			if(c.getSexo() == 'M')
			if (c.getExperiencia() == 'S') {

				expmas++;

			}
			if (c.getIdade() > 45) {

				mas45++;

			}
			if (c.getSexo() == 'F'){
			if (c.getIdade() < 21){
				
				fem21++;
			}
			}
			
			if (c.getSexo() == 'F'){
				
				if (c.getExperiencia() == 'S') {
					
				if (c.getIdade() < menor){
					
					menor = c.getIdade();
				}

			}
			}
			init++;
		}
			
		int mediaexpmas = expmas/mas;
		int perch = mas45*100/mas;
		
	
		entrada.close();
		
		
		System.out.println("numero de candidato(a)s \n"+ "masculinos : " +mas + "\n Femininas" +fem );
		System.out.println("média dos homens com experiencia " +mediaexpmas);
		System.out.println("% dos homens com mais de 45 " +perch);
		System.out.println("mulheres inferior a 21 : " +fem21);
		System.out.println("menor idade das mulheres " +menor);
}
}