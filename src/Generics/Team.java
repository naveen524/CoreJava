package Generics;

public class Team {
	 private String name;
	    private int numberOfMatchesPlayed;
	    private List<Player> players = new ArrayList<>();

	    public Team(String name, int numberOfMatchesPlayed) {
	        this.name = name;
	        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
	        this.players = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public int getNumberOfMatchesPlayed() {
	        return numberOfMatchesPlayed;
	    }

	    public boolean addPlayer(Player player){
	        if(!players.contains(player)){
	            this.players.add(player);
	            return true;
	        }

	        return false;
	    }
}
