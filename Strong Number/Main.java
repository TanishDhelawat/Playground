
#include <stdio.h>
int main() {
	int n,x,fact,sum=0,digit,i;
	scanf("%d", &n);
	x=n;
  while(n!=0){
  digit=n%10;
    fact=1;
    for(i=1;i<=digit;i++){
      
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
     if(x==sum){
	        printf("Yes");
	   }
  else
    printf("No");
    
	return 0;
}