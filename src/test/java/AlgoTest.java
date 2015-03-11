import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithm.BubbleSort;
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

}
