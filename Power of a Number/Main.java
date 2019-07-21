#include<stdio.h>
#include<math.h>
int main()
{
	long int b,p,n;
  scanf("%ld %ld %ld",&b,&p,&n);
  if(p<0){
    printf("Wrong input");
  }
  else{
  n=pow(b,p);
  printf("%ld",n);
  }
  return 0;
}