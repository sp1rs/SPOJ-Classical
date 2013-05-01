import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                String s[]=new String[5];
                int x=0;
                int a[]=new int[5];
                for(int i=0;i<t;i++){
                        for(int j=0;j<5;j++){
                                s[j]=sc.next();
                                if(s[j].contains("machula")){
                                        x=j;
                                }else if(j!=1 && j!=3){
                                a[j]=Integer.parseInt(s[j]);
                                }
                        }

                        if(x==0){
                                System.out.println((a[4]-a[2])+" "+"+"+" "+a[2]+" "+"="+" "+a[4]);
                        }else if(x==2){
                                 System.out.println(a[0]+" "+"+"+" "+(a[4]-a[0])+" "+"="+" "+a[4]);

                        }else if(x==4){
                                 System.out.println(a[0]+" "+"+"+" "+a[2]+" "+"="+" "+(a[2]+a[0]));

                        }

                }
        }
}


