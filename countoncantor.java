import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        int n=sc.nextInt();
                        double d=Math.sqrt((double )n*2);
                        long x=Math.round(d);
                        long y=((x-1)*(x))/2 + 1;
                        if(x%2==0){
                                y=n-y+1;
                                System.out.println("TERM "+n+" IS "+ y+"/"+(x-y+1));
                        }else{
                                y=n-y+1;
                                System.out.println("TERM "+n+" IS "+(x-y+1) +"/"+y);
                        }
                }
        }
}

