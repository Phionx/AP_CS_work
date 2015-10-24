/*
Shantanu Jha
APCS1 pd5
HW 18 --  For the Lulz Love of Strings
2015-10-19
*/

public class Foresrever {
//fenceF(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts
public static String fenceF(int n) {
String ans = "|";
for (;n>1;n--){
ans += "--|";
}
return ans;
}

//reverseF(String s) a non-empty String s and returns s with its letters reversed.
public static String reverseF(String s) {
String ans = "";
for (int n=0; n < s.length(); n++){
ans = s.substring(n,n+1) + ans;
}
return ans;
}

//reverseR(String s) a non-empty String s and returns s with its letters reversed. Employs recursion.
public static String reverseR(String s){
if(s.length() == 0){
return "";
}
return reverseR(s.substring(1,s.length())) + s.substring(0,1);
}

public static void main(String [] args){
System.out.println(fenceF(3));
System.out.println(reverseF("desserts"));
System.out.println(reverseR("stressed"));
}
}
