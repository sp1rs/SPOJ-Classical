import java.util.Scanner;
class alicesieve{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			if(x%2!=0)
				x+=1;
			System.out.println(x/2);
		}
	}	
}
