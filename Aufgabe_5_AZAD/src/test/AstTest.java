package test;

import org.junit.Test;
import static org.junit.Assert.*;
import ast.HeteroAST;
import lexer_parser.*;
import visitor.IndependentToStringVisitor;

public class AstTest {

	//" 3 + 4 + 5 * (5 / 4)\n"
	@Test
	public void VTest(){
		RecDesLexer lexer4 = new RecDesLexer("3+2*7-2\n");
		RecDesParser parser4 = new RecDesParser(lexer4);
		IndependentToStringVisitor i = new IndependentToStringVisitor();
		i.print(parser4.statlist());
	}
}