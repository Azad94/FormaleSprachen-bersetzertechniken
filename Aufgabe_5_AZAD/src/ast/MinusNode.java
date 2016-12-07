package ast;

import lexer_parser.Token;
import visitor.Visitor;

public class MinusNode extends BinaryNode {

	/**
	 * @param left
	 * @param addToken
	 * @param right
	 */
	public MinusNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

	public <T> T accept(Visitor<T> Visitor) {
		return Visitor.visit(this);
	}
}
