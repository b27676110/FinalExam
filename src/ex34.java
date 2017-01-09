import java.util.Scanner;
public class ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n;j++){
				for(int k = 1;k<=n;k++){
					if(i+j+k<=n){
						if(k*k+j*j==i*i){
							if(k<j&&j<i){
							System.out.println(k+"\t"+j+"\t"+i);
						}}
					}
				}
			}
		}

	}

}
