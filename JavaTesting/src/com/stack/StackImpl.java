package com.stack;

class StackOp{
	int size, top;
	int a[];
	static final int max=5;
	StackOp(){
		size=0;
		top=-1;
		a=new int[max];
	}
	public void push(int val) {
		if(top==max-1)
			System.out.println("stack is overflow......");
		else{
			a[++top]=val;
			size++;
		}
	}
	public void pop() {
	    if(top==-1)
	    	System.out.println("stack is empty..........");
	    else{
	    	top=top-1;
	    	size--;
	    }
	}
	public void display() {
		System.out.println("size :     "+size);
		System.out.println("print from bottom to top.......");
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}
		System.out.println("top to bottom...........");
		for(int i=size-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
public class StackImpl {
	public static void main(String[] args) {
		StackOp obj=new StackOp();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.display();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.push(60);
		obj.display();
	    obj.pop();
	    obj.display();
		
		
		
		
		
		
		
		
		
	}

}
