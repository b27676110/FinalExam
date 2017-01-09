import java.util.Scanner;
public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int val = 0;
		while(n>0){
			n = n/10;
			val++;
		}
		System.out.print(val);

	}

}
