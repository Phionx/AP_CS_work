/*
Shantanu Jha
APCS1 pd5
HW38--Keep Guessing
2015-11-30
*/

import cs1.Keyboard;

public class GuessNumber {
private int guesses;
//Tells if high or low
public boolean teller(int target){
int num = 0;
while(num >
if(target > num){
System.out.println("Too low, try again...");
guesses++;
return false;
} else if(target < num){
System.out.println("Too high, try again...");
guesses++;
return false;
} else if(target == num){
System.out.println("Correct! It took " + guesses + " guesses.");
return true;
}

public static void main(String [] args){
int number = (int)(Math.random()*100) + 1;
boolean state = false;

while(!state){

}
}
}
