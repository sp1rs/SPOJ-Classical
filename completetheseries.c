#include<stdio.h>

int main(){
	int t;
	scanf("%d",&t);
	int i;
	for(i=0;i<t;i++){
		long long int x,y,sum;
		scanf("%lld%lld%lld",&x,&y,&sum);
		long long int n=2*sum/(x+y) ;
		long long int d=(x-y)/(5-n) ;
		long long int a=(3*x-n*x+2*y)/(5-n);
		printf("%lld\n",n);
		int j;
		for(j=1;j<=n;j++){
			long long int temp=a+(j-1)*d;
			printf("%lld ",temp);
		}
		printf("\n");
	}
	return 0;
}
