#include<stdio.h>

int main()
{
  int a[4],i;
  for(i=0;i<4;i++){
    scanf("%d",&a[i]);
  }
  for(i=0;i<4;i++){
    for(int j=0;j<3;j++){
    int temp;
      if(a[j+1]<a[j]){
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
  printf("%d",a[0]);
}