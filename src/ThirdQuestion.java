import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		String c = "c";
		String temp = "temp";
		String palavra = scan.nextLine();

		for (int k = 1; k < palavra.length(); k++) {
			for (int i = 0; i < palavra.length(); i++) {
				if (i + k <= palavra.length()) {
					c = palavra.substring(i, i + k);
					for (int j = i + 1; j < palavra.length(); j++) {
						if (j + k <= palavra.length()) {
							temp = palavra.substring(j, j + k);
							
							if(isAnagrama(c, temp)) {
								count++;
							}
								
						}
					}
				}
			}
		}
		System.out.println(count);

		scan.close();

	}

	private static boolean isAnagrama(String A, String B) {
		if (A.length() == B.length()) {
			int equalsCount = 0;
			String auxB = B;
			for (int l = 0; l < A.length(); l++) {
				for (int m = 0; m < A.length(); m++) {
					if (auxB.charAt(m) == A.charAt(l)) {
						auxB = auxB.replace("" + auxB.charAt(m), " ");
						equalsCount++;
						break;
					}
				}
			}
			if (equalsCount == A.length()) {
				
				return true;
			}
		}
		return false;
	}

}
