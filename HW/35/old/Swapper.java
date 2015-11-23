/*
Shantanu Jha
APCS1 pd5
HW35--Put it together
2015-11-21
*/

import java.io.*;
import java.util.*;
public class Swapper{
private static InputStreamReader isr = new InputStreamReader( System.in );
private static BufferedReader in = new BufferedReader( isr );

public static String[][] swap(String [][] foo, int Row_1, int Column_1, int Row_2, int Column_2){
String temp = foo[Row_1][Column_1];
foo[Row_1][Column_1] = foo[Row_2][Column_2];
foo[Row_2][Column_2] = temp;
return foo;
}

public static void print(String [] [] foo){
for(String [] i: foo){
System.out.println("");
for(String j: i){
System.out.print(j + "\t\t");
}
}
}

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

public static void main(String [] args){

//String [][] fun = {{"hi"},{"hi"},{"hi"}};
//String[][]fun;
String [][] fun = { {"swag", "topher", "shan", "shipetich"}, {"teddy", "github", "but", "Nr. Wang"}, {"Senor", "mouse", "macwintosh", "dell"}, {"a", "dell", "e", "lol"}, {"aleks", "is", "a", "bagmaster"}};
String s;
int row_1, col_1, row_2, col_2;

//Used to ask user to state swapping or not
String state = "y";

s = "\tWelcome to the great array swapper\n";
System.out.println(s);

while(state.equals("y")){
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

s = "\nWould you like to state swapping?\n";
System.out.println(s);
state = "not y or n";
while(!(state.equals("n")) && !(state.equals("y"))){
        System.out.print("\nPlease enter 'y' to state and 'n' to stop:");
	try {
                state = in.readLine();
        }
        catch ( IOException e ) {}
}
}

System.out.println("\nThank You for using the great array Swapper!");
}

}
