package com.algorithm;

public class SelectionSort {
private int[] arr;
	
	public SelectionSort(int[] arr)
	{
		this.arr=arr;
	}
	
	public void selectionSort()
	{
		for(int i=0;i<arr.length;i++)
		{
			int minPos=i;
			int min=arr[i];
			//finding minimum from the array
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min) 
				{
					minPos=j;
					min=arr[j];
				}
			}
			//swapping minimum value with the first element of unsorted list
			swap(i,minPos);
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
