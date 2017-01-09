import java.util.Scanner;
public class ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					sum++;
				}
			}
			if(sum==2){
				System.out.println(i);
			}
			sum=0;
		}

	}

}
