package Event;

public class Team {
	public String name;
	public int winCount = 0;
	public int lossCount = 0;
	public int totalCount = 0;
	public Team(String n, String a) {
		name = n;
	}
	public void addWin() {
		winCount++;
	}
	public void addLoss() {
		lossCount++;
	}
	public void addGame() {
		totalCount++;
	}
}
