import java.util.Scanner;
public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum = sum + (int)Math.pow(2, i);
		}
		System.out.println(sum);

	}

}
