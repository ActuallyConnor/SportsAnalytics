package Event;

public class Simulation {
	public static void main(String[] args) {
		Season season = new Season();
		System.out.println(season.deductBets());
		System.out.println(season.applyWinnings());
		// current output: not good
		// -58574.0 -58574.0 -58574.0 -58574.0
		// -23753.0 -23753.0 -23753.0 -23753.0
		
		// perBracket() does not work either
	}
}
