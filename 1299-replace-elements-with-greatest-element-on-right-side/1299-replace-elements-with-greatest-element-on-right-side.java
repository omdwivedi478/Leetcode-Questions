class Solution {
    public int[] replaceElements(int[] arr) {
        // int max = -1;
        // for(int i = arr.length - 1; i >= 0; i--){
        //     int current = arr[i];
        //     arr[i] = max;
        //     max = Math.max(current,max);
        // }
        // return arr;

        for(int i =0;i<arr.length-1;i++){
            int max = -1;
            for(int j =i+1;j<arr.length;j++){
                // if(arr[j]>arr[i]){
                //     arr[i]=arr[j];
                    max = Math.max(max,arr[j]);
                // }
            }
            arr[i] = max;
        }
            arr[arr.length-1] = -1;   
        return arr;

    }
}