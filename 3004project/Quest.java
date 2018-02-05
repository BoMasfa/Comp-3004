
public class Quest extends StoryCard {
	
	int stages;
	String context;
	
	public Quest(String name, int stages) {
		super(name);
	}
		
	public Quest(String name, int stages, String context) {
		this(name, stages);
		this.context = context;
	}
}
