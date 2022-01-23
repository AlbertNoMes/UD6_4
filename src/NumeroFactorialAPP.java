import javax.swing.JOptionPane;

public class NumeroFactorialAPP {

	public static void main(String[] args) {

		// ABREVIA EL PARSE INT
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));

		int resultat = numFactorial(numero);
		JOptionPane.showMessageDialog(null, "El factorial de "+numero+" es: " +resultat);

	}

	public static int numFactorial(int numero) {
		int resultat = 1;
		for (int i = numero; i > 0; i--) {
			resultat = resultat * i;
		}
		return resultat;
	}

}
