package ast;

import lexer_parser.Token;
import visitor.Visitor;

public class AddNode extends BinaryNode {

	public AddNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}
	public <T> T accept(Visitor<T> Visitor) {
		return Visitor.visit(this);
	}
}