package ast;

import lexer_parser.Token;

public class AtomicNode extends ExprNode {

	public AtomicNode(Token token) {
		super(token);
	}

	@Override
	public String toStringTree() {
		return this.toString();
	}
	


}