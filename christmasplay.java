import java.util.*;
import java.io.*;
class christmasplay{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s=br.readLine();
			String str[]=s.split(" ");
			int n=Integer.parseInt(str[0]);
			int k=Integer.parseInt(str[1]);
			s=br.readLine();
			str=s.split(" ");
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(str[i]);
			Arrays.sort(arr);
			int min=1000000001;
			int i=0;
			while(i+k-1<n){
//				System.out.println(arr[i+k-1]-arr[i]);
				if(arr[i+k-1]-arr[i]<min){
					min=arr[i+k-1]-arr[i];	
				}
				i+=1;
			}
			System.out.println(min);
		}
		
	}	
}
