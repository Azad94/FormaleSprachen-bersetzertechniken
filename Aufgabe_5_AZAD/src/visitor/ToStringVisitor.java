package visitor;

import ast.*;

public class ToStringVisitor implements Visitor<String> {
	
	private String ret;

	public ToStringVisitor() {
		this.ret = "";
	}

	public String getRet() {
		return this.ret;
	}
	
	@Override
	public String visit(AddNode n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(MinusNode n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(UMinusNode n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(MultiNode n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(DivNode n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(IntNode n) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
