public class largestInArray{
	public static void main(String args[]){
		int arr[] ={1,2,3,4,5,65,5,3,2,4};
		int max = largest(arr);
		System.out.print(max);
	}
	static int largest(int arr[]){
		int max = arr[0];
		for(int val:arr){
			if (val>max){
			       max = val;
			}
	 	}
		return max;
	}
}
	
