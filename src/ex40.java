import java.util.Scanner;
public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char a = str.charAt(0);
		for(int i = str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}

	}

}
