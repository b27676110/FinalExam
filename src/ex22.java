import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int k = m;
		System.out.println(fun(m,n,k));}
		public static int fun(int m1,int n1,int k){
			if(m1%k==0&&n1%k==0){
				return k;
			}else{
				return fun(m1,n1,k-1);
		}

	}

}
