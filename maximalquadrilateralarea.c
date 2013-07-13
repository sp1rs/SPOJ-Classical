#include<stdio.h>
#include<math.h>
int main(){
	int t;
	scanf("%d",&t);
	int i=0;
	for(i=0;i<t;i++){
		double a,b,c,d;
		scanf("%lf%lf%lf%lf",&a,&b,&c,&d);
		double s=(a+b+c+d)*0.5;
		double area=(s-a)*(s-b)*(s-c)*(s-d);
		area=sqrt(area);
		printf("%.2lf\n",area);
	}
}
