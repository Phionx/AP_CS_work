/*
Shantanu Jha
APCS2 pd9
HW21--Stack:/
2016-03-30
*/

public class LatKtS 
{

    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) 
    { 
        String Ans = "";
        Latkes temp = new Latkes(s.length());
        for(char j: s.toCharArray()){
            temp.push(Character.toString(j));
        }
        while(!(temp.isEmpty())){
            Ans += temp.pop();
        }
        return Ans;
    }


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) 
    { 
        Latkes temp = new Latkes(s.length());
        for(char j: s.toCharArray()){
            String n = Character.toString(j);
            if(n.equals("}") && temp.peek().equals("{")) {
                temp.pop();
            } else if(n.equals(")") && temp.peek().equals("(")) {
                temp.pop(); 
            } else if(n.equals("]") && temp.peek().equals("[")) {
                temp.pop(); 
            } else {
                temp.push(n);
            }
        }
        if(temp.isEmpty()) return true;
        return false;
    }//end allMatched()


    //main method to test
    public static void main( String[] args ) { 

	System.out.println(flip("stressed"));
        System.out.println(allMatched( "({}[()])" )); //true
        System.out.println(allMatched( "([)]" ) ); //false
        System.out.println(allMatched( "(){([])}" ) ); //true
        System.out.println(allMatched( "](){([])}" ) ); //false
        System.out.println(allMatched( "(){([])}(" ) ); //false
        System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    }

}//end class LatKtS
