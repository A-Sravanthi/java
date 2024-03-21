%{
	int lc=0,sc=0,tc=0,ch=0,c=0,wc=0;
%}

%%
[\n] {lc++;}
[\t] {tc++;}
[" "] {sc++;}
[.] {ch++;c++;}
[a-zA-Z0-9]+ {wc++; c=c+yyleng;}
[@] {return 0;}
%%
 int yywrap(){}
 int main()
 {
 	yylex();
 	printf("lines counts %d\n",lc);
 	printf("space counts %d\n",sc);
 	printf("tabs counts %d\n",tc);
 	printf("charecter counts %d\n",c);
 	printf("words counts %d\n",(wc+ch));
 }
 
