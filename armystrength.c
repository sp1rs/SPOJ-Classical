#include<stdio.h>
int main(){
        int t;
        int max1=0;
         int max2=0;
        int i;
        scanf("%d",&t);
        for(i=0;i<t;i++){
                int n=0;
                int m=0;
                int j=0;

                scanf("%i%i",&n,&m);
                while(n>0){
                       scanf("%i",&j);
                        if(j>max1)
                                max1=j;
                        n--;
                }
                while(m>0){
                        scanf("%i",&j);
                        if(j>max2)
                                max2=j;
                        m--;
                }
                if(max1>=max2)
                        printf("Godzilla\n");
                else
                        printf("MechaGodzilla\n");

                max1=0; 
                max2=0;         
        }
                return 0;
}

