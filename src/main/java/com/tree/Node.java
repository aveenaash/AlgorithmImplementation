package com.tree;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private int value;
	
	public Node(int value,Node left,Node right)
	{
		this.value=value;
		this.leftChild=left;
		this.rightChild=right;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
