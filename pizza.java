import java.io.*;
public class pizza{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int a[]=new int[3];
		int t=Integer.parseInt(str);
		for(int i=0;i<t;i++){
			String x=br.readLine();
			if(x.equals("1/4")){
				a[0]++;
			}
			else if(x.equals("1/2")){
				a[1]++;
			}
			else{
				a[2]++;

			}
		}
		if(a[0]<=a[2]){
			a[0]=0;
			if(a[1]%2==0){
				a[1]=a[1]/2;
			}else{
				a[1]=a[1]/2 +1;
			}
		}else{
			a[0]=a[0]-a[2];
			if(a[1]%2==0){
                                a[1]=a[1]/2;
                        }else{
                                a[1]=a[1]/2 +1;
				if(a[0]<=2){
					a[0]=0;
				}else{
					a[0]-=2;
				}
                        }
		}
		if(a[0]!=0)
		a[0]=a[0]/4+1;
	
		int pizza=a[0]+a[1]+a[2]+1;
		System.out.println(pizza);
	}
}
