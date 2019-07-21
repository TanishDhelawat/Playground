#include <stdio.h>
int main() {
	int n,sum=0,b,a;
  scanf("%d",&n);
  b=n%10;
  while(n!=0){
    a=n%10;
    n=n/10;
  }
  sum=a+b;
printf("%d",sum);
  return 0;
}