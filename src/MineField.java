import java.util.Scanner;
public class MineField {
    Cell[][] mineField;
    int mineFieldSize;
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
                for(char c:symbols){
                    mineField[rowIndex][columnIndex]=new Cell(rowIndex,columnIndex,String.valueOf(c));
                }
        }
    }
}
