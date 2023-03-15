// from leet code https://leetcode.com/problems/median-of-two-sorted-arrays/
public class sort_array_median{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m == 0){
            if(n % 2 == 0){
                if(n>1){
                    int middle = n/2; 
                    // System.out.println(nums)
                    return (double)(nums2[middle]+nums2[middle-1])/2;
                }
                else {
                    return nums2[0];
                }
            }
            else{
                if(n>1){
                    int middle = n/2; 
                    return (double)(nums2[middle]);
                }
                else if(n==1){
                    return nums2[0];
                }

            }
        }

        if(n == 0){
            n = m;
            nums2 = nums1;
            if(n % 2 == 0){
                if(n>1){
                    int middle = n/2; 
                    return (double)(nums2[middle]+nums2[middle-1])/2;
                }
                else {
                    return nums2[0];
                }
            }
            else{
                if(n>1){
                    int middle = n/2; 
                    return (double)(nums2[middle]);
                }
                else if(n==1){
                    return nums2[0];
                }

            }
        }
        int arr1 = 0;
        int arr2 = 0;
        System.out.println(m);
        int middle = (m+n)/2;
            int arr[] = new int[middle+1];
            for(int i =0 ;i<arr.length;i++){
                if(arr1<m && arr2<n){
                    if(nums1[arr1]<nums2[arr2] ){
                        arr[i] = nums1[arr1];
                        arr1++;
                    } 
                    else{
                        arr[i] = nums2[arr2];
                        arr2++;
                    } 
                }
                else{
                    if(arr1<m && arr2==n){
                        arr[i] = nums1[arr1];
                        arr1++;
                    }
                    else if(arr1==m && arr2<n){
                        arr[i] = nums2[arr2];
                        arr2++;
                    }
                }
            }
        if((m+n)%2 != 0){
            return arr[middle];
        }
        else{
            return (double)(arr[middle]+arr[middle-1])/2;
        }
        
    }

    public static void main(String[] args){
        int nums1[] = {1,3};
        int nums2[] = {2};
        int a[] = {1,2};
        int b[] = {2,4};
        double m = findMedianSortedArrays(nums1,nums2);
        double m1 = findMedianSortedArrays(a,b);
        System.out.println(m);
        System.out.println(m1);
    }
}
