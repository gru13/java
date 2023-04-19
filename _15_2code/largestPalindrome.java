class largestPalindrome {
    public static int rever(int val){
        int sum = 0;
        while(val != 0){
            sum *= 10;
            sum += val%10;
            val /= 10;
        }
        return sum;
    }
    public static int largestPali(int n) {
        if(n == 1){return 9;}
        int d,ans = 0;
        int largest = (int)Math.pow(10,n+1);
        largest--;
        int lowest = (int)Math.pow(10,n-1);
        for(int i = largest;i>=lowest;i++){
            for(int j = largest;j>=lowest;j++){
                d = i*j;
                if(d == rever(d) && d>ans){
                    ans = d;
                }
            }
        }
        return ans%1337;  
    }
    public static void main(String args[]){
        int k = largestPali(2);
        System.out.println(k);
    }
}