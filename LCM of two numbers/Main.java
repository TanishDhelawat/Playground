// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int i,a,b,gcd,max,lcm;
  scanf("%d %d",&a,&b);
  if(a<b){
    max=a;
  }
  else{
    max=b;
  }
  for(i=max;i>-1;i--){
  if(a%i==0&&b%i==0){
    gcd=i;
    break;
  }
    else{
      gcd=1;
  }
  }
  lcm=(a*b)/gcd;
  printf("%d",lcm);
   return 0;
}