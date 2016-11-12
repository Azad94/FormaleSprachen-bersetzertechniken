package main;

import recDescent.*;

public class TestRecLexer {

	public static void main(String[] args) {

		//Lexer lexer = new RecursiveDescentLexer("ab = 10 - 23\n + i3");
		Lexer lexer = new RecDesLexer("5 + (10 - 23)\n");
		Token t = lexer.nextToken();
        while ( t.type != Lexer.EOF_TYPE ) {
            System.out.println(t);
            t = lexer.nextToken();
        }
	}

}