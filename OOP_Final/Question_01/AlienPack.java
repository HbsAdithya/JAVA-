
public class AlienPack {
	private Alien alien[];

	public AlienPack(int numOfAlien) {
		super();
		
	}
	public void AddAlien(Alien Alien, int index) {
		this.alien[index]=Alien;
		
	}
	
	public Alien[] getAlien() {
		
		return alien;
	}

}
