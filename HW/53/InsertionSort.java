/*
Shantanu Jha
APCS1 pd5
HW53--Poker Face
2016-01-04
*/

import java.util.*;

public class InsertionSort {


	public static void insertionSortV( ArrayList<Comparable> data ) 
    {
	for( int partition=1; partition<data.size(); partition++ ) {
	    //partition marks first item in unsorted region

	    //diag:
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data ); 

	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {

		// "walk" the current item to where it belongs
		// by swapping adjacent items
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) ); 
		}
		else 
		    break; 
	    }
	}
    }//end insertionSortV, O(n*n)

    public static ArrayList<Comparable> Insertion(ArrayList<Comparable> a){
        Comparable b;
        for(int i = 1; i < a.size(); i++){
            for (int j = i-1; j>= 0; j--){
                b = a.get(i);
                if(more(a, j, b)){
                    a.remove(i);
                    a.set(j, b);
                    break;
                }
            }
        }
        return a;
    }
                    
    public static boolean more(ArrayList<Comparable> a, int b, Comparable c){
            if(a.get(b).compareTo(c) < 0) return true;
            return false;
    }
    public static void main(String [] args){
        ArrayList<Integer> bob;
        bob.add(7);
        bob.add(2);
        bob.add(1);
        bob.add(4);
        bob.add(9);
        bob.add(2);
        System.out.println("Before: " + bob);
        Systen.out.println("After: " + Insertion(bob));
    }

}
