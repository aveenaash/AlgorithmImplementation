package com.algorithm;

public class MergeSort {
	private int[] arr;
	private int[] helper;

	public MergeSort(int[] arr) {
		this.arr = arr;
		helper = new int[arr.length];
	}

	public void mergeSort(int[] a) {
		splitArray(0, a.length - 1);
	}

	public void splitArray(int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			// split the left side of the array
			splitArray(left, middle);
			// split the right side of the array
			splitArray(middle + 1, right);
			/*System.out.println("left :: " + left + " middle :: " + middle
			+ " right :: " + right);*/
			// Now sort the parts and merge both sides			
			mergeParts(left, middle, right);
		}
	}

	public void mergeParts(int lower, int middle, int higher) {

		// Copy both parts into the helper array
		for (int i = lower; i <= higher; i++) {
			helper[i] = arr[i];
		}

		int i = lower;
		int j = middle + 1;
		int k = lower;

		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= higher) {
			if (helper[i] <= helper[j]) {
				arr[k] = helper[i];
				i++;
			} else {
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			arr[k] = helper[i];
			i++;
			k++;
		}
		// No need to copy the rest of the right side of the array into the 
		//target array. It is because the arr array already contains the right
		//side of array in right position
		
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort(new int[] { 38,12, 27, 43,4,1, 3, 9, 82, 10 });
		ms.splitArray(0, ms.arr.length - 1);
		System.out.println("Sorted ::: " + ms.printArr());
	}

	public String printArr() {
		String str = "";
		for (int i = 0; i < arr.length; i++)
			str = str + arr[i] + " ";
		return str;

	}

}
