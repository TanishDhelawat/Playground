#include<math.h>
#include<stdio.h>
int main()
{
  float a,b,h;
  scanf("%f %f",&a,&b);
  h=sqrt(pow(a,2)+pow(b,2));
  printf("%.2f",h);
  return 0;
}