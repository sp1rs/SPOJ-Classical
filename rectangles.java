import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                int sum=0;
                int i=2;
                while(i*i<=t){
                        sum+=t/i-i+1;
                        i++;
                }
                sum+=t;
                System.out.println(sum);
        }
}

