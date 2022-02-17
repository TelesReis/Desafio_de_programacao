import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		String space = " ";
		String atersk = "*";
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j >= n - 1)) {
					System.out.printf("%s", atersk);
				} else {
					System.out.printf("%s", space);
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
