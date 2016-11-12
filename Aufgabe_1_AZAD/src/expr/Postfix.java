package expr;

import java.util.Stack;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;


/**
 * Programm zum Auswerten von Postifx Ausdruck auswerten
 * 
 * @author Sheraz Azad
 *
 */
public class Postfix { //extends ExprLexer {
	private ExpressionLexer lexer;
	private Stack<Double> stack = new Stack<Double>();
	private double dummy1;
	private double dummy2;
	private double result;
	private Token token;
	
	public Postfix(CharStream posts) {
		lexer = new ExpressionLexer(posts);
	}
	
	/**
	 * Diese Methode berechnet den Postfixausdruck
	 * 
	 * @return den obersten Wert des Stacks
	 */
	public double evalPostfix() {
		try {
			do{
				token = lexer.nextToken();
				
				switch (token.getType()) {
				
				case ExpressionLexer.INT: {
					dummy1 = Double.parseDouble(token.getText());
					stack.push(dummy1);
					break;
				}
				case ExpressionLexer.PLUS: {
					dummy2 = stack.pop();
					dummy1 = stack.pop();
					result = dummy1 + dummy2;
					stack.push(result);
					result = 0;
					break;
				}
				case ExpressionLexer.MINUS: {
					dummy2 = stack.pop();
					dummy1 = stack.pop();
					result = dummy1 - dummy2;
					stack.push(result);
					result = 0;
					break;
				}
				case ExpressionLexer.UMINUS: {
					dummy1 = stack.pop();
					dummy1 = (dummy1 - (dummy1 * 2));
					stack.push(dummy1);
					break;
				}
				case ExpressionLexer.MUL: {
					dummy2 = stack.pop();
					dummy1 = stack.pop();
					result = dummy1 * dummy2;
					stack.push(result);
					result = 0;
					break;
				}
				case ExpressionLexer.DIV: {
					dummy2 = stack.pop();
					dummy1 = stack.pop();
					result = dummy1 / dummy2;
					stack.push(result);
					result = 0;
					break;
				}
				case ExpressionLexer.POW: {
					dummy2 = stack.pop();
					dummy1 = stack.pop();
					result = dummy1;

					for (int i = 1; i < dummy2; i++) {
						result *= dummy1;
					}

					stack.push(result);
					result = 0;
					break;
				}
				}
			}while(token.getType() != Token.EOF);
			
		} catch (Exception e) {
			System.err.println("Überprüfen Sie ihre Eingabe. \nTrennen Sie die einzelnen Token mit einem Leerzeichen.\n");
		}
		return stack.pop();

	}
}
// 3 # 3 8 4 / 2 ^ * 9 - + \n
