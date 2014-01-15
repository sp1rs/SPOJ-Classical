import java.util.*;
public class sweetandsourrock{
	public static int n=0;
	public static String s;
	public static int dp[];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();	
		for(int l=0;l<t;l++){
			n=sc.nextInt();
			dp=new int[n];
			for(int i=0;i<n;i++){
				dp[i]=-1;
			}
			s=sc.next();
			System.out.println(fun(0));
		}
	}
	public static int max(int i,int j){
		if(i>j)
			return i;
		else 	
			return j;
	}
	public static int fun(int i){
		if(i==n){
			return 0;
		}
		int ret=dp[i];
		if(ret!=-1){
			return ret;
		}else{

			ret=0;
			int sour=0;int sweet=0;
			for(int k=i;k<n;k++){
				if(s.charAt(k)=='1') sweet++;
				if(s.charAt(k)=='0') sour++;
				if(sweet>sour){
					dp[i]=max(dp[i],fun(k+1)+sweet+sour);
				}else{
					dp[i]=max(dp[i],fun(k+1));
				}
			}
			return dp[i];
		}
	}
}
