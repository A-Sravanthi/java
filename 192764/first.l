%{
 	#include<stdio.h>
 	#include<stdlib.h>
%}
%%
[A-Z]+ {ECHO; printf("Non Tenminal:%S",yytext);}
[a-z]+ {ECHO; printf("Tenminal:%s",yytext);}
"->" {}
%%
int yywrap() {}
int main()
{
	yylex();
}

