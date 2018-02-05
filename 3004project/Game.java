
public class Game {
	
	Deck<AdventureCard> adventureDeck;
	Deck<StoryCard> storyDeck;
	public Game() {
		adventureDeck = new Deck<AdventureCard>();
		storyDeck = new Deck<StoryCard>();
		
		prepFoes();
		prepWeapons();
		adventureDeck.shuffle();
		
		prepEvents();
		prepQuests();
		storyDeck.shuffle();
		
		System.out.println(adventureDeck);
		System.out.println(adventureDeck.size());
		
		System.out.println(storyDeck);
		System.out.println(storyDeck.size());
		
	}
	
	private void prepFoes() {
		int i;
		//Dragon 1
		adventureDeck.addCard(new Foe("Dragon",50,70));
		//Giant 2
		for(i = 0; i < 2; i++) {
			adventureDeck.addCard(new Foe("Giant",40));
		}
		
		//Mordred 4
		for(i = 0; i < 4; i++) {
			adventureDeck.addCard(new Foe("Mordred",30));
		}
		
		//Green Knight 2
		for(i = 0; i < 2; i++) {
			adventureDeck.addCard(new Foe("Green Knight", 25, 40));
		}
		
		
		//Black Knight 3
		for(i = 0; i < 3; i++) {
			adventureDeck.addCard(new Foe("Black Knight", 25, 35));
		}
		
		//Evil Knight 6
		for(i = 0; i < 6; i++) {
			adventureDeck.addCard(new Foe("Evil Knight", 20, 30));
		}
		
		//Saxon Knight 8
		for(i = 0; i < 8; i++) {
			adventureDeck.addCard(new Foe("Saxon Knight", 15, 25));
		}
		
		//Robber Knight 7
		for(i = 0; i < 7; i++) {
			adventureDeck.addCard(new Foe("Robber Knight", 15));
		}
		
		//Saxons 5
		for(i = 0; i < 5; i++) {
			adventureDeck.addCard(new Foe("Saxons", 10, 20));
		}
		
		//Boar 4
		for(i = 0; i < 4; i++) {
			adventureDeck.addCard(new Foe("Boar", 5, 15));
		}
		
		//Thieves 8
		for(i = 0; i < 8; i++) {
			adventureDeck.addCard(new Foe("Thieves", 5));
		}
	}
	
	private void prepWeapons() {
	
		int i;
		//Excalibur 2
		for(i = 0; i < 2; i++) {
			adventureDeck.addCard(new Weapon("Excalibur", 30));
		}
		
		//Lance 6
		for(i = 0; i < 6; i++) {
			adventureDeck.addCard(new Weapon("Lance", 20));
		}

		//Battle-ax 8		
		for(i = 0; i < 8; i++) {
			adventureDeck.addCard(new Weapon("Battle-ax", 15));
		}
		
		//Sword 16
		for(i = 0; i < 16; i++) {
			adventureDeck.addCard(new Weapon("Sword", 10));
		}
		
		//Horse 11
		for(i = 0; i < 11; i++) {
			adventureDeck.addCard(new Weapon("Horse", 10));
		}
		//Dagger 6
		for(i = 0; i < 6; i++) {
			adventureDeck.addCard(new Weapon("Dagger", 5));
		}
	}
	
	private void prepEvents() {
		/* TODO: currently handling 2 events */
		storyDeck.addCard(new Event("Prosperity Throughout the Realm"));
		storyDeck.addCard(new Event("Chivalrous Deed"));
	}
	
	private void prepQuests() {
		storyDeck.addCard(new Quest("Search for the Holy Grail", 5));
		
		storyDeck.addCard(new Quest("Test of the Green Knight", 4));
		
		storyDeck.addCard(new Quest("Search for the Questing Beast", 4));
		
		storyDeck.addCard(new Quest("Defend the Queen's Honor", 4));
		
		storyDeck.addCard(new Quest("Rescue the Fair Maiden", 3));
		
		storyDeck.addCard(new Quest("Journey Through the Enchanted Forest", 3));
		
		storyDeck.addCard(new Quest("Vanquish King Arthur's Enemies", 3));
		storyDeck.addCard(new Quest("Vanquish King Arthur's Enemies", 3));
		
		storyDeck.addCard(new Quest("Slay the Dragon", 3));
		
		storyDeck.addCard(new Quest("Boar Hunt", 2));
		storyDeck.addCard(new Quest("Boar Hunt", 2));
		
		storyDeck.addCard(new Quest("Repel the Saxon Raiders", 2));
		storyDeck.addCard(new Quest("Repel the Saxon Raiders", 2));
		
	}
	
	@SuppressWarnings("unused")
	private void prepTournaments() {
		//TODO: Stub
	}
}
