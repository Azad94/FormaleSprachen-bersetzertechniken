package cymbol_grammar;

import java.util.LinkedList;
import java.util.List;

public class MetricListener extends CymbolBaseListener {

	/**
	 * Gibt den Wert für die McCabe-Komplexität an 
	 */
	private int mcCabeValue = 0;
	
	/**
	 * Gibt den Wert für die Interior-Pfadüberdeckung an
	 * @param ctx
	 */
	private int interiorValue = 1;
	
	private List<Integer> stack = new LinkedList<>();
	private boolean addiere = false;
	
	/*
	 * für jede Funktion
	 */
	@Override 
	public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		
		System.out.println("Metriken für "+ ctx.getChild(1).getText());
		this.mcCabeValue = 1;
		this.interiorValue = 1;
	}
	
	@Override
	public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		System.out.println("McCabe-Komplexität: "+this.mcCabeValue);
		System.out.println("Interior-Pfad-Überdeckung: "+ this.interiorValue+"\n" );
	}
	
	/*
	 * zähle die Anzahl der if-Vorkommen für McCabe 
	 * und 
	 * 
	 */
	@Override 
	public void enterStatIf(CymbolParser.StatIfContext ctx) { 
		this.mcCabeValue++;		
		stack.add(ctx.depth());		
	}
	
	@Override 
	public void exitStatIf(CymbolParser.StatIfContext ctx) {
		 stack.remove( stack.size()-1);
		
		if( !stack.isEmpty() ){
			this.addiere = true;
			this.interiorValue *= 2;
		}			
		else{
			if(this.addiere){
				this.interiorValue++;
				this.addiere = false;
			}
			else{
				this.interiorValue *= 2;
			}
		}
		
		
	}
	
	@Override 
	public void enterStatFor(CymbolParser.StatForContext ctx) { 
		stack.add(ctx.depth());
	}
	
	@Override
	public void exitStatFor(CymbolParser.StatForContext ctx) { 
		stack.remove( stack.size()-1);
		
		if( !stack.isEmpty() ){
			this.addiere = true;
			this.interiorValue *= 2;
		}			
		else{
			if(this.addiere){
				this.interiorValue *= 2;
				this.addiere = false;
			}
		}
	}
}