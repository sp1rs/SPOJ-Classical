import java.util.*;
public class gljive{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=0;
		int a[]=new int[10];
		while(t<10)
			a[t++]=sc.nextInt();
		int sum=0;
		t=0;
		while(t<10){
			sum+=a[t];
			if(sum>=100)
				break;
			t++;
		}
		
		if(t<=9){
			sum-=a[t];
			if((100-sum)>=(sum+a[t]-100))
				System.out.println(sum+a[t]);
			else
				System.out.println(sum);
		}else{
			System.out.println(sum);
		}
	}
}
