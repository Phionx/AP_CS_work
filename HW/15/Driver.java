//Shantanu Jha
//APCS1 pd5
//HW15 -- Loopy
//2015-10-13

/*=============================
  driver for class Coin
  ~~~ SUGGESTED WORKFLOW: ~~~
  1. Compile this file and run.
  2. Cut&paste the "TOP" line below the first statement. 
  (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
  3. Compile and run again. 
  4. Resolve errors 1 at a time until it works
  5. Repeat 2-4 until TOP meets BOTTOM
  =============================*/

public class Driver {

    public static void main( String[] args ) {
    Coin foo = new Coin();
    Coin goo = new Coin();
	int x, y, z, match, heads, tails;
    String a, b;
    x = 8;
    y = 9;
    z = 13;
    match = 0;
    heads = 0;
    tails = 0;
        
    
    //Part a
        while(foo.getHeadsCtr() < x){
            foo.flip();
        }
        System.out.println("It took " + foo.getFlipCtr() + " coin flips to get " + x + " coin flips that resulted in heads\n");
        foo.reset();
    //Part b
        while(match < y){
            a = foo.flip();
	    b = goo.flip();
	    if (a == b) {
		match += 1;
		}

        }
        System.out.println("It took " + foo.getFlipCtr() + " coin flip rounds to get " + y + " coin flip rounds that resulted in matching upFaces!\n");
        foo.reset();
	goo.reset();
	match = 0;
    //Part c
	while(match <= 13){
	    a = foo.flip();
            b = goo.flip();

            if(a == b){
                match += 1;
                if(a == "heads"){
                    heads += 1;
                }
		else if(a == "tails"){
                    tails += 1;
                }
            }
}
/*I tried setting the while loop to (heads == tails || !(match%heads == 0 && match%tails == 0) because the heads and tails matches were some how always the same when the while loop ended .. and after some 
 some print tests and experimenting... I realized just how hard it is to not get a heads == tails end case ... because matches = heads + tails and heads and tails are statistically always around the same value*/
       
	while(!(match%heads == 0 && match%tails == 0)){
            a = foo.flip();
            b = goo.flip();
            
	if(a == b){
                match += 1;
                if(a == "heads"){
                    heads += 1;}
                else if(a == "tails"){
                    tails += 1;
                }
            }}

        System.out.println("It took " + foo.getFlipCtr() + " coin flip rounds to fulfill your conditions");
        System.out.println("The number of total matches was "+ match + " coin flips rounds, the number of matches with heads was " + heads + ", and the number of matches with tails was " + tails + ".");
	foo.reset();
        goo.reset();
                        
            
        }
	 

    }

