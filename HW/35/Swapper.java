/*
  Shantanu Jha + Aleksandar Shipetich
  APCS1 pd5
  HW35--Put it together
  2015-11-22
*/

// Note to Mr Brown- We decided to add a little extra something to this assigment, that being the option to change any string in the given array before swapping.
import java.io.*;
import java.util.*;
public class Swapper{
    private static InputStreamReader isr = new InputStreamReader( System.in );
    private static BufferedReader in = new BufferedReader( isr );

    //Basic swap function, self explanatory
    public static String[][] swap(String [][] foo, int Row_1, int Column_1, int Row_2, int Column_2){
	String temp = foo[Row_1][Column_1];
	foo[Row_1][Column_1] = foo[Row_2][Column_2];
	foo[Row_2][Column_2] = temp;
	return foo;
    }
    //Prints an array
    public static void print(String [] [] foo){
	for(String [] i: foo){
	    System.out.println("");
	    for(String j: i){
		System.out.print(j + "\t\t");
	    }
	}
    }

    //Asks user for row input
    public static int inputRow(String [][] foo){
	int row = -1;
	while(row<0 || row>=foo.length){
	    System.out.println("\nA valid row choice is an integer between 0 and " + (foo.length-1));
	    System.out.print("Please enter a valid row choice: ");
	    try {
        	row = Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) {row=-1;}
	    catch ( NumberFormatException e) {row=-1;}
	}
	return row;
    }

    //Asks user for column input
    public static int inputCol(int r, String [][] foo){
	int col = -1;
	while(col<0 || col>= foo[r].length){
	    System.out.println("\nA valid column choice is an integer between 0 and " + (foo[r].length-1));
	    System.out.print("Please enter a valid column choice: ");
	    try {                                        
                col = Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException e ) {col=-1;}
	    catch ( NumberFormatException e) {col=-1;}
	}
	return col;
    }

    //Asks user for string input
    public static String inputString(){
	String retStr = "";
	while(retStr.equals("")){
	    System.out.print("\nPlease enter a valid word to replace the selected word: ");
	    try{
		retStr = in.readLine();
	    }
	    catch ( IOException e ) {retStr="";}
	}
	return retStr;
    }

    //Changes the selected string to newString
    public static void changeStr(int row, int col, String newString, String [] [] butt){
	butt[row][col] = newString;
    }


	    
    
    public static void main(String [] args){

	//Our very own array of String arrays
	String [][] fun = { {"swag", "topher", "shan", "shipetich"}, {"teddy", "github", "but", "Nr. Wang"}, {"Senor", "mouse", "mac", "dell"}, {"a", "dell", "e", "lol"}, {"aleks", "is", "a", "bagmaster"}};
	//String that gets printed to prompt user to do stuff
	String s;
	
	int row_1, col_1, row_2, col_2, changeRow, changeCol;

	String changeString = "";
	
	//Used to ask user to continue swapping or not
	String state = "y";
	//Used to ask user if they want to change a string
	String change = "y";

	s = "\n\tWelcome to the great array swapper\n";
	System.out.println(s);

	//The bigger while loop, while state is yes, it will allow you to keep swapping stuff, but when its no, it'll exit the program
	while(state.equals("y")){

	    s = "Here is the current String array:";
	    System.out.println(s);
	    print(fun);
	    
	    s = "\nWould you like to change any of the strings in the array?";
	    System.out.println(s);
	    change = "I don't know";
	    while(!(change.equals("n")) && !(change.equals("y"))){
		System.out.print("\nPlease enter 'y' to change a string and 'n' to proceed:");
		try {
		    change = in.readLine();
		}
		catch ( IOException e ) {}
	    }
	    //The smaller while loop responsible to String reasignment, works the same way as the bigger one.
	    while(change.equals("y")){
		s = "Here is the current String array:";
		System.out.println(s);
		print(fun);
	    
		s = "\nPlease enter a Row and Column selections for the string to be changed:\n";
		System.out.print(s);
		changeRow = inputRow(fun);
		changeCol = inputCol(changeRow, fun);
		s = "\nPlease enter the new word:\n";
		System.out.print(s);
		changeString = inputString();
		changeStr(changeRow, changeCol, changeString, fun);

		s = "Would you like to continue changing strings in the array?";
		System.out.println(s);
		change = "not y or n";
		while(!(change.equals("n")) && !(change.equals("y"))){
		    System.out.print("\nPlease enter 'y' to change a string and 'n' to proceed:");
		    try {
			change = in.readLine();
		    }
		    catch ( IOException e ) {}
		}
	    }
	    s = "Here is the current String array:";
	    System.out.println(s);
	    print(fun);
		
	    s = "\nPlease enter a Row and Column selections for the first string:\n";
	    System.out.print(s);
	    row_1 = inputRow(fun);
	    col_1 = inputCol(row_1, fun);

	    s = "\nPlease enter a Row and Column selections for the second string:\n";
	    System.out.print(s);
	    row_2 = inputRow(fun);
	    col_2 = inputCol(row_2, fun);

	    fun = swap(fun, row_1, col_1, row_2, col_2);

	    s = "Here is the swapped current String array:";
	    System.out.println(s);
	    print(fun);

	    s = "\nWould you like to continue swapping?\n";
	    System.out.println(s);
	    state = "not y or n";
	    while(!(state.equals("n")) && !(state.equals("y"))){
		System.out.print("\nPlease enter 'y' to continue and 'n' to stop:");
		try {
		    state = in.readLine();
		}
		catch ( IOException e ) {}
	    }
	}

	System.out.println("\nThank You for using the great array Swapper!");
    }

}
