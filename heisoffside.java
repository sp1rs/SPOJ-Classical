import java.util.Scanner;
import java.util.Arrays;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int d=sc.nextInt();
                while(a!=0 || d!=0){
                int att[]=new int[a];
                int def[]=new int[d];
                for(int i=0;i<a;i++){
                        att[i]=sc.nextInt();
                }
                for(int j=0;j<d;j++){
                        def[j]=sc.nextInt();
                }
                Arrays.sort(att);
                Arrays.sort(def);
                int k=0;
                if(att[0]>=def[0] && att[0]>=def[1]){
                        System.out.println("N");
                }else {
                        System.out.println("Y");
                }
                a=sc.nextInt();
                d=sc.nextInt();
        }
        }
}

