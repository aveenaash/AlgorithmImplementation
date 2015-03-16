package com.algorithm;

public class InsertionSort {
private int[] arr;
	
	public InsertionSort(int[] arr)
	{
		this.arr=arr;
	}
	
	public void insertionSort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
			}
			//swapping minimum value with the first element of unsorted list
			//swap(i,minPos);
			//System.out.println("minPos=== "+minPos+ " Arrya   "+printArr());			
		}
	}
	
	public String printArr()
	{
		String str="";
		for(int i=0;i<arr.length;i++)
			str=str+arr[i]+" ";
		return str;
			
	}
	
	public void swap(int x,int y)
	{
		if(x!=y)
		{
		arr[x]=arr[x]*arr[y];
		arr[y]=arr[x]/arr[y];
		arr[x]=arr[x]/arr[y];
		}
	}
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}
