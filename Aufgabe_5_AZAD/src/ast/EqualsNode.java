package ast;

import lexer_parser.Token;

public class EqualsNode extends BinaryNode {

	/**
	 * @param left
	 * @param addToken
	 * @param right
	 */
	public EqualsNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
