import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int j = 0; j <n; j++) {
			for (int i = j+1; i <n; i++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//int n = scn.nextInt();
//int a = 1;
//for(int i = 0;i<n;i++){
//	for(int j = a;j<n;j++){
//		System.out.print(" ");
//	}
//	for(int k = 0;k<=i;k++){
//		System.out.print("*");
//	}
//	System.out.println();
//	a++;
//}
//
//}
//
//}

