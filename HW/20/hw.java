/*
Shantanu Jha
APCS1 pd5
HW20 -- Karmacomma
2015-10-22
*/

public class hw {
public static String commafyR(long a) {
Long temp = a;
if(a < 1000){
return temp.toString();
}
temp = a%1000;
return commafyR(a/1000) + "," + temp.toString();

}


public static String commafyF(long a){
String ans = "";
Long n;
Long temp = a;
if (a< 1000){
return temp.toString();
}
while(temp>=1000){
n = temp%1000;
ans = "," + n.toString() + ans;
temp = temp/1000;
}
ans = temp.toString() + ans;
return ans;
}

public static void main(String [] args){
for ( String s : args ) {
    long temp = Long.parseLong(s);
    System.out.println( "commafyR(" + temp + "): " + commafyR(temp) );
    System.out.println( "commafyF(" + temp + "): " + commafyF(temp) );
}
}
}
