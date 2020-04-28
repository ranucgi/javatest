package com.sorting;
//selection put min value at first.....
public class Selection {
	public static void main(String[] args) {
		int a[]={2,7,4,1,5,3};
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length-1;j++){
				if(a[i]>a[j+1]){
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;		
				}
			}
		}
		for(int x:a){
			System.out.println(x);
		}
	}

}
