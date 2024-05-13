public class Main {
  public static void main(String[] args) {

    
    String pieces[][] = { {"R","K","B","Q","K","B","H","R"},
                        {"P","P","P","P","P","P","P","P"},
                        {"_","_","_","_","_","_","_","_"},
                        {"_","_","_","_","_","_","_","_"},
                        {"_","_","_","_","_","_","_","_"},
                        {"_","_","_","_","_","_","_","_"},
                        {"P","P","P","P","P","P","P","P"},
                        {"R","K","B","Q","K","B","H","R"},};

    ChessApp game = new ChessApp(pieces);


    game.startGame();

    
  }

  
}