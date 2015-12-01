/*
Shantanu Jha
APCS1 pd5
HW38--Keep Guessing
2015-11-30
*/

import cs1.Keyboard;

public class GuessNumber {
private static int guesses = 1;

//Tells if high or low
public static boolean teller(int target){

//enter choice
int num = 0;
while(num > 100 || num < 1){
System.out.print("Guess a number from 1-100: ");
num = Keyboard.readInt();
}

//evaluate choice
if(target > num){
System.out.println("Too low, try again...");
guesses++;
return false;
} else if(target < num){
System.out.println("Too high, try again...");
guesses++;
return false;
} else {
System.out.println("Correct! It took " + guesses + " guesses.");
return true;
}
}

public static void main(String [] args){
int number = (int)(Math.random()*100) + 1;
boolean state = false;
while(!teller(number)){}
}
}

