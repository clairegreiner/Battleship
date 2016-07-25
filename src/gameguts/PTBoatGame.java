package gameguts;

public class PTBoatGame {
	private static PTBoat[] boats = new PTBoat[6]; // creating new array of 6
													// PtBoats
	private static int noOfBoats = 0;

	public void addboat(int location) {
		boats[noOfBoats] = new PTBoat(location);
		// stores the location
		noOfBoats++;

	}

	public boolean Guess (int location) {
		for (int i = 0; i <boats.length; i++) {
			if(boats[i].location == location) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		PTBoatGame game1 = new PTBoatGame();
		game1.addboat(3);
		game1.addboat(4);
		game1.addboat(2);
		game1.addboat(1);
		game1.addboat(5);
		game1.addboat(0);

		
		if(game1.Guess(5)){
			System.out.println("Hit");
		}
		else{System.out.println("Miss"); {
			

		}
	}

	//
	// for (int i = 0; i < 6; i++) {
	// PTBoat aNewBoat = new PTBoat(i, false); //see other class, currently
	// carrying 0 and false
	// boats[i]= aNewBoat;
	// noOfBoats++; //and here we loop! subject to i< 6 constraint
	//
	// }
	//
	// //public void addBoat(String row, int column) //making the boat
	//
	//
	//
	//
	// {
	// // Check to see if the guess hit any of the ships.
	// // Return true only if a ship was hit
	// }

}



// TODO Auto-generated method stub
// Create a PTBoatGame instance

// Add 6 PTBoats

// Take six guesses and output the following string for each
// If the guess hit a pt boat...
// Guess number # at row <row>, column <column> hit a PTBoat

// If the guess missed all boats
// Guess number # missed
