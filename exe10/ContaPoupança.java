package exe10;

public class ContaPoupan�a extends Conta{
	
	double limite;
	
	
	
	public void saldocomlim (){
		
		saldo = saldo + limite;
		
		System.out.println("Seu Saldo � : "  +saldo);
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public void setLimite(int limite) {
		this.limite = limite;
	}


}
