import java.util.Scanner;
class SumofDigits{
	public static long ans;
	public static long  sum[]={0,1,3,6,10,15,21,28,36,45};
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		
		while(a!=-1 && b!=-1){
			ans=0;
			
			long x=solve(b,1);
			ans=0;
			long y=solve(a-1,1);
			System.out.println(x-y);
			a=sc.nextLong();
			b=sc.nextLong();


		}
	}
	public static long solve(long n,long multi){
		if(n<=0){
			return ans;	
		}else{
			long leftpart=(n/10);
			long temp=leftpart;
			long leftsum=0;
			while(temp!=0){
				leftsum+=temp%10;
				temp/=10;
			}
//			System.out.println(leftsum);
			int lastpart=((int)n)%10;
			ans += sum[lastpart]*multi+leftsum*(1+lastpart)*multi + leftpart*45*multi;
			return solve(leftpart-1,multi*10);
		}	
	}
}
