/*
Shantanu Jha
APCS2 pd9
HW31--Fast Selection
2016-04-14
*/

public class FastSelect {
    
    public static void main(String[] args){
    }


    private static int FastSelect(int[] a, int k, int left, int right) {
    int pivot = findpivot(a,left,right);
    return pivot == k - 1 ? a[pivot] : k - 1 < pivot ? 
            FastSelect(a, k, left, pivot - 1) : 
            FastSelect(a, k, pivot + 1, right);
}
    private static int findpivot(int[] a, int left, int right) {

        int pivot = a[(left+right)/2];
        while(left<right){
            while(a[left]<pivot){
                left++;
            }
            while(a[right]>pivot){
                right--;
            }

            if(left<=right){
                swap(a,left,right);
                left++;
                right--;
            }

        }
        return left;
    }

    private static void swap(int[] a, int i, int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
