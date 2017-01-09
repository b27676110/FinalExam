import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		if(x<-1){
			System.out.println(3*x*x);
		}else{
			if(x>=-1&&x<=1){
				System.out.println(x*x*x+3*x-3);
			}else{
				if(x>1){
					System.out.println(2*x+3);
				}
			}
		}

	}

}
