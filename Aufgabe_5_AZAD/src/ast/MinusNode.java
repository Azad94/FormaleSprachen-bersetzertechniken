package ast;

import lexer_parser.Token;

public class MinusNode extends BinaryNode {

	/**
	 * @param left
	 * @param addToken
	 * @param right
	 */
	public MinusNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
