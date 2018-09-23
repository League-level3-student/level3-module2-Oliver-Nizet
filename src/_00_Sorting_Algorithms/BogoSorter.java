package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean sorted = false;
		Random r = new Random();
		while(sorted = false){
			int score = 0;
			for (int i = 0; i < array.length-1; i++) {
				if(array[i]<array[i+1]){
					score++;
				}
			}	
			if(score==array.length-1){
				sorted = true;
			}
			int a = r.nextInt(array.length);
			int b = r.nextInt(array.length);
			int hold = array[a];
			array[a] = array[b];
			array[b] = hold;
			display.updateDisplay();
		}
	}
}
