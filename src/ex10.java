import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char x = scn.next().charAt(0);
		square(n,x);}
	public static void square(int n1,char x1){
		for(int i = 0;i<n1;i++){
			for(int j = 0;j<n1;j++){
				System.out.print(x1);
			}
			System.out.println();
		}

	}

}
