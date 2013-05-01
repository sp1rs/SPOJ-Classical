import java.util.Scanner;
import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        int n=sc.nextInt();
                        int m[]=new int[n];
                        int w[]=new int[n];
                        int x=0;
                        while(x<n){
                                m[x++]=sc.nextInt();
                        }
                        Arrays.sort(m);
                        x=0;
                        while(x<n){
                                w[x++]=sc.nextInt();
                        }
                        Arrays.sort(w);
                        x=0;
                        int sum=0;
                        while(x<n){
                                sum+=m[x]*w[x];
                                x++;
                        }
                        System.out.println(sum);
                }
        }
}

