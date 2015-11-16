/*
ŠipetićSHan - SSH
Shantanu Jha, Aleksandar Šipetić;
APCS1 pd5
HW30 -- Ye Olde Role Playing Game, Expanded
2015-11-15
*/

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?
    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
				moveCount = 0;
				difficulty = 0;
				gameOver = false;
				isr = new InputStreamReader( System.in );
				in = new BufferedReader( isr );
				newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

				String s;
				String name = "";
				int choice = 0;
				s = "Welcome to Ye Olde RPG!\n";

				s += "\nChoose your difficulty: \n";
				s += "\t1: Easy\n";
				s += "\t2: Not so easy\n";
				s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
				System.out.print( s );

				while (difficulty <= 0 || difficulty > 3) {
					System.out.print("Please enter a valid selection: ");
					try {
						difficulty = Integer.parseInt( in.readLine() );
					}
					catch ( IOException e ) {difficulty = 0;}
					catch ( NumberFormatException e) {difficulty = 0;}
				}
			

				s = "Intrepid warrior, what doth thy call thyself? ";
				System.out.print( s );
				while (name == ""){
				try {
						name = in.readLine();
				}
				catch ( IOException e ) {name = ""; }
				}
				
				

				//instantiate the player's character
				s = "\nGreat " + name + ", what do you wish to be:\n\n";
				s += "\t1: Warrior\n";
				s += "\t2: Blacksmith\n";
				s += "\t3: Cook\n";
				s += "\t4: Knight\n";
				s += "\t6: Merchant\n";
				s += "\t7: Ninja\n";
				s += "\t8: Rogue\n";
				s += "\t9: Scribe\n";
				s += "\t10: Swagmaster\n";
				s += "\t11: Socialist\n";
				s += "\t12: Capitalist\n";
				s += "\t13: I want you to decide for me\n";
				
				
				System.out.print(s);
				
				
				while (choice <= 0 || choice > 13){
				System.out.print("Please enter a valid choice: ");
				try {
						choice = Integer.parseInt( in.readLine() );
				}
				catch ( IOException e ) {choice = 0; }
				catch ( NumberFormatException e) {choice = 0;}
				}
				
				if (choice == 13){
					choice = (int)(Math.random()*12) + 1;
				}
				
				switch (choice) {
					 case 1:
					 	pat = new Warrior( name );
					 	break;
					 case 2:
					 	pat = new Blacksmith( name );
					 	break;
					 case 3:
					 	pat = new Cook( name );
					 	break;
					 case 4:
					 	pat = new Knight( name );
					 	break;
					 case 5:
					 	pat = new Mage( name );
					 	break;
					 case 6:
					 	pat = new Merchant( name );
					 	break;
					 case 7:
					 	pat = new Ninja( name );
					 	break;
					 case 8:
					 	pat = new Rogue( name );
					 	break;
					 case 9:
					 	pat = new Scribe( name );
					 	break;
					 case 11:
					 	pat = new Socialist( name );
					 	break;
					 case 12:
					 	pat = new Capitalist( name );
					 	break;
					 case 10:
					 	pat = new SwagMaster( name );
					 	break;
					 default:
					 	pat = new Warrior(name);
					 	break;
				}
				choice = 0;
				
				s = "\n\nCongrats " + name + "! You are now a full fleged " + pat.getType() + "!\n";
				System.out.println(s);
				
	

		}//end newGame()


		/*=============================================
			boolean playTurn -- simulates a round of combat
			pre:  Warrior pat has been initialized
			post: Returns true if player wins (monster dies).
			Returns false if monster wins (player dies).
			=============================================*/
		public boolean playTurn() {

				int i = 1;
				int d1, d2;

				if ( Math.random() >= ( difficulty / 3.0 ) )
						System.out.println( "\nNothing to see here. Move along!" );
				else {
						System.out.println( "\nLo, yonder monster approacheth!" );

						smaug = new Monster();

						while( smaug.isAlive() && pat.isAlive() ) {

								// Give user the option of using a special attack:
								// If you land a hit, you incur greater damage,
								// ...but if you get hit, you take more damage.
								try {
										System.out.println( "\nDo you feel lucky?" );
										System.out.println( "\t1: Nay.\n\t2: Aye!" );
										i = Integer.parseInt( in.readLine() );
								}
								catch ( IOException e ) { }

								if ( i == 2 )
										pat.specialize();
								else
										pat.normalize();

								d1 = pat.attack( smaug );
								d2 = smaug.attack( pat );

								System.out.println( "\n" + pat.getName() + " dealt " + d1 +
																		" points of damage.");

								System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
																		" for " + d2 + " points of damage.");
						}//end while

						//option 1: you & the monster perish
						if ( !smaug.isAlive() && !pat.isAlive() ) {
								System.out.println( "'Twas an epic battle, to be sure... " + 
																		"You cut ye olde monster down, but " +
																		"with its dying breath ye olde monster. " +
																		"laid a fatal blow upon thy skull." );
								return false;
						}
						//option 2: you slay the beast
						else if ( !smaug.isAlive() ) {
								System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
								return true;
						}
						//option 3: the beast slays you
						else if ( !pat.isAlive() ) {
								System.out.println( "Ye olde self hath expired. You got dead." );
								return false;
						}
				}//end else

				return true;
		}//end playTurn()
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


		public static void main( String[] args ) {

				//As usual, move the begin-comment bar down as you progressively 
				//test each new bit of functionality...

				//loading...
				YoRPG game = new YoRPG();

				int encounters = 0;

				while( encounters < MAX_ENCOUNTERS ) {
						if ( !game.playTurn() )
								break;
						encounters++;
						System.out.println();
				}

				System.out.println( "Thy game doth be over." );
				/*================================================
					================================================*/
		}//end main

}//end class YoRPG




/*=============================================
  =============================================*/
