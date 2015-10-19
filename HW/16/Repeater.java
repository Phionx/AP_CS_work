//Shantanu Jha
//APCS1 pd5
//HW16 -- Do I repeat myself? Very well, then I repeat myself
//2015-10-15

public class Repeater {
//String fenceW(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts. Employs a while loop.
public static String fenceW(int posts) {
posts += -1;
String ans;
ans = "|";
while (posts > 0) {
posts += -1;
ans += "--|";
}
return ans;
}



//String fenceR(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts. Employs recursion.
public static String fenceR(int posts) {
if (posts > 1){
return "|--" + fenceR(posts-1);   
}
else {
return "|";
}
}

public static void main(String [] args) {
System.out.println(fenceW(1)); // → “|”
System.out.println(fenceW(2)); // → “|--|”
System.out.println(fenceW(3)); // → “|--|--|”

System.out.println(fenceR(1)); // → “|”
System.out.println(fenceR(2)); // → “|--|”
System.out.println(fenceR(3)); // → “|--|--|”
}                        
}
