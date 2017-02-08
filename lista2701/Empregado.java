package lista2701;

public class Empregado {
	
	String nome, funcao;
	double salario;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empregado (String nome, String funcao, double salario){
		
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		
	}
	
	public double aumetarsalario (double aumento){
		salario = salario + aumento;
		return salario;
	}
	
	
}
