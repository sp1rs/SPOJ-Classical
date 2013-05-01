import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        int n=sc.nextInt();
                        int r=0;
                        while(n>0){
                                n=n/5;
                                r+=n;
                        }
                        System.out.println(r);
                }
        }
}


