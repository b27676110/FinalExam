import java.util.Scanner;
public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n<600){
			System.out.println(n*0.5);
		}else{
			if(n>=600&&n<=1200){
				System.out.println(n*0.5*0.9);
			}else{
				if(n>1200){
					System.out.println(n*0.5*0.79);
				}
			}
		}

	}

}
