/*
Aleksandar Shipetich & Shanatu Jha == Team Byte Me
APCS1 pd5
HW36 -- Some Folks Call It a Memory
2015-11-24  
*/

import cs1.Keyboard;
public class Concentration {

		//instance variables
		private Tile[][] _board = new Tile[_numRows][_numCols];     
		private int _numberFaceUp;   //count of Tiles with faces visible
		private String[] _words = {"Aleks", "The", "Great", "Is", "Swag", "a", "licious", "."}; //Words to be tile-ified    
		private static int _numRows = 4;
		private static int _numCols = 4;
		//Stats
		private int totalFlips = 0;
		private int totalWrongFlips = 0;
		private int totalRightFlips = 0;
		

//=========================================Constructors=================================================================================================================
		//Default Constructor
		public Concentration(){
			//loops thru the words list twice, choosing random tiles as it goes along with the tileSetter helper function
			for(int i = 0; i<16; i++){
				int j = i;
				if (j>7)
					j = j-8;
				tileSetter(_words[j]);
			}
		}
		//Helper function: Takes the string that will replace, chooses a random tile and checks if its already been named, if it has it chooses another one.
		public void tileSetter(String bob){
			int randRow = randRowCol();
			int randCol = randRowCol();
			if (_board[randRow][randCol] == null){
				_board[randRow][randCol] = new Tile(bob);
			}
			else
				tileSetter(bob);
		}
		//Random call from 0-4
		public int randRowCol(){
			return (int)(Math.random()*4);
		}
		
		
//=========================================Helper Functions=================================================================================================================

//General Helper Functions
		//prints board
		public static void print(Object [][] foo){
			for (Object [] i: foo){
				System.out.println("");
				for(Object j: i){
					System.out.print(j + "\t\t");
				}
			}
		}
		
		//clear function
		private static void clear(){
		final String clear = "\u001b[2J";
		final String home = "\u001b[H";
		System.out.print(clear + home);
		System.out.flush();
		}

		//time delay function 
		private static void delay(int delay_time){
			try {
    			Thread.sleep(delay_time);
			} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}
		}
		
//Tile Chooser Helper Functions
		//Helps chose a valid Row position
		//Returns int of a valid row position
		public int chooseTileRow(){
			int Row = -1;
			while(Row < 0 || Row>= _board.length){
				System.out.print("Please enter a valid row number, a valid row number is between 0 and " + (_board.length-1) + ": ");
				Row = Keyboard.readInt();
			}
			return Row;
		}
		
		
		//Helps chose a valid column position given a row
		//Returns int of a valid column position
		public int chooseTileCol(int Row){
			int Col = -1;
			while(Col<0 || Col >= _board[Row].length){
				System.out.print("Please enter a valid column number, a valid column number is between 0 and " + (_board[Row].length-1) + ": ");
				Col = Keyboard.readInt();
			}
			return Col;
		}
	
//=========================================Main Game Play Methods=================================================================================================================
		//developers hacks method :3
		public void peep(){
			clear();
			System.out.println("\t\t\tMemory\n\n");
			for(Tile[]i: _board){
				System.out.println("");
				for(Tile j: i){
					j.flip();
					System.out.print(j + "\t\t");
				}
			}
		}
		
		public void unpeep(){
			for(Tile[]i: _board){
				for(Tile j: i){
					j.flip();
				}
			}
		}
		
		//main game play method ... returns end game String (returning is also a good way to end the game)
		public String play(){
			String choice = "y";
			
			while(choice.equals("y") || choice.equals("devhacks")){
				clear();
				System.out.println("\t\t\tMemory\n\n");
				print(_board);
				System.out.println("");
				if (totalRightFlips == (int)(_numRows*_numCols/2)){
					return "GOOD JOB! You won the game!\nAfter a total of " + totalFlips + " flips, out of which " + totalWrongFlips + " were wrong, you got all " + totalRightFlips + " matches!";
				}
				//System.out.print("\nWould you like to flip? (Enter 'y' to continue, and 'exit' to exit the game): ");
				choice = "";
				while(!(choice.equals("y")) && !(choice.equals("exit")) && !(choice.equals("devhacks"))){
					System.out.print("\nWould you like to flip? (Enter 'y' to continue, and 'exit' to exit the game): ");
					choice = Keyboard.readString();
				}
				
				//developer hack function
				if (choice.equals("devhacks")){
					peep();
					System.out.println("\n\nHuhuhu looks like you found the developers hack ;)");
					while(!(choice.equals("back"))){
						System.out.print("\nWhen you are done type 'back' to go back: ");
						choice = Keyboard.readString();
					}
					unpeep();
					choice = "devhacks";
				}
				
				if (choice.equals("y")){
					System.out.println("\ntest");
					flip();
				}
			}
			
			return "Thank you for Playing Memory!\nYou didn't find everything, but you did have " + totalRightFlips + " good flips, " + totalWrongFlips + " bad flips, and a total of " + totalFlips + " flips.";
			
		}
		
		
		//Tile Flipper Function
		public void flip(){
			clear();
			int Row_1, Row_2, Col_1, Col_2;
			System.out.println("\t\t\tMemory\n\n");
			print(_board);
			System.out.print("\n\n");
			//Choosing card position 1
			System.out.print("Enter the location of the first card you wish to flip (Make sure it isn't already face up)!\n");
			Row_1 = chooseTileRow();
			Col_1 = chooseTileCol(Row_1);
			//Choose again if card is already flipped
			while(_board[Row_1][Col_1].isFaceUp()){
				System.out.print("You entered the position of an already flipped card :(, please choose again!\n");
				Row_1 = chooseTileRow();
				Col_1 = chooseTileCol(Row_1);
			}
			
			//Choosing card position 2
			System.out.print("\nEnter a different location for the second card you wish to flip!\n");
			Row_2 = chooseTileRow();
			Col_2 = chooseTileCol(Row_2);
			//Choose again if card is already flipped
			while(_board[Row_2][Col_2].isFaceUp()){
				System.out.print("You entered the position of an already flipped card :(, please choose again!\n");
				Row_2 = chooseTileRow();
				Col_2 = chooseTileCol(Row_2);
			}
			
			//check if the two positions are unique
			while(Row_1 == Row_2 && Col_1 == Col_2){
				System.out.print("\nYou enterd entered the same location for the second card as you did for the first, please choose again!\n");
				Row_2 = chooseTileRow();
				Col_2 = chooseTileCol(Row_2);
			}
			
			
			_board[Row_1][Col_1].flip();
			_board[Row_2][Col_2].flip();
			
			clear();
			System.out.println("\t\t\tMemory\n\n");
			print(_board);
			if(_board[Row_1][Col_1].equals(_board[Row_2][Col_2])){
				System.out.println("\n\nGOOD JOB! You got a match! :)\n\n");
				totalRightFlips += 1;
				totalFlips += 1;
				delay(1500);
			}
			else {
				System.out.println("\nSorry you didn't get a match, but commit these cards to your memory ;), so that you have a better chance next time!");
				totalWrongFlips += 1;
				totalFlips += 1;
				_board[Row_1][Col_1].flip();
				_board[Row_2][Col_2].flip();
				delay(1500);
				
			}
			clear();
		}
		
		
//=========================================Main method=================================================
		//DO NOT MODIFY main()
		public static void main(String[] args){
				String results;
				Concentration game = new Concentration();
				results = game.play();
				clear();
				System.out.println(results);
		}

}//end class Memory

