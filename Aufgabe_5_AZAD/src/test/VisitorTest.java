package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ast.HeteroAST;
import lexer_parser.*;
import visitor.*;

public class VisitorTest {

	
	//indepVisitor.print(parser4.statlist());
	
	RecDesLexer lexer5 = new RecDesLexer("3+2*7-2\n");
	RecDesParser parser5 = new RecDesParser(lexer5);
	IndependentEvaluationVisitor indepVisitor2 = new IndependentEvaluationVisitor();
	
}