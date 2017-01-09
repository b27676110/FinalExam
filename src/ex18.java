import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		System.out.println(fun(n) - 1);
	}

	public static long fun(long n) {
		if (n == 0) {
			return 1;
		} else {
			return 1 + fun(n / 10);
		}

	}
	
}
// long n = scn.nextLong();
// int sum = 0;
// while(n>0){
// sum++;
// n = n/10;
// }
// System.out.println(sum);
//
// }
//
// }
