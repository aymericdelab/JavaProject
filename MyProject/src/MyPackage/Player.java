package MyPackage;


public class Player {
	
	//username of the player, can be used later for the highscores
	String username;
	
	//create a high score for that player
	int hs;
	
	//player position
	int x_pos;
	int y_pos;
	int x_old;
	int y_old;
	
	// skill attributes 
<<<<<<< HEAD
	
	int looks;
=======

	int looksSkills;

>>>>>>> f179397af6dd632c42a4a403c6edabfcd9eeec9f
	int danceSkills;
	
	// energy
	
	int energy;
	
<<<<<<< HEAD
	//amount to lose or gain when confronts an obstacle
	int amount;
	
	Player(String username, int input_skills, int difficulty){
		
		this.username = username+":";
		
=======
	Player(int input_skills, int difficulty){

>>>>>>> f179397af6dd632c42a4a403c6edabfcd9eeec9f
		x_pos = 0;
		y_pos = 0;
		x_old = 0;
		y_old = 0;
		

		//The neutral value for looks and dancing skills is set to 20 and the value changes
		//with the value that the player inputs on a scale that goes from looks to dancing skills.
		//If the player favors the left side of the scale, the looks will increase and the dancing
		//will decrease. The scale goes from 0 (completely favors the looks) to 10 (completely 
		//favors the dancing skills).

		
		looksSkills = 20 + 2*(10 - input_skills);
		danceSkills = 20 + 2*input_skills;
		
		//The neutral value for the energy is set to 30 and decreases as we increase the difficulty
		//times two
		energy = 30 - (2*difficulty) ;

		//energy = 50;
		
	}
	
	//method to move the player in any direction but maximum of 1 step
	 void move(int x1, int y1) {
		 
		 if(Math.abs(x1)>1 || (Math.abs(y1)>1)) {
				System.out.println("Unreachable");
			}
		else {
			x_pos = x_pos + x1;
			y_pos = y_pos + y1;
			
		}
		 loseEnergy(1);
		
	 }
			
	void gainEnergy(int amount) {
		energy = energy + amount;
	}
	 
	void loseEnergy(int amount) {
		
		energy= energy - amount;
	}
	
	void loseDancingSkills(int amount) {
		
		danceSkills = danceSkills + amount;
	}
	
	void gainDancingSkills(int amount) {
		
		danceSkills= danceSkills + amount;
	}
	
	void loseLooks(int amount) {
		
<<<<<<< HEAD
		looks = looks - amount;
	}
	
	void gainLooks(int amount) {
		
		looks = looks + amount;
=======
		looksSkills--;
	}
	

	void gainLooks() {
		
		looksSkills++;
>>>>>>> f179397af6dd632c42a4a403c6edabfcd9eeec9f
	}	
	
	//int is the type of return of this method, if not return then void
	
	
	int getDance_skills() {
		return danceSkills;
	}

	void move1(int x1, int y1) {
		x_old = x_pos;
		y_old = y_pos;

		x_pos = x_pos + x1;
		y_pos = y_pos + y1;
		loseEnergy1(x1,y1);
	}
	
	void loseEnergy1(int x, int y) {
		
		energy = energy - x - y ;

	}

	int getLooks() {
		return looksSkills;
	}
	
	void currentScore() {
		hs = energy + looks + danceSkills;
	}
	
}	


