package lista2701;



import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto();

		do {
			p1.setPrecoUnitario(Double.parseDouble(JOptionPane.showInputDialog("Insira o pre�o unit�rio: ")));
			if (p1.getPrecoUnitario() <= 0) {
				System.exit(0);
			} else {
				p1.setMeioDeTransporte(
						JOptionPane.showInputDialog("Insira o meio de transporte (T/F/A): ").toUpperCase().charAt(0));
				p1.setPaisDeOrigem(Integer.parseInt(JOptionPane.showInputDialog("Insira o pa�s de origem:\n1 - EUA\n2 - MEX\n3 - Outros")));
				p1.setCargaPerigosa(JOptionPane.showInputDialog("A carga � perigosa? (S/N)").toUpperCase().charAt(0));

				JOptionPane
						.showMessageDialog(null,
								"O pre�o unit�rio � de: R$" + p1.getPrecoUnitario() + "\nO valor do imposto � de: R$"
										+ p1.calcularImposto() + "\nO valor do transporte � de: R$"
										+ p1.calcularTransporte() + "\nO valor do seguro � de: R$" + p1.calcularPrecoSeguro()
										+ "\n\nO pre�o final � de: R$" + (p1.getPrecoUnitario()
												+ p1.getPrecoTransporte() + p1.getImposto() + p1.getPrecoSeguro())
										+ ".");
			}
		} while (p1.getPrecoUnitario() > 0);
	}
}
