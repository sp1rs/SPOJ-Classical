import java.util.Scanner;
class aconcretesimulation{
	public static void main(String[] args){
		int r[]=new int[1235];
		int c[]=new int[5679];
		for(int i=1;i<=1234;i++){
			r[i]=i;	
		}
		for(int i=1;i<=5678;i++){
			c[i]=i;	
		}
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
	//		String str[]=s.split(" ");
			char c1=s.charAt(0);
//			System.out.println(s);
			if(c1=='R'){
				int str1=sc.nextInt();
				int str2=sc.nextInt();
				int i=(str1);
				int j=(str2);
				int temp=r[i];
				r[i]=r[j];
				r[j]=temp;

			}else if(c1=='C'){
				int str1=sc.nextInt();
				int str2=sc.nextInt();
				int i=(str1);
				int j=(str2);
				int temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}else if(c1=='Q'){
				int str1=sc.nextInt();
				int str2=sc.nextInt();
				int i=(str1);
				int j=(str2);
				System.out.println(5678*(r[i]-1)+c[j]);
			}else if(c1=='W'){
				int val=sc.nextInt();
				int x=val;
			
				int i=x/5678 + 1 ;
				int j=x%5678;
				int k1,k2;
				if(j==0){
					j=5678;
					i-=1;
				}
				for(k1=1;k1<=1234;k1++){
					if(r[k1]==i)
						break;
				}
				for(k2=1;k2<=5678;k2++){
					if(c[k2]==j)
						break;
				}
				
				System.out.println(k1+" "+k2);
				
			}
		//	System.out.println(r[1]+" "+r[2]);
		}
	}	
}
