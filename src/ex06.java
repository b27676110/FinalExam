import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char x = scn.next().charAt(0);
		if(x>='A'&&x<='Z'){
			System.out.println((char)((x-'A')+'a'));
		}else{
			if(x>='a'&&x<='z'){
				System.out.println((char)((x-'a')+'A'));
			}
		}

	}

}
