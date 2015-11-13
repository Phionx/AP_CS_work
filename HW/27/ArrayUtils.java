/*
Shantanu Jha
APCS1 pd5
HW 27 -- Objectify Your Array Tools
2015-11-09
*/


public class ArrayUtils {
public static int linSearch(Object [] a, Object target){
for(int i = 0; i < a.length; i++){
if(target == a[i]) return i;
}
return -1;
}

public static Object [] shorten(Object []a){
if(a.length == 1) return (new Object [0]);
Object [] temp = new Object [a.length -1];
for(int i = 1; i < a.length; i++){
temp[i-1] = a[i];
}
return temp;
}


public static int linSearchR(Object [] a, Object target){
if(a.length == 0) return -1;
if(a[0] == target) return 0;
if(linSearchR(shorten(a), target) == -1) return -1;
return 1 + linSearchR(shorten(a), target);
}


public static int freq(Object [] a, Object target){
int temp = 0;
for(Object s: a){ if(s == target) temp++;}
return temp;
}

public static int freqRec(Object [] a, Object target){
if(a.length == 0) return 0;
int temp = 0;
if(a[0] == target) temp++;
return temp + freqRec(shorten(a), target);
}

public static String stringify(Object [] a){
String temp = "";
for(Object i: a){
temp += i + " ";
}
return temp.substring(0,temp.length() - 1);
}



public static void main (String [] args){

Integer [] intArr = {1,3,4,6,37,7,4,5,6,7,45,6,2,7,6};
String [] strArr = {"1","1","6","3","7","6","6"};
Object [] mixArr = {6, "6", 3, 7, "7", 1};

//Taken from Piazza!
System.out.println("\n======INT ARRAY=====");
	for (int i=0; i<intArr.length; i++) {
	    System.out.println( "intArr[" + i + "] DATA TYPE:" 
				+ (intArr[i]).getClass().getName() );
	}
	System.out.println("Stringify(intArr):\t" + stringify(intArr) +
			   "\nlinSearch(intArr,6):\t" + linSearch(intArr,6) +
			   "\nfreq(intArr, 7):\t" + freq(intArr, 7) + "\n"
			   );

System.out.println("=====STR ARRAY=====");
	for (int i=0; i<strArr.length; i++) {
	    System.out.println( "strArr[" + i + "] DATA TYPE:" + 
				(strArr[i]).getClass().getName() );
	}
	System.out.println("Stringify(strArr):\t" + stringify(strArr) +
			   "\nlinSearch(strArr, \"6\"):\t" + linSearch(strArr,"6") +
			   "\nfreq(strArr, \"7\"):\t" + freq(strArr, "7") + "\n"
			   );


System.out.println("\n======MIX ARRAY=====");
        for (int i=0; i<mixArr.length; i++) {
            System.out.println( "mixArr[" + i + "] DATA TYPE:"
                                + (mixArr[i]).getClass().getName() );
        }
        System.out.println("Stringify(mixArr):\t" + stringify(mixArr) +
                           "\nlinSearch(mixArr, \"6\"):\t" + linSearch(mixArr,"6") +
                           "\nfreq(mixArr, 7):\t" + freq(mixArr, 7) + "\n"
                           );


}

}
