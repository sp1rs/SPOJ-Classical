import java.util.Scanner;
class FrequentPrimeRanges{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int prime[]=new int[100005];
		prime[1]=0;
		prime[0]=0;
		for(int i=2;i<=100001;i++)
			prime[i]=1;
		for(int i=2;i<=100001;i++){
			if(prime[i]==1){
				int j=i+i;
				while(j<=100001){
					prime[j]=0;
					j+=i;
				}
			}	
		}
		for(int i=2;i<=100001;i++)
			prime[i]+=prime[i-1];
	
///		for(int i=2;i<=10;i++)
//			System.out.println(prime[i]);
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			long ans=0;
			long result=0;
			int j=2;
			if(k==0){
				long x=n-1;
				System.out.println((x*(x+1))/2);
			}else{
			for(int i=2;i<=n && j<=n;i++){
	//		        ans-=prime[i-1];
				ans=0;			
				while(j<=n+1 && ans<k){
					ans=prime[j]-prime[i-1];
					j+=1;
				}
				j-=1;
//				System.out.println(j);
				if(j!=n+1){
					result+=n-j+1;
			//		j+=1;
			//		System.out.println(n-j+1);
				}
			}
			System.out.println(result);
			}
		}
	}	
}
