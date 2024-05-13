public class ChessApp {

  private String[][] pieces;
  private String[][] board;

  public ChessApp(String[][] pieces) {
    this.pieces = pieces;
  }

  public void startGame(){
    printBoard();
    arrangeBoard();
  }

  public void printBoard(){
    for(int i = 0; i<pieces.length;i++){
      System.out.print(i+1 + "  ");
      for(int j = 0; j<pieces[i].length;j++) {
        System.out.print("[" + pieces[i][j] + "] ");
      }
      System.out.println("\n");
    }
    System.out.println("    A   B   C   D   E   F   G   H");
  }

  public void arrangeBoard(){
    
  }

  
}