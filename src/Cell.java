public class Cell {
    int x_Coordinate;
    int y_Coordinate;

    public Cell(int x_Coordinate, int y_Coordinate) {
        this.x_Coordinate = x_Coordinate;
        this.y_Coordinate = y_Coordinate;
    }
    boolean equals(Cell cell){
        if(cell.x_Coordinate==x_Coordinate && cell.y_Coordinate==y_Coordinate){
            return true;
        }
        return false;
    }
}
