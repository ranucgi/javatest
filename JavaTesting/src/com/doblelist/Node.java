package com.doblelist;

public class Node {
	int data;
	Node next;
	Node prev;
	
	public Node(){
		
	}
	public Node(Node prev,int data,Node next) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
}
