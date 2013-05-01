import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                long x=sc.nextInt();

                if(x%10==0){
                System.out.println("2");
                }
                else{
                System.out.println("1");
                System.out.println(x%10);
                }
        }
}

