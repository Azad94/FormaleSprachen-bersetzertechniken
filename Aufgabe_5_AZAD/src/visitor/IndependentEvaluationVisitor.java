package visitor;

import ast.*;
import lexer_parser.*;

public class IndependentEvaluationVisitor {
	
	public IndependentEvaluationVisitor(){
		
	}
	
	public double eval(HeteroAST n) {
		double result = 0.0;
        switch ( n.getToken().getType()) {
            case RecDesLexer.PLUS : result = eval((AddNode)n); break;
            case RecDesLexer.MINUS : result = eval((MinusNode)n); break;
            case RecDesLexer.MULTI : result = eval((MultiNode)n); break;
            case RecDesLexer.DIV : result = eval((DivNode)n); break;
            case RecDesLexer.INTEGER : result = eval((IntNode)n); break;
            case RecDesLexer.UMINUS: result = eval((UMinusNode)n); break;
            default :
                // catch unhandled node types
                throw new UnsupportedOperationException("Node "+
                          n.getClass().getName()+ " not handled");
        }
		return result;
    }
	
    public double eval(AddNode n) {
    	return eval(n.getLeft()) + eval(n.getRight());
    }
  

    public double eval(MinusNode n) {
    	return eval(n.getLeft()) - eval(n.getRight());
    }
	
    public double eval(MultiNode n) {
    	return eval(n.getLeft()) * eval(n.getRight());
    }
	
    public double eval(DivNode n) {
    	return eval(n.getLeft()) / eval(n.getRight());
    }
	
    public double eval(IntNode n) {
        return Double.parseDouble(n.toString());
    }
}
