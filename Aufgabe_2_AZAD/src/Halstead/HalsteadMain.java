package Halstead;

import MultiSet.LinkedListMultiSet;
import MultiSet.Multiset;
import java.io.IOException;
import org.antlr.runtime.*;;

public class HalsteadMain {
	public static void main(String args[]) throws IOException 
	{
	CharStream input = null;
	// Pick an input stream (filename from commandline or stdin)
	try {
	      if (args.length > 0)
	        input = new ANTLRFileStream(args[0]);
	      else {
	        input = new ANTLRInputStream(System.in);
	        System.out.println("Eingabe");
	      }
	    } catch (IOException e) {
	      System.err.println("Quelle nicht gefunden!");
	      System.exit(1);
	    }
	HalsteadLexer lex = new HalsteadLexer(input);
	Token t=  lex.nextToken();
	
	Multiset<String> memoryOperators = new LinkedListMultiSet<String>();
	Multiset<String> memoryOperands = new LinkedListMultiSet<String>();
	Multiset<String> memoryIgnore = new LinkedListMultiSet<String>();
	
	Halstead hal;
	
	while ( t==null || t.getType()!= HalsteadLexer.EOF)
	{
		switch (t.getType())
		{
			case HalsteadLexer.OPERATOR :
				memoryOperators.add(t.getText());
				break;
            case HalsteadLexer.OPERAND:
				memoryOperands.add(t.getText());break;
            case HalsteadLexer.IGNORE : 
				memoryIgnore.add(t.getText());break;
		}
		t = lex.nextToken();
	}
	
	hal = new Halstead(memoryOperators, memoryOperands);
	
	System.out.println("Operatoren:\n"+memoryOperators.toString());
	System.out.println("Operanden:\n"+memoryOperands.toString());
	System.out.println("Ignore:\n"+memoryIgnore.toString());
	System.out.println(hal.toString());
	}
}
