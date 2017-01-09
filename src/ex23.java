import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		a = n % 10;
		b = n / 10 % 10;
		c = n / 100 % 10;
		d = n / 1000 % 10;
		if (d != 0) {
			System.out.println(d + " " + "thousand" + " " + c + " " + "hundred" + " " + b + " " + "ten" + " " + a + " "
					+ "dollar");
		} else {
			if (c != 0) {
				System.out.println(c + " " + "hundred" + " " + b + " " + "ten" + " " + a + " " + "dollar");
			} else {
				if (c == 0 && b != 0) {
					System.out.println(b + " " + "ten" + " " + a + " " + "dollar");
				} else {
					if (c == 0 && b == 0) {
						System.out.println(a + " " + "dollar");
					}
				}
			}
		}

	}
}