/*
Shantanu Jha
pd5 APCS1
HW21 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2015-10-26
*/

public class Pig {

    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA(â€œcatâ€, â€œaâ€) â†’ true  
			hasA(â€œcatâ€, â€œpâ€) â†’ false
      =====================================*/
    public static boolean hasA( String w, String letter ) {
		return w.indexOf(letter) != -1;
		}//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) {
				String temp = "aeiou";
				if(temp.indexOf(letter) != -1) return true;
				//your implementation here
				return false; //placeholder to get past compiler
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels(â€œmeatballâ€) â†’ 3
      =====================================*/
    public static int countVowels( String w ) {
	int ans = 0;
	for(int i = 0; i< w.length(); i++){
		if(isAVowel(w.substring(i,i+1))) ans += 1;
	}
	if(ans == 0) return -1;
	return ans;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel(â€œcatâ€) â†’ true
			hasAVowel(â€œzzzâ€) â†’ false
      =====================================*/
    public static boolean hasAVowel( String w ) {
				if(countVowels(w) != -1) return true;
				return false; //placeholder to get past compiler
		}


		/*=====================================
			String allVowels(String) -- returns vowels in a String
			pre:  w != null
			post: allVowels(â€œmeatballâ€) â†’ â€œeaaâ€
			=====================================*/
		public static String allVowels( String w ) {
				String ans = "";
				for(int i = 0; i< w.length(); i++){
					if(isAVowel(w.substring(i,i+1))) ans += w.substring(i, i+1);
				}
				//your implementation here
				return ans; //placeholder to get past compiler
		}


		/*=====================================
			String firstVowel(String) -- returns first vowel in a String
			pre:  w != null
			post: firstVowel("") --> ""
			firstVowel("zzz") --> ""
			firstVowel("meatball") --> "e"
			=====================================*/
		public static String firstVowel( String w ) {
				//your implementation here
			if(hasAVowel(w)) return allVowels(w).substring(0,1);	
			return ""; //placeholder to get past compiler
		}


		/*=====================================
			boolean beginsWithVowel(String) -- tells whether String begins with a vowel
			pre:  w != null and w.length() > 0
			post: beginsWithVowel("apple")  --> true
			beginsWithVowel("strong") --> false
			=====================================*/
		public static boolean beginsWithVowel( String w ) {
				//your implementation here
				return isAVowel(w.substring(0,1)); //placeholder to get past compiler
		}


		/*=====================================
			String engToPig(String) -- converts an English word to Pig Latin
			pre:  w.length() > 0
			post: engToPig("apple")  --> "appleway"
			engToPig("strong") --> "ongstray"
			engToPig("java")   --> "avajay"
			=====================================*/
		public static String engToPig( String w ) {
				//your implementation here
				if(w.length() == 0) return "";
				if(beginsWithVowel(w)) return w + "way";
				if(w.length() == 1) return w + "ay"; //I know this doesn't exist in real life 
				return w.substring(1) + w.substring(0,1) + "ay";
		}


		public static void main( String[] args ) {

				//Some test calls. You are encouraged to add more.
				/*
					String letter = "p";

					for( String w : args ) {
					System.out.println( w + " has " + letter + "? " 
					+ hasA( w, letter ) );
					}   
				*/

				for( String word : args ) {
						System.out.println(word);
						System.out.println( allVowels(word) );
						System.out.println( firstVowel(word) );
						System.out.println( countVowels(word) );
						System.out.println( engToPig(word) );
				}

		}//end main()

}//end class Pig

