package main;

import recDescent.*;

public class TestRecParser {

	public static void main(String[] args) {

		Lexer lexer = new RecDesLexer(" 5 + (10 - 23)\n");
		RecDesParser parser = new RecDesParser(lexer);
		parser.statlist();
		
		lexer = new RecDesLexer(" value = (10 - 23)\n");
		parser = new RecDesParser(lexer);
		parser.statlist();
		
		lexer = new RecDesLexer(" value = (a + 10 - 23)\n");
		parser = new RecDesParser(lexer);
		parser.statlist();
		
		lexer = new RecDesLexer("1 + 2 + 3\n");
		parser = new RecDesParser(lexer);
		parser.statlist();
	}
}