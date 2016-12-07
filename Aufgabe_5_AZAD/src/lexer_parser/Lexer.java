package lexer_parser;

import lexer_parser.Token;

/***
 * Excerpted from "Language Implementation Patterns", published by The Pragmatic
 * Bookshelf. Copyrights apply to this code. It may not be used to create
 * training material, courses, books, articles, and the like. Contact us if you
 * are in doubt. We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book
 * information.
 ***/
public abstract class Lexer {
	public static final char EOF = (char) -1;
	public static final int EOF_TYPE = 1;
	String input;
	int p = 0;
	char c;

	public Lexer(String input) {
		this.input = input;
		c = input.charAt(p);
	}

	/** prüfe EOF */
	public void consume() {
		p++;
		if (p >= input.length())
			c = EOF;
		else
			c = input.charAt(p);
	}

	/** prüft das x auch wirklich das nächste zeichen ist */
	public void match(char x) {
		if (c == x)
			consume();
		else
			throw new Error("expecting " + x + "; found " + c);
	}

	public abstract Token nextToken();

	public abstract String getTokenName(int tokenType);
}
