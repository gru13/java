public class queue {
    
    int[] arr = new int[1];
    int top;
    
    public void display(){
        for(int val: arr){
            System.out.println(val);
        }
    }

    public void reverse(){
        int[] nw = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            nw[i] = arr[arr.length-1-i];
            // System.out.println(arr.length-i-1);
        }
        arr = nw;
    }

    public void enQueue(int val){
        int[] nw = new int[top+1];
        nw[top] = val;
        for(int i = 0;i<top;i++){
            nw[i] = arr[i];
        }
        top++;
        arr = nw;
    }
    public int deQueue() {
        if(isEmpty()){
            return 0;
        }
        int[] nw = new int[top-1];
        int val = arr[0];
        for(int i = 0;i<nw.length;i++){
            nw[i] = arr[i+1];
        }
        arr = nw;
        top--;
        return val;
    }
    protected boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}

