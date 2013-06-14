import java.util.Scanner;
public class Main{
	public static int size=0;
	public static char arr[];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int k=0;k<t;k++){
			String s=sc.next();
			arr=new char[s.length()];
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='('){
					push(s.charAt(i));
				}else if(s.charAt(i)==')'){
					char x=pop();
					while(x!='('){
						System.out.print(x);
						x=pop();

					}
				}else if(Character.isLetter(s.charAt(i))){
					System.out.print(s.charAt(i));
				}else{
					int done=1;
					while(done==1){
						if(size>=1){
							char x=arr[size-1];
							if(test(x)>=test(s.charAt(i))){
								push(s.charAt(i));
								done=0;
							}else{
								System.out.print(pop());
							}
						}else{
			 				done=0;
						}
					}
				}
				
			}
			 System.out.println();

		}
	}
	public static void push(char c){
		arr[size++]=c;
	}
	public static char pop(){
		size=size-1;
		if(size>=0){
			return arr[size] ;
		}else{
			return 0;
		}

	}
	        public static int test(char c){
                int t=0;
                switch(c){
                        case '+':
                                t= 1;
                                break;
                        case '-':
                                t= 2;
                                break;
                        case '*':
                                t= 3;
                                break;
                        case '/':
                                t= 4;
                                break;
                        case '^':
                                t= 5;
                                break;
                        case '(':
                                t= 6;
                                break;
                }
                return t;
        }
}	

