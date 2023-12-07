package compi1.ex1;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "----- Ejemplo 1 -----" );
        String entrada = "var=10";
        Reader sr = new StringReader(entrada);
        lexEx1 lx = new lexEx1(sr);
        
        token tk = lx.next_token();
        while(tk.getLexema()!=null) {
        	System.out.println(tk.gettokenType());
        	tk = lx.next_token();
        }
        System.out.println( "----- Fin ejemplo 1 -----" );

    }
}
