package cracking.hackerrank;

public class Sort_BubbleSort {

	public static void main(String[] args) {
		int [] arr = { 1, 2, 3,-1,-16,0};
		System.out.println(getNumberOfSwaps(arr));
		System.out.println("first Number : " + arr[0]);
		System.out.println("last Number : " + arr[arr.length -1]);
	}
	public static int getNumberOfSwaps(int [] arr){
		int swaps = 0;
		for(int i = 0; i < arr.length; ++ i){
			for(int j = 0; j < arr.length - i - 1; ++ j){
				if(arr[j] >= arr[j + 1]){
					++swaps;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return swaps;
	}
}
