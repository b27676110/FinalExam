import java.util.Scanner;
import java.util.Random;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int n = scn.nextInt();
		ran.setSeed(n);
		for(int i = 0;i<6;i++){
			System.out.print(ran.nextInt(42)+1+"\t");
		}
		System.out.println("");
		

	}

}
