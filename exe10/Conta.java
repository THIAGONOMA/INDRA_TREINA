package exe10;

public class Conta {
	
	String agencia;
	int numero;
	double saldo;
	
	public Conta(){
		
	}
	
	public Conta(String agencia, int numero, double saldo){
	
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;		
		
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
	
	
	public void deposita (int valor){
		
		saldo = saldo + valor;
		
		System.out.println("Deposito efetuado");
		
	}
	
	public void saca (int valor){
		
		saldo = saldo - valor;
		
		System.out.println("saque efetuado");
		
	}


	
	
	

}
