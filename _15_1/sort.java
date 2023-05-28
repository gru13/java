public class sort{
	public static void main(String args[]){
		int arr[] = {4,1,23,34,1,3,4};
		arr = sort(arr);
		for(int val : arr){System.out.print(val+"\t");}
	}
	static int[] sort(int arr[]){
		int temp;
		for(int i = 0;i<arr.length;i++){
			for(int j =0 ;j<arr.length-i-1;j++){
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;		
	}
}
