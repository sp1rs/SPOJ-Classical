#include<stdio.h>
int main(){
        unsigned long long x=1;
        scanf("%llu",&x);
        int p=0;
        while(x!=1){
                if(x%2==0){
                        x=x >> 1;
                }else{
                        p=1;
                        printf("NIE\n");
                        break;
                }
        }
        if(p==0)
                printf("TAK\n");
        return 0;
}

