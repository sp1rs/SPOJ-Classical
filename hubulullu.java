import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        int n=sc.nextInt();
                        int s=sc.nextInt();
                        if(s==0){
                                System.out.println("Airborne wins.");
                        }else{
                                System.out.println("Pagfloyd wins.");
                        }
                }
        }
}

