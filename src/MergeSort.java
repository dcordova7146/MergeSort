public class MergeSort {
    public void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public void mergeSortHelper(int[]arr,int left,int right,int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public void merge(int[] arr,int left, int mid, int right, int[] temp){
            
    }
}
