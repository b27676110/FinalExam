import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char x = str.charAt(0);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + (str.charAt(i) - 48);
		}
		System.out.print(sum);
	}
}

//import java.util.Scanner;
//
//public class ex02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		long n = scn.nextLong();
//		long val = 0, sum = 0;
//		while (n > 0) {
//			val = n % 10;
//			sum = sum + val;
//			n = n / 10;
//		}
//		System.out.println(sum);
//	}
//}
//
