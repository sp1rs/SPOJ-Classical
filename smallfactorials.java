import java.util.Scanner;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        String s=sc.next();
                        BigInteger bi=new BigInteger(s);
                        System.out.println(fact(bi));
                }
        }
        public static BigInteger fact(BigInteger t){
                if(t.equals(BigInteger.ONE) || t.equals(BigInteger.ZERO))
                        return BigInteger.ONE;

                else
                        return t.multiply(fact(t.subtract(BigInteger.ONE)));


        }
}

