import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		long sum = 1,val = 1,has = 1;
		for(int i = 1;i<=m;i++){
			sum = sum*i;
		}
		for(int i = 1;i<=n;i++){
			val = val*i;
		}
		for(int i = 1;i<=m-n;i++){
			has = has*i;
		}
		System.out.println(sum/(val*has));

	}

}
//int m = scn.nextInt();
//int n1 = scn.nextInt();
//System.out.println(fun(m)/(fun(n1)*fun(m-n1)));}
//public static long fun(int n){
//	long sum = 1;
//	for(int i=1;i<=n;i++){
//		sum = sum*i;
//		
//		
//	}
//	return sum;
//
//}
//
//}

