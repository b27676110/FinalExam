import java.util.Scanner;
public class ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		int a = n+1;
		for(int i = 1;i<a;i++){
			if(sum<n+i)
			System.out.print(sum+"\t");
			sum = sum +i;
		}
		System.out.println();
		for(int i = 1;i<=a;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i+"\t");
			}
		}
		System.out.println();

	}

}
