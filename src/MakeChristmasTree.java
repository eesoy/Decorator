import DecoOption.Cherrybulb;
import DecoOption.SantaOrnament;
import DecoOption.StarOrnament;
import Decorator.Tree;
import Tree.Juniper;
import Tree.Oak;
import Tree.Pine;

public class MakeChristmasTree {
	
	public static void main(String[] args) {
		Tree tree = new Juniper();
		System.out.println(tree.getTreeName() + ", 총 결제금액: " + tree.cost() + " 원");
		
		Tree tree2 = new Oak();
		tree2 = new Cherrybulb(tree2);
		tree2 = new SantaOrnament(tree2);
		tree2 = new StarOrnament(tree2);
		System.out.println(tree2.getTreeName() + ", 총 결제금액: " + tree2.cost() + " 원");
		
		Tree tree3 = new Pine();
		tree3 = new SantaOrnament(tree3);
		tree3 = new StarOrnament(tree3);
		System.out.println(tree3.getTreeName() + ", 총 결제금액: " + tree3.cost() + " 원");
		
				
	}

}
