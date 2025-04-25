// int roomId
// 4 ints exits for each direction
// make all variables private

public class Room {
	int roomID;
	int exitN; 
	int exitE;
	int exitS;
	int exitW;
	
	Room(int roomID, int exitN, int exitE, int exitS, int exitW){
		this.roomID = roomID;
		this.exitN = exitN;
		this.exitE = exitE;
		this.exitS = exitS;
		this.exitW = exitW;
	}
	void drawRoom() {
		boolean eN = this.exitN != roomID;
		boolean eE = this.exitE != roomID;
		boolean eS = this.exitS != roomID;
		boolean eW = this.exitW != roomID;
		//draw ascii art of rooms
		// if (eN && eE && !eS && !eW){Asci room} 
	}
	//Accessors and Mutators
}
