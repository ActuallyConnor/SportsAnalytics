package Event;

public class Game {
	public int weekNumber;
	public String home;
	public int homeMoneyline;
	public String away;
	public int awayMoneyline;
	public double amos;
	public double elo;
	public double bing;
	public double fpi;
	public boolean homeWin;
	public Game(int w, String h, int hMl, String a, int aMl, double am, double el, double bi, double fp, boolean hW) {
		weekNumber = w;
		home = h;
		homeMoneyline = hMl;
		away = a;
		awayMoneyline = aMl;
		amos = am;
		elo = el;
		bing = bi;
		fpi = fp;
		homeWin = hW;
	}
	public int getHomeMoneyline() {
		return homeMoneyline;
	}
	public int getAwayMoneyline() {
		return awayMoneyline;
	}
	public double getAmos() {
		return amos;
	}
	public double getElo() {
		return elo;
	}
	public double getBing() {
		return bing;
	}
	public double getFpi() {
		return fpi;
	}
	public boolean getHomeWin() {
		return homeWin;
	}
}
