import java.io.*;
public class Main{
        public static void main(String[] args) throws IOException{
                BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
                int t=Integer.parseInt(inp.readLine());
                for(int j=0;j<t;j++){
                        int t1=Integer.parseInt(inp.readLine());
                        String s=inp.readLine();
                        int a[]=new int[8];
                        for(int i=0;i+2<s.length();i++){
                                String s1=s.substring(i,i+3);
                                if(s1.equals("TTT")){
                                        ++a[0];
                                }else if(s1.equals("TTH")){
                                        ++a[1];
                                }else if(s1.equals("THT")){
                                        ++a[2];
                                }else if(s1.equals("THH")){
                                        ++a[3];
                                }else if(s1.equals("HTT")){
                                        ++a[4];
                                }else if(s1.equals("HTH")){
                                        ++a[5];
                                }else if(s1.equals("HHT")){
                                        ++a[6];
                                }else if(s1.equals("HHH")){
                                        ++a[7];
                                }
                        }
                        System.out.print(t1+" ");
                        for(int k=0;k<8;k++){
                                System.out.print(a[k]+" ");
                        }
                        System.out.println();
                }
        }
}

