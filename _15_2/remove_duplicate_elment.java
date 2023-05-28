import java.util.Scanner;
class remove_duplicate_elment{
        static int[] remove(int[] arr, int index){
            int[] res = new int[arr.length - 1];
            for(int i = 0;i<arr.length;i++){
                if(i<index){
                    res[i] = arr[i];
                }
                else if(i>index){
                    res[i-1] = arr[i];
                }
            }
            return res;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of array :");
            int len = input.nextInt();
            input.nextLine();
            int arr[] = new int[len];
            for(int i = 0;i<arr.length;i++){
                System.out.print("Enter the element of "+i+" :");
                arr[i] = input.nextInt();
                input.nextLine();
            }
            System.out.print("Enter the element to remove :");
            int target  = input.nextInt();
            input.nextLine();
            for(int i = 0;i<arr.length;i++){
                if(arr[i] == target){
                    arr = remove(arr,i);
                    i--;
                }
            }
            for(int val : arr){
                System.out.println(val);
            }
            input.close();
        }
}