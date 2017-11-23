package Decorator;

public abstract class Tree {
	protected String treeName = "not defined";
	
	public String getTreeName(){
		return treeName;
	}
	
	public abstract double cost();
	
}
