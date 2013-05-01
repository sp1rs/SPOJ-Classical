#include<stdio.h>
#include<string.h>
int main()
{
 char str[1005];
 unsigned long long int b,a,ans,len,t;
 scanf("%llu",&t); 
 while(t--){
 scanf("%s",str);
 scanf("%llu",&b);
  len=strlen(str);
 //printf("%s\n",str); 
 a=str[len-1]-'0'; 
 if(b==0&&a!=0) ans=1;  
 else{
 if(a==0){ ans=0; goto end;}
 if(a==5) {ans=5; goto end;}
 switch(b%4){
 case 0: ans=a%2!=0? 1:6;
  break;
 case 1: ans=a;
  break;
 case 2: ans=a*a%10;
  break;
 default : ans=a*a*a%10;
  break; 
 }
 }
 end :
 printf("%llu\n",ans);
 }
 return 0;
}

