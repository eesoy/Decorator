package DecoOption;

import Decorator.DecoOption;
import Decorator.Tree;

public class SantaOrnament extends DecoOption {
	Tree tree;
	
	public SantaOrnament(Tree tree) {
		// TODO Auto-generated constructor stub
		this.tree = tree;
	}
	@Override
	public String getTreeName() {
		// TODO Auto-generated method stub
		return tree.getTreeName() + ", Santa";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3000 + tree.cost();
	}
	

}
