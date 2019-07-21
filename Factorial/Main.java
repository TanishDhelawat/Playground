#include<stdio.h>
int main()
{
	long int f=1 ,n;
  scanf("%ld",&n);
  for(int i=1;i<=n;i++){
    f=f*i;
}
  printf("%ld",f);
  return 0;
}