#include<stdio.h>
int main()
{
  int f,l,x;
  scanf("%d",&x);
  l=x%10;
  f=x/100;
  printf("%d",l+f);
  return 0;
}