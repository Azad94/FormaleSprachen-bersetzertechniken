package expr;

import org.antlr.v4.runtime.*;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = null;
		// Pick an input stream (filename from commandline or stdin)
		if (args.length > 0)
			input = new ANTLRFileStream(args[0]);
		else
			input = new ANTLRInputStream(System.in);
		Postfix post = new Postfix(input);
		System.out.println(post.evalPostfix());

	}
}//3 # 3 8 4 / 2 ^ * 9 - +