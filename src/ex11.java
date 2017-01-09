import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k =0;
		for(int i = 1;i<=m;i++){
			for(int j = 0;j<n;j++){
				k++;
				System.out.print(k*i+"\t");
				
			}
			k = 0;
			System.out.println();
		}

	}

}
