package TestingMethods;

public class CalcScore {

	public static void main(String[] args) {
		
		int highscorePosition=calculateHighScorePosition(900);
    
                  displayHighScorePosition("Nick ",highscorePosition);
	}
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName +" Managed to get into position "+highScorePosition+" on the high score table");
	}
	public static int  calculateHighScorePosition(int playerscore) {
		
		if(playerscore>=1000) {
			return 1;
			
		}else if(playerscore>=500 && playerscore<1000) {
			return 2;
		}else if(playerscore>=100 && playerscore<500) {
			return 3;
		}else {
			return 4;
		}
	}

}
