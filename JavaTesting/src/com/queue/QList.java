package com.queue;

class QueList{
	int front, rear;
	int max=5;
	int a[]=new int[max];
	QueList(){
		front=-1;
		rear=-1;
	}
	public void enQue(int val){
		if(isFull())
			System.out.println("Queue  Is full..........");
		else if(isEmpty()){
			front=0 ;
		    rear=0;
		 }else
			rear=rear+1;
		
		a[rear]=val;
		
	}
	private boolean isFull() {
	if(rear==max-1)
		return true;
	else
		return false;
	}
	
	private boolean isEmpty() {
		if(front== -1 && rear==-1)
			return true;
		else
			return false;
		}
	public void deQueue() {
		if(isEmpty())
			System.out.println("Queue is Empty......................");
		else if(front==rear){
			front=rear=-1;
		}else{
		   front=front+1;
		   
		}
	}
	public void display() {
		int temp=front;
		for(int i=temp;i<=rear;i++){
			System.out.println(a[i]);
		}
		
	}
}
public class QList {
	public static void main(String[] args) {
		QueList obj=new QueList();
		obj.enQue(10);
		obj.enQue(20);
		obj.enQue(30);
		obj.enQue(40);
		obj.deQueue();
		obj.enQue(50);
		obj.deQueue();
		obj.enQue(60);
		obj.deQueue();
		obj.display();
	}

}
