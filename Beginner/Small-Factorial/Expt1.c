#include<stdio.h>
#include<math.h>
int main()
{
	int n,i=0,f=1,j,in;
	
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&in);
		for(j=2;j<=in;j++)
			f*=j;
		printf("%d\n",f);
		f=1;
	}
	return 0;
}
