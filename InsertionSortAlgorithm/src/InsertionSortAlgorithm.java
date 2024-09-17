
public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		//declaring an array of Integer Values
//		int array[] = {34,23,645,123,4634,12,43,1345,3};
		
		//testing the time complexity of the Insertion Sort Algorithm
		int  array[] = new int[1000000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * array.length);
		}
		
		//calling the Insertion Sort Algorithm with an array Arguement
		insertionSort(array);

		//printing the sorted array
		for (int i = 0; i< array.length; i++) {
			
			System.out.print(array[i] +", ");
		}
		
	}

	//creating an Insertion Sort Algorithm method with an Integer Array as an arguement
	private static void insertionSort(int[] array) {
		
		//starting from the second element, because one element in an array is sorted by default
		for(int i = 1; i < array.length; i++) {
			
			//storing the inserted element in a temporary value
			int currentValue = array[i];
			
			//setting j to be one element before the current value (i) using an index to point to it
			int j = i - 1;
			
			//a while loop that checks if the previous element ( array[j]) is greater than the current value inserted and 
			// checks if the previous element is still in a positive index 
			while (j >= 0 && array[j] > currentValue) {
				
				//creating a space for the previous element and placing it there
				array[ j+1 ] = array[j];
				
				//assing the previous element space to the current value, basically placing the current value to the 
				// space which was occupied by the previous element 
				array[j] = currentValue;
				
				//just in case there are more previous values that are greater that the current value move to them and
				// and repeate the loop 
				j--;
			}
		}
	}

}
