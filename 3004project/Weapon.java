
public class Weapon extends AdventureCard implements Attack {
	
	int atk;
	public Weapon(String name, int atk) {
		super(name);
		this.atk = atk;
	}

	@Override
	public int getAttack(String context) {
		return atk;
	}

}
