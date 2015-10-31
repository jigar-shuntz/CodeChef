#include<stdio.h>
#include<math.h>
int main()
{
	int n,i=0,t,in,p=1,sum;
	
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&in);
		while(1)
		{
			t=in/pow(5,p);
			sum=sum+t;
			p++;
			if(pow(5,p)>in)
			break;
		}	
		printf("%d\n",sum);
		sum=0;
		p=1;
	}
	return 0;
}
