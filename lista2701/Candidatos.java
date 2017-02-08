package lista2701;

public class Candidatos {

	int idade;
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(char experiencia) {
		this.experiencia = experiencia;
	}


	char sexo, experiencia;

	public Candidatos() {

	}

	public Candidatos(int idade, char sexo, char experiencia) {

		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = experiencia;

	}


}