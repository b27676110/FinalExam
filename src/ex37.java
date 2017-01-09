import java.util.Scanner;
public class ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = i;j<n;j++){
				System.out.print(" ");
			}
			for(int k = 0;k<i*2-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
