import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean numero = false, maiuscula = false, minuscula = false, quantidadeCaracter = false,
				caracterEspecial = false, caracterInvalido = false;
		int value = 0, count = 0, cont = 0, result = 0;
		String especial = "!@#$%^&*()-+";
		String password = scan.nextLine();
		result = password.length();

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			caracterEspecial = false;

			if (Character.isUpperCase(c)) {
				if (maiuscula == false) {
					maiuscula = true;
					count++;
				}
			}

			else if (Character.isLowerCase(c)) {
				if (minuscula == false) {
					minuscula = true;
					count++;
				}
			}

			else if (Character.isDigit(c)) {
				if (numero == false) {
					numero = true;
					count++;
				}
			}

			else if (caracterEspecial == false) {
				for (int j = 0; j < especial.length(); j++) {
					char e = especial.charAt(j);
					if (c == e) {
						caracterEspecial = true;
						cont++;
						if (cont == 1) {
							count++;
						}
					}
				}
				if (caracterEspecial == false) {
					result--;
					caracterInvalido = true;
				}
			}

		}

		if (result >= 6) {
			if (quantidadeCaracter == false) {

				quantidadeCaracter = true;
				count++;
			}
		}

		System.out.println(6 - result);

		/*
		 * value = 5 - count; if (value > 0 && caracterInvalido == false) {
		 * System.out.println("sua senha é fraca."); System.out.println(value +
		 * " regra(s) não atendida(s)."); } else if (caracterInvalido == true) {
		 * System.out.println("Senha inválida."); } else {
		 * System.out.println("sua senha é forte."); }
		 */

		scan.close();
	}

}
