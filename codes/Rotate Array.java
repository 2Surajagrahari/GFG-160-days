class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        if(n == 0) return;
        d = d % n;
        if(d == 0){
            return;
        }
        int index = 0;
        int res[] = new int[n];
        for(int i=d;i<n;i++){
            res[index++] = arr[i];
        }
        
        for(int i=0;i<d;i++){
            res[index++] = arr[i];
        }
        
        for(int i=0;i<n;i++){
            arr[i] = res[i];
        }
        
    }
}