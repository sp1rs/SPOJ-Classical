import java.util.Scanner;
public class Main{

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int l=0;l<t;l++){
                        int n=sc.nextInt();
                        int m=sc.nextInt();
                        n=reverse(n);
                        m=reverse(m);
                        int sum=n+m;
                        System.out.println(reverse(sum));
                }
        }
        public static int reverse(int x){
                int i=10;
                int y=0;
                int sum=0;
                do{
                        y=x%10;
                        x=x/10;
                        sum=sum*i+y;
                //      i=i*10;
                }while(x!=0);
                return sum;
        }
}


