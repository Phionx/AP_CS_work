/*
Shantanu Jha
APCS1 pd5
HW34--Arrays of Arrays
2015-11-19
*/

// skeleton file for 
// class TwoDimArray
// ...practice working with 2D arrays


public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) { 
	for (int [] i: a) {
	System.out.println("");
	for (int j: i){
		System.out.print(j+ " ");
	}
	}
	// *** YOUR IMPLEMENTATION HERE ***
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) {
	for(int i = 0; i < a.length; i++){
	System.out.println("");
	for(int j = 0; j < a[i].length; j++){
		System.out.print(a[i][j] + " ");
	}
	} 
	// *** YOUR IMPLEMENTATION HERE ***
    }

    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a ) {
	int ans = 0;
	for (int [] i: a) {
        for (int j: i){
        	ans += j;
	}
        }
 	return ans;
	// *** YOUR IMPLEMENTATION HERE ***
    }

    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] a ) { 
    	int ans = 0;
	for(int i = 0; i < a.length; i++){
	ans += sumRow(i, a);
	}
	return ans;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
	int ans = 0;
	for(int i: a[r]){
	ans += i;
	}    
	return ans;
}

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] a){ 
    	int ans = 0;
	for(int i = 0; i < a[r].length; i++){
		ans+=a[r][i];
	}
	return ans;
}


    public static void main(String [] args) {
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	print1(m1);
	print1(m2);
	print1(m3);
	print2(m1);
	print2(m2);
	print2(m3);
	System.out.print("\ntesting sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
    }

}//end class TwoDimArray
