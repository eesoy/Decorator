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
		System.out.println(tree.getTreeName() + ", �� �����ݾ�: " + tree.cost() + " ��");
		
		Tree tree2 = new Oak();
		tree2 = new Cherrybulb(tree2);
		tree2 = new SantaOrnament(tree2);
		tree2 = new StarOrnament(tree2);
		System.out.println(tree2.getTreeName() + ", �� �����ݾ�: " + tree2.cost() + " ��");
		
		Tree tree3 = new Pine();
		tree3 = new SantaOrnament(tree3);
		tree3 = new StarOrnament(tree3);
		System.out.println(tree3.getTreeName() + ", �� �����ݾ�: " + tree3.cost() + " ��");
		
				
	}

}
