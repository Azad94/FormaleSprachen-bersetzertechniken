package main;

import recDescent.*;

public class TestRecParser {

	public static void main(String[] args) {

		//	" value = (10 - 23)\n"
		//	" value = (a + 10 - 23)\n"
		// 	" 1 + 2 + 3\n"
		Lexer lexer = new RecDesLexer(" 5 + (10 - 23)");
		RecDesParser parser = new RecDesParser(lexer);
		parser.statlist();
	}
}
