package com.algorithm;

public class BubbleSort {
	private int[] arr;
	
	public BubbleSort(int[] arr)
	{
		this.arr=arr;
	}
	
	public void bubbleSort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) swap(j,j+1);
			}
		}
	}
	
	public void improvedBubbleSort()
	{
		boolean swap=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					swap(j,j+1);
					swap=true;
				}
			}
			
			if(swap==false) break;
		}
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
