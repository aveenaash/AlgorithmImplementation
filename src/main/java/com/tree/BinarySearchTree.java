package com.tree;

/* A binary Search Tree is a generalization of linked list. It has root Node and each node has a 
 * reference to left and right child node
 * 
 * BST Rule:: At each node N every value in the left subtree of N is less than value at N and every 
 * value in the right subtree of N is greater than the value at N
 * 
 * This BinarySearchTree doesn't handle duplicate values:::: To handle duplicate values, store in each Node a List 
 * (instead of a value); then when a value is added to a Node, it is instead added to the List.
 */
 
public class BinarySearchTree {
	
	private Node rootNode;
	
	public BinarySearchTree()
	{
		rootNode=null;
	}
	
	public Node getRootNode() {
		return rootNode;
	}
	
	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public void insertElement(int value)
	{
		if(rootNode!=null)	insertElement(rootNode,value);
		else            	rootNode=new Node(value,null,null);
	}

	public void insertElement(Node rootNode, int value) {
		if(rootNode.getValue()==value)
		{
			System.out.println("Warning @@@@@ Node Value already exists!!!!!!");
		}
		else if(rootNode.getValue()<value)
		{
			if(rootNode.getRightChild()==null) rootNode.setRightChild(new Node(value,null,null));
			else insertElement(rootNode.getRightChild(),value);
		}
		else if(rootNode.getValue()>value)
		{
			if(rootNode.getLeftChild()==null) rootNode.setLeftChild(new Node(value,null,null));
			else insertElement(rootNode.getLeftChild(),value);
		}
	}
	
	public boolean lookup(Node bst, int value)
	{
		if(bst==null) return false;
		if(bst.getValue()==value) return true;
		if (bst.getValue()>value) return lookup(bst.getLeftChild(),value);
		else  return lookup(bst.getRightChild(),value);
		
	}
	
	public void remove(int value)
	{
		// This is todo
		//  Jhau laairako awastha pachi fursad ma ra jaagar aako bela implement garaulaa
	}
	
	public void printTree( ) {
		if( rootNode == null )	System.out.println( "Empty tree" );
		else printTree( rootNode );
	}
	
	public void printTree( Node t ){
		if( t != null )
		{
			printTree( t.getLeftChild() );
			System.out.print( t.getValue() +" " );
			printTree( t.getRightChild() );
		}
	}
	
}
