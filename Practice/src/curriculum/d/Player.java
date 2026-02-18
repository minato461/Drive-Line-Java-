package curriculum.d;

import java.util.Random;
public class Player extends Character {
	public Player(String name, Random rand) {
		super(name, 
				rand.nextInt(51) + 50, 
				rand.nextInt(11) + 10, 
				rand.nextInt(10) + 1);	
	}

}
