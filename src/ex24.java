import java.util.Scanner;
public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int data[] = new int [6];
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0;i<6;i++){
			data[i]=scn.nextInt();
		}
		for(int i = 0;i<6;i++){
			if(data[i]<0){
				a++;
			}else{
				if(data[i]==0){
					b++;
				}else{
					if(data[i]>0){
						c++;
					}
				}
			}
		}
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}

}
