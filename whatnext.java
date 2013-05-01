import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                int n3=sc.nextInt();
                while(n1!=0 || n2!=0 || n3!=0){
                        if(n2-n1==n3-n2){
                                int x=2*n3-n2;
                                System.out.println("AP "+x);
                        }else{
                                int x=n3/n2*n3;
                                System.out.println("GP "+x);
                        }
//              System.out.println();
                 n1=sc.nextInt();
                 n2=sc.nextInt();
                 n3=sc.nextInt();
                }
        }
}

