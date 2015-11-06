/*
Shantanu Jha
APCS1 pd5
HW25 -- ?
2015-11-5
*/

public class Looper {
public static int linSearch(int [] a, int target){
for(int i = 0; i < a.length; i++){
if(target == a[i]) return i;
}
return -1;
}

public static int[] shorten(int[]a){
if(a.length == 1) return (new int[0]); 
int [] temp = new int[a.length -1];
for(int i = 1; i < a.length; i++){
temp[i-1] = a[i];
}
return temp;
}


public static int linSearchR(int [] a, int target){
if(a.length == 0) return -1;
if(a[0] == target) return 0;
if(linSearchR(shorten(a), target) == -1) return -1;
return 1 + linSearchR(shorten(a), target);
}


public static int freq(int [] a, int target){
int temp = 0;
for(int s: a){ if(s == target) temp++;}
return temp;
}

public static int freqRec(int [] a, int target){
if(a.length == 0) return 0;
int temp = 0;
if(a[0] == target) temp++;
return temp + freqRec(shorten(a), target);
}

public static void main(String [] args){
int[] lol = {1,2,2,45,5};

System.out.println("Should be 3: " + linSearch(lol, 45));
System.out.println("Should be -1: " + linSearch(lol, 4));
System.out.println("Should be 3: " + linSearchR(lol, 45));
System.out.println("Should be -1: " + linSearchR(lol, 4));

System.out.println("Should be 2: " + freq(lol, 2));
System.out.println("Should be 0: " + freq(lol, 0));
System.out.println("Should be 2: " + freqRec(lol, 2));
System.out.println("Should be 0: " + freqRec(lol, 0));
}

}
