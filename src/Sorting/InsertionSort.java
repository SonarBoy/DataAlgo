package Sorting;

public class InsertionSort {

	private static long start;
	private static long finish;
	private static long timeElapsed;
	
	public static void sort(Comparable[] array) {
		
		start = System.nanoTime();
		
		int leng = array.length;
		
		for(int arrayRunner = 0; arrayRunner < leng; arrayRunner++) {
			
			for(int sortRunner = arrayRunner; sortRunner > 0; sortRunner--) {
				
				if(less(array[sortRunner],array[sortRunner - 1])) {
					exch(array,sortRunner,sortRunner-1);
				}else {
					break;
				}
				
			}
		}
		
		
		finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("Insertion Sorted Time: " + timeElapsed);
	}
	
	private static boolean less(Comparable firstItem, Comparable w){
		
		return firstItem.compareTo(w) < 0;
		
	}
	
	private static void exch(Comparable[] array, int i, int j) {
		
		Comparable swap = array[i];
		array[i] = array[j];
		array[j] = swap;
		
	}
	
}
