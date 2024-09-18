
public class BubbleSort {

	public static void main(String[] args) {
		//first declare an array of integer values
		int arr[] = {12,3,55,23,5,100,10};
		
		
		//Bubble Sort Logic 
		
		//this will happen 7 times meaning it will iterate until all values are sorted in an ascending order
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length-i ;j++) {
				
				// arr[j-1] = arr[0] since the variable j was assigned as 1 
				// we compare the first int value with the second int value 
				if(arr[j-1] > arr[j]) {
					//Swapping the int values 
					
					int temp = arr[j];//temporary storing the value or element indexed at arr[j]
					//swapping arr[j] value with arr[j-1]
					arr[j] = arr[j-1]; //make arr[j] to be arr[j-1] which swapes the two values
					arr[j-1]= temp; //then making arr[j-1] value or element to be the temporary stored 
					//value which was the valu of  b arr[j]
				}
			}
		}
		
		//printing the sorted array
		System.out.print("Sorted array: "  );
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
