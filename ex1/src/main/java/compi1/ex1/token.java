package compi1.ex1;

public class token {
	private constantes tokenType;
	private String lexema;
	private String ER;
	private int line;
	private int column;
	
	public token(constantes tokenType, String lexema, int line, int column, String ER) {
		this.tokenType= tokenType;
		this.lexema = lexema;
		this.line = line;
		this.column = column;
		this.ER = ER;
	}
	
	public void setTokenType(constantes tokenType) {
		this.tokenType= tokenType;
	}
	
	public constantes gettokenType() {
		return this.tokenType;
	}
	
	public String getLexema() {
		return this.lexema;
	}
	
	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	
	public String getER() {
		return this.ER;
	}
	
	public void setER(String ER) {
		this.ER = ER;
	}
	
	public int getLine() {
		return this.line;
	}
	
	public void setLine(int line) {
		this.line= line;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
}
