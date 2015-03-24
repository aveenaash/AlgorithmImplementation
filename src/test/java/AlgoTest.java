import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithm.BubbleSort;
import com.algorithm.MergeSort;
import com.algorithm.SelectionSort;


public class AlgoTest {

	@Test
	public void testBubbleSort() {
		BubbleSort bs=new BubbleSort(new int[]{23,6,12,5,14,18,9});
		int[] expected= new int[] {5,6,9,12,14,18,23};
		long startTime = System.currentTimeMillis();
		bs.bubbleSort();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		assertArrayEquals(expected, bs.getArr());
		
	}
	
	@Test
	public void testImprovedBubbleSort() {
		BubbleSort bs=new BubbleSort(new int[]{23,6,12,5,14,18,9});
		int[] expected= new int[] {5,6,9,12,14,18,23};
		long startTime = System.currentTimeMillis();
		bs.improvedBubbleSort();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		assertArrayEquals(expected, bs.getArr());
		
	}
	
	@Test
	public void testSelectionSort() {
		SelectionSort bs=new SelectionSort(new int[]{23,6,12,5,14,18,9});
		int[] expected= new int[] {5,6,9,12,14,18,23};
		long startTime = System.currentTimeMillis();
		bs.selectionSort();;
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		assertArrayEquals(expected, bs.getArr());
		
	}
	
	@Test
	public void testMergeSort() {
		MergeSort ms = new MergeSort(new int[] { 38,12, 27, 43,4,1, 3, 9, 82, 10 });		
		int[] expected= new int[] {1, 3, 4, 9, 10, 12, 27, 38, 43, 82};
		long startTime = System.currentTimeMillis();
		ms.splitArray(0, ms.getArr().length - 1);		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		System.out.println("Sorted ::: " + ms.printArr());
		assertArrayEquals(expected, ms.getArr());
		
	}
	

}
