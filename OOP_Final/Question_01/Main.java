
public class Main {

	public static void main(String[] args) {
		AlienPack pack1= new AlienPack(5);
		pack1.AddAlien(new MarshmalloAlien(),0);
		pack1.AddAlien(new OgreAlien(), 1);
		pack1.AddAlien(new OgreAlien(), 2);
		pack1.AddAlien(new OgreAlien(), 1);
		pack1.AddAlien(new SnakeAlien(), 3);
		pack1.AddAlien(new MarshmalloAlien(), 4);
		
		MenInBlack AgentK= new MenInBlack(pack1);
		AgentK.kill();
		System.out.println("Your score is " + AgentK.getScore());
	}

}
