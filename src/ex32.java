import java.util.Scanner;
public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		double sum = 0;
		for(int i = 1;i<=n;i++){
			sum = sum +(1/(double)((2*i-1)*(2*i)));
			
		}
		System.out.println(sum);

	}

}
