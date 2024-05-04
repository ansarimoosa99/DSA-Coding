
import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] inArr = { 5, 3, 6, 2, 1};
    insertionSort(5, inArr);
    System.out.println(Arrays.toString(inArr));
  }


	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i = 0; i < arr.length -1; i++){
			for( int j = i+1; j > 0; j--){
				if(arr[j] < arr[j-1]){
					swap(arr,j,j-1);
				}
				else{
					break;
				}
			}
		}
		
	}
    public static void swap(int arr[],int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; 
	}
}



