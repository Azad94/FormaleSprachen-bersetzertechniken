package Halstead;

import MultiSet.Multiset;

public class Halstead {
	
	private int nN1 = 0;
	private int nN2= 0;
	private int n1 = 0;
	private int n2 = 0;
	
	public Halstead(Multiset<String> memoryOperators,Multiset<String> memoryOperands)
	{
		this.nN1 = memoryOperators.size();
		this.nN2 = memoryOperands.size();
		this.n1 = memoryOperators.distinct();
		this.n2 = memoryOperands.distinct();
	}
	
	public int getAnzAllOperators()
	{
		return this.nN1;
	}
	
	public int getAnzAllOperands()
	{
		return this.nN2;
	}
	
	public int getProgrammlaenge()
	{
		return this.nN1+this.nN2;
	}
	
	public int getAnzDistinctOperators()
	{
		return this.n1;
	}
	
	public int getAnzDistinctOperands()
	{
		return this.n2;
	}
	
	public int getVokabulargroeße()
	{
		return this.n1+this.n2;
	}
	
	public double getVolume()
	{
		return (this.nN1+this.nN2)*Math.log(this.n1+this.n2)/Math.log(2);
	}
	
	public double getDifficulty()
	{
		return ((double)this.n1/2)*((double)this.nN2/(double)this.n2);
	}
	
	public double getEffort()
	{
		return getVolume()*getDifficulty();
	}
	
	public String toString()
	{
		return 	"\n\n*****Statisken*****\n"+
				this.getProgrammlaenge() + " : Programmlänge\n"+
				this.nN1 + " : Anzahl aller Operatoren\n"+
				this.nN2 + " : Anzahl aller Operanden\n\n"+
				this.getVokabulargroeße() + " : Vokabulargröße\n"+
				this.n1 + " : Anzahl verschiedener Operatoren\n"+
				this.n2 + " : Anzahl verschiedener Operanden\n\n"+
				this.getVolume()+" : Volumen des Programms\n"+
				this.getDifficulty()+" : Schwierigkeitsgrad ein Programm zu verstehen\n"+
				this.getEffort()+" : Implementierungsaufwand";
	}
}
