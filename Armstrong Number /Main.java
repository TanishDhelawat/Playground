
#include <stdio.h>
#include <math.h>
int main() {
	int n,sum=0,x,fact,digit,i,count=0,a;
	scanf("%d", &n);
	x=n;
  while(n!=0){
  n=n/10;
    count++;
  }
  a=count;
  n=x;
    for(i=1;i<=count;i++){
      digit=n%10;
    sum=sum+pow(digit,a);
   
      n=n/10;
  }
     if(x==sum){
       
	        printf("Armstrong Number");
	   }
  else
    printf("Not an Armstrong Number");
    
	return 0;
}

