%{
	 	#include<stdio.h>
	 	int length;
%}
%%
[a-zA-Z0-9]+ {length=yyleng;fun(length);}
%%
fun(int l)
{
	if(yytext[0]=='A')
	{
		if(l==3)
		{
			printf("%s is word length 3",yytext);
		}
	}
	else
	{
	 	printf("word is not starting with A");
	 }
	 }
	int yywrap() {}
	
int main()
{
	yylex();
	return 0;
}
	 
