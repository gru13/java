import java.util.Scanner;
import java.util.Arrays;
public class uniqueArray{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//input
        input.nextLine();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();//inputing
        }
        int res[] = uniqueArray.unique(arr);
        for(int i = 0; i<res.length;i++){
            System.out.print(res[i]+"\t");
        }
        input.close();
    }
    public static int[] unique(int arr[]){
        int las = 0;
        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            if(count(arr[i], arr) == 1 && count(arr[i], arr1) == 0){
                arr1[las]=arr[i];
                las++;
            }
        }
        return Arrays.copyOfRange(arr1,0,las); 
    }
    public static int count(int val,int arr[]){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
            }
        }
        return count;

    }
}