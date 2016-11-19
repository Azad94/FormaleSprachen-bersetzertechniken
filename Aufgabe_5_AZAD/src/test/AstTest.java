package test;

import org.junit.Test;
import static org.junit.Assert.*;
import ast.HeteroAST;
import lexer_parser.*;

public class AstTest {

	@Test
	public void test() {
		Lexer lexer = new RecDesLexer("100 + 200\n");
		RecDesParser parser = new RecDesParser(lexer);
		HeteroAST ast = parser.statlist();
		System.out.println(ast.toStringTree());
		
		lexer = new RecDesLexer("200 * 50\n");
		parser = new RecDesParser(lexer);
		ast = parser.statlist();
		System.out.println(ast.toStringTree());
		
		lexer = new RecDesLexer("100 + 200 * 50\n");
		parser = new RecDesParser(lexer);
		ast = parser.statlist();
		System.out.println(ast.toStringTree());

		lexer = new RecDesLexer("(100 + 200) * 50\n");
		parser = new RecDesParser(lexer);
		ast = parser.statlist();
		System.out.println(ast.toStringTree());
		
		lexer = new RecDesLexer("1 - 2 + (3 * 4) - 5\n");
		parser = new RecDesParser(lexer);
		ast = parser.statlist();
		System.out.println(ast.toStringTree());
		
		lexer = new RecDesLexer("100 / variable\n");
		parser = new RecDesParser(lexer);
		ast = parser.statlist();
		System.out.println(ast.toStringTree());
	}
}