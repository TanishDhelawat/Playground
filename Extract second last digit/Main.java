#include<stdio.h>
int main()
{
  int x,l;
  scanf("%d",&x);
  l=x%100;
  l=l/10;
  printf("%d",l);
  return 0;
}