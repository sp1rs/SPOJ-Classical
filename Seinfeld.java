import java.util.*;
public class Seinfeld{
	public static void main(String[] args){
		Stack<Character> st=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
		int change=0;
		int k=1;
		while(s.charAt(0)!='-'){
			change=0;
			for(int i=0;i<s.length();i++){
				if(st.empty()){
					if(s.charAt(i)=='}'){
						change++;
						s.setCharAt(i,'{');
					}
					st.push(s.charAt(i));
				}else{
					if(s.charAt(i)=='}'){
						if(st.peek()=='{'){
							st.pop();
						}else{
							st.push(s.charAt(i));
						}
					}else{
						st.push(s.charAt(i));
					}
				}
			}
			int x=0;
			while(!st.empty()){
				st.pop();
				x++;	
			}
			change+=x/2;
			System.out.println(k+". "+change);
			k++;
			str=sc.next();	
			s=new StringBuffer(str);
		}
	}
}
