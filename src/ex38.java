import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);

			}

		}
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				if (j == n) {
					System.out.println("No");
				}
			}
		}
	}

}
