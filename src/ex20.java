import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if(a<=b&&a<=c&&b<=c){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

	}

}
