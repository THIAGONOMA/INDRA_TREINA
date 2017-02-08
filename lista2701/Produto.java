package lista2701;



public class Produto {
	private double PrecoUnitario;
	private int PaisDeOrigem;
	private char MeioDeTransporte;
	private char CargaPerigosa;
	private double PrecoTransporte;
	private double Imposto;
	private double PrecoSeguro;

	public Produto() {

	}

	public Produto(double precoUnitario, int paisDeOrigem, char meioDeTransporte, char cargaPerigosa) {
		this.PrecoUnitario = precoUnitario;
		this.PaisDeOrigem = paisDeOrigem;
		this.MeioDeTransporte = meioDeTransporte;
		this.CargaPerigosa = cargaPerigosa;
	}

	public double calcularImposto() {
		if (this.PrecoUnitario <= 100) {
			this.Imposto = (this.PrecoUnitario * 1.05) - this.PrecoUnitario;
			return this.Imposto;
		} else {
			this.Imposto = (this.PrecoUnitario * 1.10) - this.PrecoUnitario;
			return this.Imposto;
		}
	}

	public double calcularTransporte() {
		if (this.CargaPerigosa == 'S') {
			if (this.PaisDeOrigem == 1) {
				this.PrecoTransporte = 50;
				return this.PrecoTransporte;
			} else if (this.PaisDeOrigem == 2) {
				this.PrecoTransporte = 21;
				return this.PrecoTransporte;
			} else if (this.PaisDeOrigem == 3) {
				this.PrecoTransporte = 24;
				return this.PrecoTransporte;
			}
		} else {
			if (this.PaisDeOrigem == 1) {
				this.PrecoTransporte = 12;
				return this.PrecoTransporte;
			} else if (this.PaisDeOrigem == 2) {
				this.PrecoTransporte = 21;
				return this.PrecoTransporte;
			} else if (this.PaisDeOrigem == 3) {
				this.PrecoTransporte = 60;
				return this.PrecoTransporte;
			}
		}
		return 0;
	}

	public double calcularPrecoSeguro() {
		if (this.PaisDeOrigem == 2 || this.MeioDeTransporte == 'A'){
			return this.PrecoSeguro = this.PrecoUnitario/2;
		} else {
			return this.PrecoSeguro = 0;
		}
	}

	public double getPrecoTransporte() {
		return PrecoTransporte;
	}

	public void setPrecoTransporte(double precoTransporte) {
		this.PrecoTransporte = precoTransporte;
	}

	public double getPrecoSeguro() {
		return PrecoSeguro;
	}

	public void setPrecoSeguro(double precoSeguro) {
		PrecoSeguro = precoSeguro;
	}

	public double getImposto() {
		return Imposto;
	}

	public void setImposto(double imposto) {
		this.Imposto = imposto;
	}

	public double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.PrecoUnitario = precoUnitario;
	}

	public int getPaisDeOrigem() {
		return PaisDeOrigem;
	}

	public void setPaisDeOrigem(int paisDeOrigem) {
		this.PaisDeOrigem = paisDeOrigem;
	}

	public char getMeioDeTransporte() {
		return MeioDeTransporte;
	}

	public void setMeioDeTransporte(char meioDeTransporte) {
		this.MeioDeTransporte = meioDeTransporte;
	}

	public char getCargaPerigosa() {
		return CargaPerigosa;
	}

	public void setCargaPerigosa(char cargaPerigosa) {
		this.CargaPerigosa = cargaPerigosa;
	}

}
