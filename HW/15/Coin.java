//Shantanu Jha
//APCS pd5
//HW14 -- Wayne’s World
//2015-10-08

public class Coin {

    //attributes aka instance vars
    private double value;
    private String upFace, name;
    private int flipCtr, headsCtr, tailsCtr;
    private double bias = .5;

    /*=============================
      Coin() -- default constuctor
      precond: 
      postcond: 
      =============================*/
    public Coin() { 
	//your implementation here
upFace = "heads";
flipCtr = 0;
headsCtr = 0;
}

    /*=============================
    public Coin(String) -- overloaded constructor
      precond: input is one of: "penny","nickel","dime","quarter",
                                "half dollar","dollar"
      postcond: 
      =============================*/
    public Coin( String s ) { 
	//your implementation here
	this();
	name = s;
    }

    /*=============================
      Coin(String,String) -- 
      precond: 
      postcond: 
      =============================*/
    public Coin( String s, String nowFace ) { 
	//your implementation here
	this(s);
	upFace = nowFace;
    }

    // Accessors...
    // ----------------------------
    public String getUpFace() { 
	//your implementation here
	return upFace;
    }

    public int getFlipCtr() { 
	//your implementation here
    	return flipCtr;
	}

    public double getValue() { 
	//your implementation here
	return value; 
    }

    public int getHeadsCtr() { 
	//your implementation here
	return headsCtr;
    }


    public int getTailsCtr() { 
	//your implementation here
	return tailsCtr;
    }
    // ----------------------------


    /*=============================
      assignValue() -- set a Coin's monetary value based on its name
      precond:  input String is a valid coin name ("penny", "nickel", etc.)
      postcond: instvar value gets appropriate value
                Returns value assigned.
      =============================*/
    private double assignValue( String s ) {
	//your implementation here
	if (s == "penny") {
	value = 1;
	name = s;
}
	else if (s == "nickel") {
	name = s;
	value = 5;
}
	else if (s == "dime") {
	name = s;
	value = 10;
}
	else if (s == "quarter"){
	name = s;
	value = 25;
}
	else if (s == "half dollar"){
	name = s;
	value = 50;
}
	else if (s == "dollar") {
	name = s;
	value = 100;
}
	else {
return 0;
}
return value;
}


    /*=============================
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
      =============================*/
    public void reset( ) { 
	//your implementation here
    	//upFace = s;
	//bias = d;
	headsCtr = 0;
	tailsCtr = 0;
	flipCtr = 0;
	}


    /*=============================
      String flip() -- simulates a Coin flip
      precond:  bias is a double on interval [0.0,1.0]
                (1.0 indicates always heads, 0.0 always tails)
      postcond: upFace updated to reflect result of flip.
                flipCtr incremented by 1.
                Either headsCtr or tailsCtr incremented by 1, as approp.
                Returns "heads" or "tails"
      =============================*/
    public String flip() {
	//your implementation here
	flipCtr += 1;
	bias = Math.random();
	if (bias >= .5){
	upFace = "heads";
	headsCtr += 1;
	return "heads";
	}
	else {
	upFace = "tails";
	tailsCtr += 1;
	return "tails";
	}
    
    }


    /*=============================
      boolean equals(Coin) -- checks to see if 2 coins have same face up
      precond: other is not null
      postcond: Returns true if both coins showing heads
                or both showing tails. False otherwise.
      =============================*/
    public boolean equals( Coin other ) { 
	//your implementation here
	if(this.upFace == other.upFace) {
	return true;
}
	return false;
    }


    /*=============================
      String toString() -- overrides toString() provided by Java
      precond: n/a
      postcond: Return String comprised of name and current face
      =============================*/
    public String toString() {
	//your implementation here
	return name + " -- " + upFace;
    }

}//end Coin class
