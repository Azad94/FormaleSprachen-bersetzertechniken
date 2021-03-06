package expr;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	
	public static void validate(String expression){
		
		ANTLRInputStream input = new ANTLRInputStream(expression);
		ExpRecLexer lexer = new ExpRecLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExpRecParser parser = new ExpRecParser(tokens);
		
		ParseTree tree = parser.stat();
		System.out.println(tree.toStringTree(parser) + "\n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate("1 + 2\n");
		validate("1 - 2\n");
		validate("2 ^ 2 ^ 3\n");
		validate("1 / 2\n");
	}
}