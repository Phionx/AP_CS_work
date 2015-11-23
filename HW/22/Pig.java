// Team 11 -- Dylan Wright, Jordan Louie, Shantanu Jha
// APCS1 pd5
// HW22 -- Updated Pig.java
// 2015-10-28
import java.util.Scanner;
public class Pig {

    private static final String VOWELS = "aeiou";

    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") ?true  
			hasA("cat", "p") ?false
      =====================================*/
    public static boolean hasA(String w, String letter){
        return w.indexOf(letter) != -1;
    }

    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel(String letter){
        return hasA(VOWELS, letter);
    }

    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") ?3
      =====================================*/
    public static int countVowels(String w){
        int vowelCount = 0;
        for (int x = 0; x < w.length(); x++) {
            if (isAVowel(w.substring(x, x+1))) {
                vowelCount += 1;
            }
            else if (x > 0 && (w.substring(x, x+1)).equals("y") && isAVowel(w.substring(x-1, x)) == false){
                vowelCount += 1;
            }
        }
        return vowelCount;
    }

    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") ?true
			hasAVowel("zzz") ?false
      =====================================*/
    public static boolean hasAVowel(String w){
        return countVowels(w) > 0;
    }

	/*=====================================
	String allVowels(String) -- returns vowels in a String
	pre:  w != null
    post: allVowels("meatball") ? "eaa"
    =====================================*/
    public static String allVowels(String w){
        String retStr = "";
        for (int x = 0; x < w.length(); x++) {
            if (isAVowel(w.substring(x, x+1))) {
                retStr += w.substring(x, x+1);
            }
            else if (x > 0 && (w.substring(x, x+1)).equals("y") && isAVowel(w.substring(x-1, x)) == false){
                retStr += w.substring(x, x+1);
            }
        }
        return retStr;
    }

    /*=====================================
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
    =====================================*/
    public static String firstVowel(String w) {
        if(hasAVowel(w)) {
            return allVowels(w).substring(0,1);
        }
        return "";
    }

    /*=====================================
    boolean beginsWithVowel(String) -- tells whether String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
    =====================================*/
    public static boolean beginsWithVowel(String w){
        return isAVowel(w.substring(0, 1));
    }
    
    public static boolean hasPun(String w){
    String punc = "!?,.:;";
    //String special = "-'";
    return punc.indexOf(w.substring(w.length()-1,w.length())) != -1;
    }
    /*=====================================
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    =====================================*/
    public static String engToPig(String w){
        String retStr = "";
        String punc = "!?,.:;'";
        String temp = "";
        
        
        //punctuation handeling
        for(int i = 0; i < w.length(); i++){
            if(w.substring(i, i+1).equals("-")){
                return engToPig(w.substring(0, i)) + "-" + engToPig(w.substring(i+1, w.length()));
                
            }
            if(punc.indexOf(w.substring(i, i+1)) != -1){
                temp = w.substring(i, w.length());
                w = w.substring(0,i);
                break;
            }
            
        }
        
        int temp2 = punc.indexOf(w.substring(w.length()-1,w.length()));
        if (temp2 != -1){
            temp = punc.substring(temp2, temp2 + 1);
            w = punc.substring(0, w.length()-1);
        }
        
        if (hasAVowel(w)){
            if (beginsWithVowel(w)){
                retStr = w + "way";
            }
            else {
                int x = w.indexOf(firstVowel(w));
                retStr = w.substring(x) + w.substring(0, x) + "ay";
            }
            if (Character.isUpperCase(w.charAt(0))){
                retStr = (retStr.substring(0, 1)).toUpperCase() + retStr.substring(1).toLowerCase();
            }
        }
        return retStr + temp;
    }
    
    public static void main(String[] args){
        //Some test calls. You are encouraged to add more.
        /*
        String letter = "p";
        for( String w : args ) {
        System.out.println( w + " has " + letter + "? "
        + hasA( w, letter ) );
        }
        
        //for(String word : args){
            //System.out.println(allVowels(word));
            //System.out.println(firstVowel(word));
            //System.out.println(countVowels(word));
            //System.out.println(engToPig(word));
            
        }*/
	Scanner s = new Scanner();
	while(s.hasNextLine()){
		System.out.println(engToPig(sc.nextLine()));
}
    }
}
