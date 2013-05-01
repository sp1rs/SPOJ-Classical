nclude<stdio.h>
#include <math.h>
int main(){
        int x;
        scanf("%d",&x);
        int i=0;
        long long  n;
        for(i=0;i<x;i++){
                scanf("%lld",&n);
                long  long  j=sqrt(n);
                long long k=j;
                long  long  l=0;
//              for( k=0;k<=j;k++){
                        while(l<=j+1 || k>=l){
                                if(l*l>n){
                                        printf("No\n");
                                        break;
                                }else if(k*k+l*l==n){
                                        printf("Yes\n");
                                        break;
                                }else{
                                        if(k*k+l*l<n){
                                                l++;
                                        }else{
                                                k--;
                                        }
                                }
                }
        }
        return 0;
}

