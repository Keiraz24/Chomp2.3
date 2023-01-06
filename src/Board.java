public class Board {
    int x;
    int y;
    int z;
    int row;
    int col;

    Board(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Board(int x, int y, int z, int rw, int col){
        this.x = x;
        this.y = y;
        this.z = z;
        this.row = rw;
        this.col = col;
    }

    @Override
    public String toString(){
        return (this.x + "-" + this.y + "-" + this.z);
    }
}


