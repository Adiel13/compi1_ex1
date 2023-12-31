package compi1.ex1;

import java.io.*;
import java.util.ArrayList;

%%
%public
%class lexEx1
%function next_token

digito = [0-9]
letra = [a-zA-Z]

%type token
%eofval{
	return new token(constantes.EOF,null, -1,-1, null);
%eofval}
%%

<YYINITIAL>{letra}({letra}|{digito})* {return new token (constantes.ID, yytext(), yyline, yycolumn, "l(l|d)*");}
<YYINITIAL>{digito}({digito})* {return new token (constantes.NUM, yytext(), yyline, yycolumn, "dd*");}
<YYINITIAL>"=" {return new token (constantes.IG, yytext(), yyline, yycolumn, "=");}

\n {yychar=1;}
. {System.err.println("warning: Unrecognized character '" + yytext()+"' -- ignored" + " at : "+ (yyline+1) + " " + (yycolumn+1) + " " + yychar);}

