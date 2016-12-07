package ast;

import lexer_parser.Token;
import visitor.Visitor;

public class IntNode extends AtomicNode {

	public IntNode(Token token) {
		super(token);
	}
	
	public <T> T accept(Visitor<T> Visitor) {
		return Visitor.visit(this);
	}

}
