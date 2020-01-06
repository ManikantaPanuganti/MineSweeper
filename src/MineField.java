import java.util.Scanner;

import static java.lang.Integer.*;

public class MineField {
    Cell[][] mineField;
    int mineFieldSize;
    boolean isMineRevealed=false;
    MineField(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter minefield layout: ");
        String layout=scanner.nextLine();
        String[] layoutArray;
        layoutArray=layout.split(" ");
        mineFieldSize=layoutArray.length;
        createLayout(layoutArray);
    }
    void createLayout(String[] layout){
        mineField=new Cell[mineFieldSize][mineFieldSize];
        setMineFieldLayout(layout);
    }
    void setMineFieldLayout(String[] layout){
        char[] symbols;
        int row=layout.length,column=layout[0].length(),rowIndex=0,columnIndex=0;
        for(String horizontal:layout){
                symbols=horizontal.toCharArray();
                columnIndex=0;
                for(char c:symbols){
                    mineField[rowIndex][columnIndex]=new Cell(rowIndex,columnIndex,String.valueOf(c));
                    columnIndex++;
                }
                rowIndex++;
        }
    }
    void displayMineField(){
        for(int row=0;row<mineFieldSize;row++){
            for(int column=0;column<mineFieldSize;column++){
                System.out.print(mineField[row][column].getContains()+" ");
            }
            System.out.println("");
        }
    }
    boolean operateCell(String playerCell){
        char[] select=playerCell.toCharArray();
        if(select[0]=='o'){
            return openCell(parseInt(String.valueOf(select[2])), parseInt(String.valueOf(select[4])));
        }
        else{
            return flagCell(parseInt(String.valueOf(select[2])), parseInt(String.valueOf(select[4])));
        }
    }
    boolean openCell(int row,int column){
        if(mineField[row][column].getContains().equals("x")){
            mineField[row][column].setContains("O");
            return true;
        }
        else if(mineField[row][column].getContains().equals("m")){
            isMineRevealed=true;
            return true;
        }
        return false;
    }
    //f for a cell which is having a mine and is flagged
    //F for a cell which doesn't have a mine but still flagged

    boolean flagCell(int row,int column){
        if(mineField[row][column].getContains().equals("x")){
            mineField[row][column].setContains("F");
            return true;
        }
        else if(mineField[row][column].getContains().equals("m")){
            mineField[row][column].setContains("f");
            return true;
        }
        return true;


    }
    boolean isAllMinesFlagged(){
        for(int i=0;i<mineFieldSize;i++){
            for(int j=0;j<mineFieldSize;j++){
                if(mineField[i][j].getContains().equals("m")){
                    return false;
                }
            }
        }
        return true;
    }
}
