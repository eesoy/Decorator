package DecoOption;

import Decorator.DecoOption;
import Decorator.Tree;

public class Cherrybulb extends DecoOption {
	Tree tree;
	
	public Cherrybulb(Tree tree) {
		// TODO Auto-generated constructor stub
		this.tree = tree;
	}
	@Override
	public String getTreeName() {
		// TODO Auto-generated method stub
		return tree.getTreeName() + ", Cherrybulb";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1800 + tree.cost();
	}
	

}
