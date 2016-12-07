package lexer_parser;

import lexer_parser.Lexer;
import lexer_parser.Token;

/***
 * Excerpted from "Language Implementation Patterns", published by The Pragmatic
 * Bookshelf. Copyrights apply to this code. It may not be used to create
 * training material, courses, books, articles, and the like. Contact us if you
 * are in doubt. We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book
 * information.
 ***/
public abstract class Parser {
	Lexer input;
	Token lookahead;
	Token nextToken;

	public Parser(Lexer input) {
		this.input = input;
		nextToken = input.nextToken();
		consume();
	}

	public void match(int x) {
		if (lookahead.type == x)
			consume();
		else
			throw new Error("expecting " + input.getTokenName(x) + "; found " + lookahead);
	}

	public void consume() {
		lookahead = nextToken;
		nextToken = input.nextToken();
	}
}