import java.io.*;
public class treatsforthecows{
	public static int a[];
	public static int total=0;
	public static int multi=1;
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());	
		a=new int[t];
		for(int i=0;i<t;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		test(0,t-1);
		System.out.println(total);
	}
	public static void test(int i,int j){
		if(i<j){
			if(a[i]>=a[j]){
				total+=a[j]*multi;
				multi++;
				j--;
				test(i,j);
			}else{
				total+=a[i]*multi;
				multi++;
				i++;
				test(i,j);
			}
		}
	}
}
