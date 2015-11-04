/*
Shantanu Jha
APCS1 pd5
HW23 -- Augmenting Your Array of Tools
2015-11-2
*/

public class hw {
public static int[] test = new int[3];
public static void populate(int[] a, int low, int high){
int temp = high - low + 1; //cause Math.random() os [0,1) so to get range of ints from 10 -> 15 you would want Math.random()*6 + 10
for(int i = 0; i < a.length; i++){
a[i] =(int)(Math.random()*temp) + low;
}
}

public static String stringify(int[] a){
String temp = "";
for(int i: a){
temp += i + " ";
}
return temp.substring(0, temp.length() -1);
}
 
public static void main (String [] args) {
int n = 0;
while(n<100){
populate(test, 10, 15);
System.out.println(stringify(test));
n += 1;
}
}


}
