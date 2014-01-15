import java.util.Scanner;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
class subarrays{
        public static void main(String[] args) throws IOException,NumberFormatException{
       //         Scanner sc=new Scanner(System.in);
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int t=Integer.parseInt(br.readLine());
//              long t=Long.parseLong(br.readLine());

                long s[]=new long[t];
		String s1=br.readLine();
		String str[]=s1.split(" ");
                for(int i=0;i<t;i++){
                        s[i]=Long.parseLong(str[i]);

                }
//              int k=sc.nextInt();
                int k=Integer.parseInt(br.readLine());
		LinkedList<Integer> q=new LinkedList<Integer>();
		int i;
		for( i=0;i<k;++i){
			while(q.size()!=0 && s[i]>s[(int)q.peek()])
				q.remove();
			q.add(i);
		}
		
		for(;i<t;++i){
			
			System.out.print(s[q.peekFirst()]+" ");
			while(q.size()!=0 && q.peekFirst()<=i-k){
		//		System.out.print(" SDF " +q.peekFirst());
				q.removeFirst();
				
			}
			while(q.size()!=0 && s[i]>=s[q.peekLast()])
				q.removeLast();
			q.add(i);
		}
		System.out.print(s[q.peek()]);
              
        }
}

