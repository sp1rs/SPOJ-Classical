import java.util.Scanner;
import java.io.*;
class problem4564{
	static int digit[];
	static int length=0;
//	static int ans;
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int cas=1;
		while(!s.equals("bye")){
		
			char c[]=s.toCharArray();
//			ans=0;
			digit=new int[s.length()];
			length=s.length();	
			for(int i=0;i<s.length();i++){
				digit[i]=(int)c[i] - 48 ;	
//				System.out.println(digit[i]);
			}
			System.out.println(cas++ +". "+solve(0,0));
			
			s=sc.next();

		}
	}

	static int solve(int pos,int prevsum){
		int sum=0;
		int ans=0;
		if(pos==length)
			return 1;
		for(int i=pos;i<length;i++){
			sum+=digit[i];
			if(sum>=prevsum){
				ans+=solve(i+1,sum);	
			}
		}
		return ans;
	}
}
