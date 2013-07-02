#include<stdio.h>
int main(){
	int t;
	long long int n;
	scanf("%d",&t);
	int i;
	for( i=0;i<t;i++){
		scanf("%lld",&n);
		printf("%lld\n",((n*(3*n+1))/2)%1000007);
	}
	return 0;
}
