import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n%2==0){
			System.out.println("Even");
		}else{
			if(n%2==1){
				System.out.println("Odd");
			}
		}

	}

}
