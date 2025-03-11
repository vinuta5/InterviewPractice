package cracking.hackerrank;

public class Arrays_RotateArray {
	public static int [] rotateLeft(int [] arr, int k){
		int [] temp = new int[k];
		int n = arr.length;
		for(int i = 0; i < k; ++ i){
			temp[i] = arr[i];
		}
		for(int i = k ; i < n; ++ i){
			arr[i - k] = arr[i];
		}
		for(int i = 0; i < temp.length; ++ i){
			arr[n - k + i] = temp[i];
		}
		return arr;
	}
	public static int [] rotateRight(int [] arr, int k){
		int [] temp = new int[k];
		int n = arr.length;
		for(int i = 0; i < k ; ++ i){
			temp[i] = arr[n - k + i];
		}
		for(int i = n - 1; i >= k; -- i){
			arr[i] = arr[i - k];
		}
		for(int i = 0; i < temp.length; ++ i){
			arr[i] = temp[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr1 = {};
		int [] arr2 = {};
		int k = 4;
		int [] left = rotateLeft(arr1, k);
		int [] right = rotateLeft(arr2, k);
	}

}
