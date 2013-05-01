#include<stdio.h>
int main(){
        int x;
        scanf("%d",&x);
        int i=1;
        x=x-1;
        while(x!=-2){
                if(x==0){
                        i=0;
                        printf("Y\n");
                }else if(x%6==0){
                        int n=2;
                        int t=3*n*n-3*n;
                        while(t<=x){
                           t=3*n*n-3*n;
                                if(x==t){
                                        i=0;
                                        printf("Y\n");
                                        break;
                                }
                        n++;
                        }
                }
                if(i==1){
                        printf("N\n");
                        i=1;
                }
                int y;
                scanf("%d",&y);
                x=y-1;
                i=1;
        }
        return 0;
}

