package exe10;


public class ContaCorrente extends Conta implements Autenticavel {

		double limite;
		int senha;
		
		
		
		
		public int getSenha() {
			return senha;
		}



		public void setSenha(int senha) {
			this.senha = senha;
		}



		public double getLimite() {
			return limite;
		}



		public void setLimite(double limite) {
			this.limite = limite;
		}



		public void saldocomlim (){
			
			saldo = saldo + limite;
			
			System.out.println("Seu Saldo é : "  +saldo);
		}



		@Override
		public boolean autentica(int senha) {
			// TODO Auto-generated method stub
			
			if (this.senha == senha){
				
				System.out.println(" Acesso permitido");
			return true;
			}
			else { System.out.println(" Acesso negado");
			
			return false;
			}
		
		}

		
		
}
	
	

