import java.io.*;
public class flowersflourishfromfrance{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		while(!str.equals("*")){
			String s[]=str.split(" ");
			int i=0;
			int done=0;
			while(i<s.length-1){
				if(s[i].charAt(0)==s[i+1].charAt(0) || s[i].charAt(0)==(char)(s[i+1].charAt(0)-32) || s[i].charAt(0)==(char)(s[i+1].charAt(0)+32))
					i++;
				else
					break;
			}
			if(i==s.length-1)
				System.out.println("Y");
			else
				System.out.println("N");
			str=br.readLine();	
	
		}
	}
}
