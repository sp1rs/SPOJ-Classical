import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();{
			while(n!=0){
			if(n!=1){
				int t1=1;
				int x=2;
				int t=t1;
				int i=1;
				int total=0;
				total+=n*n;
				while(x<n){
					t1+=2*i+1;
					t+=t1;
					x++;
					i++;
				}
				total+=t;
				System.out.println(total);
			}else{
				System.out.println(n);
			}
				n=sc.nextInt();			
			}
		}
	}
}


