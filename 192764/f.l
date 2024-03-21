%{
	#include<stdio.h>
	int v=0;
	int c=0;
%}

%%
[aeiouAEIOU] {v++;}
[a-zA-Z] {c++;}
"\n" {printf("no of vowels=%d \n no of consonants=%d",v,c);}
%%
int yywrap(){}
int main()
{
	printf("enter the string:");
	yylex();
	
	return 0;
}

