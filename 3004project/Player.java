


public class Player {
	
	public static enum RANK{
		SQUIRE,
		KNIGHT, 
		CHAMPION_KNIGHT,
		KNIGHT_OF_THE_ROUND_TABLE,
	};
	
	RANK rank;
	int shields;
	String name;
	boolean cpu;
	
	public Player(String name, boolean cpu) {
		this.name = name;
		this.cpu = cpu;
		
		rank = RANK.SQUIRE;
		shields = 0;
	}
	
	public void awardShields(int shields) {
		this.shields += shields;
		
		switch(rank) {
		case SQUIRE:
			if(shields >= 5) {
				rank = RANK.KNIGHT;
				shields -= 5;
			}
			break;
		
		
		case KNIGHT:
			if(shields >= 7) {
				rank = RANK.CHAMPION_KNIGHT;
				shields -= 7;
			}
		break;
		
		case CHAMPION_KNIGHT:
			if(shields >= 10) {
				rank = RANK.CHAMPION_KNIGHT;
				shields -= 10;
			}
			break;
			

		default: break;
		}
		
	}
}
