package lista2701;


public class Data {

	int dia, mes, ano;

	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}

	public Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.mes = ano;

	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public void validadia() {

		if (dia > 31 && dia < 1) {

			dia = 1;
		}

	}

	public void validames() {

		if (mes > 12 && dia < 1) {

			mes = 1;

		}

	}

	public void validaano() {

		if (ano > 0) {

			ano = 2017;

		}

	}
	
	
	

	public void attdia( int dia){
		
		this.dia = dia;
		
	}
	
	public void attmes( int mes){
		
		this.mes = mes;
		
	}
	
	public void attano(int mes){
		
		this.mes = mes;
		
	}
	

	
	
	
	
}
