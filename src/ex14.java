import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		int sum = 0,i = x;
		while(i>=0){
			i++;
			if(i%x==0&&i%y==0&&i%z==0){
				System.out.println(i);
				break;
			}
		}

	}

}
