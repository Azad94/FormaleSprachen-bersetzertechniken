package ast;

import lexer_parser.Token;

public class MultiNode extends BinaryNode {

	public MultiNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
