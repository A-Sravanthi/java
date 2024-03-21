%{
	#include<stdio.h>
	#include<stdlib.h>
%}

%%
\/\/(.*) {};
\/\*(.*\n)*.*\*\/ {};


%%

int yywrap() {}
int main()
{
	yylex();
	yyin=fopen("input.c","r");
	yyout=fopen("output.c","w");
	return 0;
}
