package ast;

import lexer_parser.Token;
import visitor.EvaluationVisitor;

public abstract class ExprNode extends HeteroAST {

	/**
	 * 
	 * @param token
	 */
	public ExprNode(Token token) {
		super(token);
	}

	public int accept(EvaluationVisitor evaluationVisitor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
