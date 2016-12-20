package calcTest;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import grammar.*;
import visitor.TestEvaluator.EvaluatorWithProps;

public class NewTest {
	
	final String end = "\n";
	
  
	@Test(dataProvider = "dp")
	  public void f(String s, int erg) {
		  int localErg =0;
	      ANTLRInputStream input = new ANTLRInputStream(s.toCharArray(), s.length());
	      LExprLexer lexer = new LExprLexer(input);
	      CommonTokenStream tokens = new CommonTokenStream(lexer);
	      LExprParser parser = new LExprParser(tokens);
	      parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
	      ParseTree tree = parser.p(); // parse
	      // show tree in text form
	      System.out.println(tree.toStringTree(parser));

	      ParseTreeWalker walker = new ParseTreeWalker();
	      EvaluatorWithProps evalProp = new EvaluatorWithProps();
	      walker.walk(evalProp, tree);
	      localErg = evalProp.getValue(tree);
	      System.out.println(localErg + " = " + erg);
	      Assert.assertTrue(erg == localErg);
	  }
	  
  
  @DataProvider
  public Object[][] dp() {

    return new Object[][] {
    	new Object[] { " 5 * 5" + end,25},
    	new Object[] { " ( 3 + 4 ) * 5" + end,35},
    };
  }
}
