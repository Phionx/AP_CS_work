i/*Shantanu Jha
   4-13-2016
   QuickSort
   */

public class quicksort{
    public int k(int [] arr, int l, int r, int k){
        if(k > 0 && k <= r- l + 1){
            int p = split(arr, l, r);
            if(p-l == k-1) return arr[p];
            if(p-l > k-1)return k(arr, l, p-1, k);
            return (arr, p+1, r, k-p+l-1);
        }
        return 0;
    }

    
    public static void main (String [] args){
    }
