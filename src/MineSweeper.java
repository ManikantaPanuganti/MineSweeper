public class MineSweeper {
    MineField mineField;
    Player player;
    MineSweeper(){
        mineField=new MineField();
        player=new Player("Motu");
    }
    boolean isGameOver(){
        if(mineField.isMineRevealed){
            System.out.println("Mine opened Game is Over");
            return true;
        }
        else if(mineField.isAllMinesFlagged()){
            System.out.println("you are the winner ");
            return true;
        }
        return false;
    }
    void startMining(){
        String selectedCell;
        boolean isOperated;
        while(!isGameOver()){
            mineField.displayMineField();
            selectedCell=player.selectCell();
            isOperated=mineField.operateCell(selectedCell);

        }
    }
}
