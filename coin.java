import java.io.*;
class coin{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String str[]=s.split(" ");
		int k=Integer.parseInt(str[0]);
		int l=Integer.parseInt(str[1]);
		int m=Integer.parseInt(str[2]);
		int dp[]=new int[1000001];
//		dp[1]=1;
//		dp[k]=1;
//		dp[l]=1;
		dp[0]=0;
		for(int i=1;i<1000001;i++){
			dp[i]=0;
			if(i-1>=0 && dp[i-1]==0) 
				dp[i]=1;
			if(i-k>=0 && dp[i-k]==0)
				dp[i]=1;
			if(i-l>=0 && dp[i-l]==0)
				dp[i]=1;

/*
			if(dp[i-1]==dp[i-k] && dp[i-k]==dp[i-l]){
				dp[i]=2;	
			}else{
				dp[i]=1;	
			}
		*/
		}
		s=br.readLine();
		str=s.split(" ");
		String st="";
		for(int i=0;i<m;i++){
			int x=Integer.parseInt(str[i]);
			
			if(dp[x]==1){
				st+="A";

			}else{
				st+="B";	
			}
		}
		System.out.println(st);
	}	
}
