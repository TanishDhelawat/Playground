#include<stdio.h>
int main()
{
 int a=0,b=1,i,n;
  scanf("%d",&n);
  if(n==0)
    printf("%d",a);
  if(n==1){
    printf("%d %d",&a,&b);
  }
    if(n>=2){
      printf("%d %d ",a,b);
  for(i=2;i<n;i++){
    int temp;
    temp=b;
    b=a+b;
    a=temp;
    printf("%d ",b);
  }}
  return 0;
}