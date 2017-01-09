import java.util.Scanner;
import java.util.Random;	
public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data[] = new int [3];
		Random ran = new Random();
		ran.setSeed(n);
		for(int i = 0;i<3;i++){
			data[i]=ran.nextInt(100)+1;
		}
		int a = data[0];
		int b = data[1];
		int c = data[2];
		int max = 0;
		
		if(a>b&&a>c){
			max = a;
		}else{
			if(b>a&&b>c){
				max = b;
			}else{
				if(c>a&&c>b){
					max = c;
				}
			}
		}
		int min = 0;
		
		if(a<b&&a<c){
			min = a;
		}else{
			if(b<a&&b<c){
				min = b;
			}else{
				if(c<a&&c<b){
					min = c;
				}
			}
		}
		System.out.println(max+" "+min);
		

	

	}

}
