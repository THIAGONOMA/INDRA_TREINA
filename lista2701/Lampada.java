package lista2701;

public class Lampada {
	
	String cor;
	boolean ligada = true;
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	

	public Lampada(){
		
	}
	
	public Lampada(String cor, boolean ligada){
		this.cor = cor;
		this.ligada = ligada;
		
	}
	
	public Lampada(String cor){
		this.cor = cor;
	}
	
	
	public void estado (){
		
		System.out.println(" A cor da lampada é: " +cor +" ela esta ligada : " + ligada);
		
	}
}

