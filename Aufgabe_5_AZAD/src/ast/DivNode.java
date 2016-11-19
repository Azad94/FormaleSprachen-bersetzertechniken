package ast;

import lexer_parser.Token;

public class DivNode extends BinaryNode {

	public DivNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);	}

}
