#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,img,d,r1,r2;
  scanf("%f %f %f",&a,&b,&c);
  d=(b*b);
  
     d-=(4*a*c);
  
  if(d==0){
    r1=(-b)/2*a;
    r2=r1;
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(d>0){
    r1=((-b)+sqrt(d))/2*a;
    r2=((-b)-sqrt(d))/2*a;
     printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
     else{
       r1=-b/(2*a);
       img=sqrt(-d)/(2*a);
   printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",r1,img,r1,img);
  
}
     }