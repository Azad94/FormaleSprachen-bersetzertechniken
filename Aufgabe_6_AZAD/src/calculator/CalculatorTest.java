package calculator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import calc_interpreter.*;
import calc_parse_tree.*;

public class CalculatorTest {
	
	final String newLineCharacter = "\n";
	
  @Test
  public void f(String string, int erg) {
	  int localErg = 0;
	  ANTLRInputStream input = new ANTLRInputStream(string.toCharArray(), string.length());
      calcLexer lexer = new calcLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      calcParser parser = new calcParser(tokens);
      localErg = new EvalVisitor().visit(parser.prog());
      Assert.assertTrue(erg == localErg);
  }
  
  @Test(dataProvider = "dataObjects")
  public void f2(String s, int erg) {
      ANTLRInputStream input = new ANTLRInputStream(s.toCharArray(), s.length());
      calc_interpreterParser parser = new calc_interpreterParser(null); // share single parser instance
      parser.setBuildParseTree(false); 
      calc_interpreterLexer lexer = new calc_interpreterLexer(input);
      lexer.setLine(0);           // notify lexer of input position
      lexer.setCharPositionInLine(0);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      parser.setInputStream(tokens); // notify parser of new token stream
      parser.prog();                 // start the parser
      System.out.println(erg + " <- " + s);
  }
  
  @DataProvider
  public Object[][] dataObjects() {
	  return new Object[][] {
	    	new Object[] { " 8 * 5" + newLineCharacter, 40},
			new Object[] { "2^8<10" + newLineCharacter,0},
			new Object[] { "a = 5+2" + newLineCharacter + "a+7" + newLineCharacter,14},
			new Object[] { "a = 5+2" + newLineCharacter  + "#" + newLineCharacter+ "a+7" + newLineCharacter,7},
	    };
  }
}
