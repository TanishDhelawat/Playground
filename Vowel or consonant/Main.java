#include<stdio.h>
int main()
{
 char c,i;
  scanf("%c",&c);
  
  if(c=='a'||c=='A'||c=='e'||c=='E'||c=='o'||c=='O'||c=='i'||c=='I'||c=='u'||c=='U'){
    printf("Vowel");
  }
  else
    printf("Consonant");
  return 0;
}