
public class Foe extends AdventureCard implements Attack {

	
	int atk;
	int atk2;
	
	public Foe(String name, int atk) {
		super(name);
		this.atk = atk;
		this.atk2 = 0;
	}
	
	public Foe(String name, int atk, int atk2) {
		this(name, atk);
		this.atk2 = atk2;
	}

	@Override
	public int getAttack(String context) {
		// TODO Auto-generated method stub
		return 0;
	}

}
