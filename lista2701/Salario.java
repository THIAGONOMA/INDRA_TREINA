package lista2701;

public class Salario {
	
	double salario;
	
	public Salario(){
		
	}

	public double imposto(){
		
		double imposto = 0;
		
		if( salario < 500){
			
			 imposto = salario*0.05;
		
		}
		
		else if(salario > 500 && salario <850 ){
			
			imposto = salario*0.1;
		}
		
		else {
			
			imposto = salario*0.1;
		}
		
		return imposto;
		
		
		
	}
	
	public double novosalario(){
		
		if( salario > 1500){
			
			 salario = salario + 25;
		
		}
		
		else if(salario >= 750 && salario <= 1500 ){
			
			salario = salario + 50;
		}
		
		else if(salario >= 450 && salario < 750 ){
			
			salario = salario + 75;
		}
		
		else {
			
			salario = salario + 100;
		}
		
		
		return salario;
		
	}
	
	public String classificacao(){
		
		if( salario <= 700){
			
			 return "mal remunerado";
		
		}
		
		else { 
			
			return "bem remunerado";
			
		}
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
