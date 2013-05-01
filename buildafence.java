import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                double t=sc.nextDouble();
                double x=(double)1/(2*Math.PI);
                while(t!=0){
                        double area=(double)(1/(2*Math.PI))*t*t;
                        System.out.printf("%.2f\n",area);
                        t=sc.nextDouble();
                }
        }
}

