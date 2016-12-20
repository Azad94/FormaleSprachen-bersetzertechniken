package graph;

import org.antlr.v4.misc.Graph;

import cymbol_grammar.CymbolBaseListener;
import cymbol_grammar.CymbolParser;

public class FunctionListener extends CymbolBaseListener {
	
	Graph graph = new Graph();
	CallGraph c = new CallGraph();
	
	String currentFunctionName = null;

	public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
        //graph.nodes.add(currentFunctionName);
        c.nodes.add(currentFunctionName);
    }
	
	public void exitCall(CymbolParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        // 		map current function to the callee
        //graph.edge(currentFunctionName, funcName);
        c.edge(currentFunctionName, funcName);
    }
}
