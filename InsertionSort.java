import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		populate(arr);
		System.out.println("Unsorted Integer Array");
		print(arr);
		System.out.println("\n"); //Creates two empty lines in between sorted and unsorted arrays
		System.out.println("Sorted Integer Array");
		insertionSort(arr);
		print(arr);

	}
	
	//Insertion Sort method
	public static int[] insertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
		return a;
	}
	
	//Method to fill the array with random numbers;
	public static int[] populate(int [] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		return a;
	}
	
	//Method to print the integers inside the array.
	public static void print(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
