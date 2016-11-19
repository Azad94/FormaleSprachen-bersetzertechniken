package ast;

import lexer_parser.Token;

public abstract class ExprNode extends HeteroAST {      
    
	/**
	 * 
	 * @param token
	 */
    public ExprNode(Token token) { 
    	super(token);
    }
    
}
