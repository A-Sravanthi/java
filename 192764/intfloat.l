%{
	#include<stdio.h>
	int ni=0,nf=0;
%}

%%
[0-9]+"."[0-9]+ {ECHO; printf(" is decimal number\n"); nf++; }
[0-9]+ {ECHO; printf(" is integer number\n"); ni++; }
\n return 0;
%%
int yywrap() {}
int main()

{
  yylex();
printf("no.of decimal numbers: %d\nno of interger numbers: %d",nf,ni);
  return 0;
  
}
