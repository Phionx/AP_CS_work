// class Coin

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
    }

    /*=============================
      Coin(String) -- overloaded constructor
      precond: input is one of: "penny","nickel","dime","quarter",
                                "half dollar","dollar"
      postcond: 
      =============================*/
    public Coin( String s ) { 
	//your implementation here
    }

    /*=============================
      Coin(String,String) -- 
      precond: 
      postcond: 
      =============================*/
    public Coin( String s, String nowFace ) { 
	//your implementation here
    }

    // Accessors...
    // ----------------------------
    public String getUpFace() { 
	//your implementation here
    }

    public int getFlipCtr() { 
	//your implementation here
    }

    public double getValue() { 
	//your implementation here
    }

    public int getHeadsCtr() { 
	//your implementation here
    }

    public int getTailsCtr() { 
	//your implementation here
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
    }


    /*=============================
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
      =============================*/
    public void reset( String s, double d ) { 
	//your implementation here
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
    }


    /*=============================
      boolean equals(Coin) -- checks to see if 2 coins have same face up
      precond: other is not null
      postcond: Returns true if both coins showing heads
                or both showing tails. False otherwise.
      =============================*/
    public boolean equals( Coin other ) { 
	//your implementation here
    }


    /*=============================
      String toString() -- overrides toString() provided by Java
      precond: n/a
      postcond: Return String comprised of name and current face
      =============================*/
    public String toString() {
	//your implementation here
    }

}//end Coin class
