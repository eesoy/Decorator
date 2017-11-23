package DecoOption;

import Decorator.DecoOption;
import Decorator.Tree;

public class StarOrnament extends DecoOption {
	Tree tree;
	
	public StarOrnament(Tree tree) {
		// TODO Auto-generated constructor stub
		this.tree = tree;
	}
	@Override
	public String getTreeName() {
		// TODO Auto-generated method stub
		return tree.getTreeName() + ", Star";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1500 + tree.cost();
	}
	

}
