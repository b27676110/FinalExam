import java.util.Scanner;
import java.util.Random;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int n = scn.nextInt();
		int data[][] = new int[5][5];
		ran.setSeed(n);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				data[i][j] = ran.nextInt(10);
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(data[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
