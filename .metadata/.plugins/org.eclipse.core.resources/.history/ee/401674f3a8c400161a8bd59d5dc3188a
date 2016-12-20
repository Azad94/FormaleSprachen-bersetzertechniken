package graph;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

import org.antlr.v4.misc.Graph;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cymbol_grammar.CymbolBaseListener;
import cymbol_grammar.CymbolLexer;
import cymbol_grammar.CymbolParser;

class CallGraph {

	Set<String> nodes = new OrderedHashSet<String>();
	MultiMap<String, String> edges = new MultiMap<String, String>();
	
	public void edge(String source, String target) {
        edges.map(source, target);
    }
	
	String toDOT(){
		
		StringBuilder buf = new StringBuilder();
		buf.append("digraph G {\n");
		buf.append(" ranksep=.25;\n");
		buf.append(" edge [arrowsize=.5]\n");
		buf.append(" node [shape=circle, fontname=\"ArialNarrow\",\n"); 
		buf.append(" fontsize=12, fixedsize=true, height=.45];\n"); 
		buf.append(" ");
		
		// print all nodes first
		for (String node : nodes) 
		{ 
	        buf.append(node);
	        buf.append("; "); 
	    }
		
		buf.append("\n");
		
		for (String src : edges.keySet()) {
			for (String trg : edges.get(src)) { 
				buf.append(" "); buf.append(src);
				buf.append(" -> "); buf.append(trg); 
				buf.append(";\n");
			} 
		}

		buf.append("}\n");
		return buf.toString();	
	}
}