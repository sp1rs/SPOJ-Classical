import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t!=-1){
                        int max=0;
                        int i=0;
                        int sum=0;
                        int sum1=0;
                        int m[]=new int[t];
                        while(i<t){
                                 m[i]=sc.nextInt();
                                sum+=m[i++];
                        }
                        Arrays.sort(m);
                        if(sum%t==0){
                                int x=sum/t;
                                i=t-1;
                                while(i>=0){
                                        if(m[i]>x){
                                                sum1+=m[i--]-x;
                                        }else{
                                                break;
                                        }
                                }
                                System.out.println(sum1);
                        }else{
                                System.out.println("-1");
                        }
                        t=sc.nextInt();
                }
        }
}


