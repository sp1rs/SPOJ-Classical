import java.io.*;
class dna{
	public static int dp[][]=new int[1024][1024];
	public static int w[][]=new int[1024][1024];
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		while(k!=0){
			String s=br.readLine();
			String t=br.readLine();
			int ls=s.length();
			int lt=t.length();
			s=' '+s;
			t=' '+t;
	//	int dp[][]= new int[ls+1][lt+1];
	//		int w[][]=new int[ls+1][lt+1];
			for(int i=1;i<=ls;++i){
				for(int j=1;j<=lt;++j){
					dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
					if(s.charAt(i)==t.charAt(j)){
						w[i][j]=w[i-1][j-1]+1;	
					}else{
						w[i][j]=0;	
					}
					if(w[i][j]>=k){
						for(int z=k;z<=w[i][j];++z){
							dp[i][j]=max(dp[i][j],dp[i-z][j-z]+z);
						}	
					}
				}	
			}
/*			for(int i=1;i<=ls;++i){
				for(int j=1;j<=lt;++j){
					System.out.print(dp[i][j]+" ");	
				}	
				System.out.println();
			}*/
			System.out.println(dp[ls][lt]);
			k=Integer.parseInt(br.readLine());
		}

		
	}	
	public static int max(int a,int b){
		if(a>b)
			return a;
		else
			return b;
	}
}
