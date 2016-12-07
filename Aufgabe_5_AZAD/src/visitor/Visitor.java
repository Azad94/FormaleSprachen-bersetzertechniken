package visitor;

import ast.*;

public interface Visitor<T> {
	T visit(AddNode n);
	T visit(MinusNode n);
	T visit(UMinusNode n);
	T visit(MultiNode n);
	T visit(DivNode n);
	T visit(IntNode n);
}
