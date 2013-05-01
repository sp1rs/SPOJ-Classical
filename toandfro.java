import java.util.Scanner;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
			String s=sc.next();
			char[] sa=s.toCharArray();
			ArrayList a=new ArrayList();
			int l=0;
			while(s.length()>l){		
				a.add(l,sa[l]);
				l++;
			}
			int n=2*t;
//			System.out.println(n);

 			while(a.size()!=0){
			   System.out.print(a.get(0));
                            a.remove(0);
				n=n-2;
				int x=0;
				x=x+n;
				while(x<a.size()){
					System.out.print(a.get(x));
					a.remove(x);
					if(x<a.size()){
						System.out.print(a.get(x));
						a.remove(x);
					}	
					x+=n;
				}
			}
			System.out.println();
			t=sc.nextInt();
		}
	}
}

