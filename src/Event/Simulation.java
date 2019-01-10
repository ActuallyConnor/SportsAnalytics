package Event;

public class Simulation {
	public static void main(String[] args) {
		Season season = new Season();
		System.out.println(season.deductBets());
		System.out.println(season.applyWinnings());
		System.out.println(season.percBracket());
		//season.testing();
		// current output: not good
		/*
		-58574.0 -58574.0 -58574.0 -58574.0
		-23753.0 -23753.0 -23753.0 -23753.0
		Amos: 
		51-59: 0
		60-69: 0
		70-79: 0
		80-100: 0
		Total: 0
		Elo: 
		51-59: 0
		60-69: 0
		70-79: 0
		80-100: 0
		Total: 0
		Bing: 
		51-59: 0
		60-69: 0
		70-79: 0
		80-100: 0
		Total: 0
		FPI: 
		51-59: 0
		60-69: 0
		70-79: 0
		80-100: 0
		Total: 0
		*/
	}
}
