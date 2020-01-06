public class Cell {
    int x_Coordinate;
    int y_Coordinate;
    String contains;

    public Cell(int x_Coordinate, int y_Coordinate,String contains) {
        this.x_Coordinate = x_Coordinate;
        this.y_Coordinate = y_Coordinate;
        this.contains=contains;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
}
