/*
Shantanu Jha
APCS1 pd5
HW9--Mergers and Acquisitions
2016-03-06
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static void merge( int[] arr, int low,int  mid,int  high) 
    {
        int [] a = new int [mid - low + 2];
        int [] b = new int [high - mid + 1];


        for(int i = low; i <= mid; i++) a[i-low] = arr[i];
        for(int j = mid+1; j <= high; j++) b[j-mid-1] = arr[j];
        int sizea = a.length;
        int sizeb = b.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < sizea && j < sizeb){
            if(a[i] < b[j]){
                arr[k] = a[i];
                i++;
                k++;
            } else if (a[i] > b[j]){
                arr[k] = b[j];
                j++;
                k++;
            } else {
                arr[k] = a[i];
                k++;
                arr[k] = b[j];
                i++;
                j++;
            }
        }
        return;

    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static void sort( int[] arr, int low, int high) 
    {

        if(low == high) return;
        else{
             int mid = (low + high)/2;
             sort(arr, low,mid);
             sort(arr, mid +1, high);
             merge(arr, low, mid+1, high);
        } 
        
    }//end sort()

    public static int[] sort(int[] arr){
        sort(arr, 0, arr.length-1);
        return arr;
    }

    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};


	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
    }//end main()

}//end class MergeSort
/*
Shantanu Jha
APCS1 pd5
HW9--Mergers and Acquisitions
2016-03-17
*/

public class Mergesort {

public static void main(String [] args){

}
}
