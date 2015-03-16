
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tree.BinarySearchTree;


public class BSTTest {

	@Test
	public void testBSTinsert() {
		BinarySearchTree bst=new BinarySearchTree();
		createBST(bst);
		bst.printTree(bst.getRootNode());
					
	}
	
	@Test
	public void testBSTlookup() {
		BinarySearchTree bst=new BinarySearchTree();
		createBST(bst);
		boolean actual=bst.lookup(bst.getRootNode(), 5);
		boolean expected= true;
		assertEquals(expected,actual);
					
	}
	
	public void createBST(BinarySearchTree bst)
	{
		int[] arr=new int[] {1,8,2,3,9,5,4};	
		for(int i=0;i<arr.length;i++)
		{
			bst.insertElement(arr[i]);
		}
	}
	
}
