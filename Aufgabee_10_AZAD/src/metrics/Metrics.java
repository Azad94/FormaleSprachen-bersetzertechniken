package metrics;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;

import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cymbol_grammar.CymbolLexer;
import cymbol_grammar.CymbolParser;
import cymbol_grammar.MetricListener;

public class Metrics {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
        InputStream is = new FileInputStream("src/metrics/t1.cym");
        //Path i = Paths.get("/a.cym");
        ANTLRInputStream input = new ANTLRInputStream(is);    
        
		CymbolLexer lexer = new CymbolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CymbolParser parser = new CymbolParser(tokens);
		ParseTree tree = parser.file();
		
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		MetricListener extractor = new MetricListener();
		walker.walk(extractor, tree); 
       
	}
}