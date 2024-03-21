%{
	#include<stdio.h>
	int flag = 0;
%}

%token NUMBER
%left '+' '-'
%left '*' '/' '%' 
%left '(' ')'

%%
ArithmeticExpression:E{
	printf("\n result = %d\n",$$);
	return 0;
	
}
E:E'+'E {$$=$1+$3;}
|E'-'E {$$=$1-$3;}
|E'*'E {$$=$1*$3;}
|E'/'E {$$=$1/$3;}
|E'%'E {$$=$1%$3;}
|'('E')' {$$=$2;}
|NUMBER {$$=$1;}
%%

void main()
{
	printf("Enter any arithmetic expression: \n");
	yyparse();
	if(flag == 0)
	{
		printf("Entered arithmetic expression is valid");
	}
}
void yyerror()
{	
	printf("Entered arithmetic expression is Invalid");
	flag = 1;
}
}

