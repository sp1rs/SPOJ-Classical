import java.io.*;
class alphacode{
	public static int ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();

		int x=Integer.parseInt(Character.toString(s.charAt(0)));
		while(x!=0){
			ans=0;
			int a[]=new int[s.length()+1];
			for(int i=1;i<=s.length();i++){
				a[i]=Integer.parseInt(Character.toString(s.charAt(i-1)));
			}
		//	function(a,1,a.length);

			long dp[]=new long[a.length+1];
			dp[0]=1;
			dp[1]=1;
			int n=s.length()+1;
				
			for(int i=2;i<n;i++){
				if(a[i]==0){
					dp[i]=dp[i-2];	
				}else if(a[i]<=6){
					if(a[i-1]==1 || a[i-1]==2){
						dp[i]=dp[i-1]+dp[i-2];	
					}else{
						dp[i]=dp[i-1];	
					}	
				}else{
					if(a[i-1]==1 || a[i-1]==2){
						dp[i]=dp[i-1]+dp[i-2];	
					}else{
					dp[i]=dp[i-1];	
					}
				}	
//				System.out.println(a[i]+" "+dp[i]);
			}


		//	ans=dp[a.length-1];
			System.out.println(dp[a.length-1]);
			s=br.readLine();
			x=Integer.parseInt(Character.toString(s.charAt(0)));
		}
	}
	public static void function(int a[],int i,int n){
		if(i>=n){
			ans+=1;
			return;	
		}else{
			if(a[i]==1){
				if(i<n-1){
					if(a[i+1]==0){
							function(a,i+1,n);	
					}else{
						 function(a,i+1,n);
						 function(a,i+2,n);
					}
				}else{
					 function(a,i+1,n);	
				}
				
			}else if(a[i]==2){
				function(a,i+1,n);
				function(a,i+2,n);
			}else{
				function(a,i+1,n);	
			}
			
			
		}
	} 
}
