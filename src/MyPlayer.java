import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    int aA;

    int bB;

    int cC;
    ArrayList<Board> losingBoards = new ArrayList<Board>();
    ArrayList<Board> winningBoards = new ArrayList<Board>();
    ArrayList<Board> AB = new ArrayList<Board>();
    public int row = 0;
    public int column = 0;
    public int cols [];



    public MyPlayer() {

        columns = new int[10];
        listBoards();
      //  reducer(3, 3, 3);
        System.out.println("Spacing");
        //setWinningBoard();

    }

    //add your code to return the row and the column of the chip you want to take.
    //you'll be returning a data type called Point which consists of two integers.
    public Point move(Chip[][] pBoard) {


        gameBoard = pBoard;
        cols = new int[3];

        for(int row =0; row < 3; row++){
            for(int col = 0 ; col < 3; col++){
                if(pBoard[row][col].isAlive == true){
                    cols[col]++;
                }
            }
        }

        row = 1;
        column = 1;



        Point myMove = new Point(row, column);
        return myMove;
    }

    //define board in terms of columns ie. 3-3-3 or 3-3-2
//I needed 3 different variables, so I needed 3 dif loops. I can change one variable at a time.
//It matters a lot how it is printed
    public void listBoards() {

        int counter = 0;
   // reducer(3,2,1);

        for (int i = 1; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (x <= i && y <= i) {
                        if (y > x) {
                            continue;
                        }
                        System.out.println("Board: " + i + "-" + x + "-" + y);
                        reducer(i, x, y);
                        AB.add(new Board(i, x, y, row, column));
                        System.out.println("      ");

                        counter++;
                    }

//
                }
            }

        }
        System.out.println("Losing boards:" + losingBoards);
        System.out.println("Winning Boards:" + winningBoards);

        System.out.println(counter);


    }


    public void reducer(int a, int b, int c) {
       // int row= 0;
       // int column = 0;
        boolean win = false;
        for (int i = c-1; i >= 0; i--) {
            column=3;
            row=i;
           aA=a;
           cC = i;
           System.out.println(aA + "-" + b + "-" + cC);
           for(int j=0; j < losingBoards.size(); j++){

               if(losingBoards.get(j).x == aA && losingBoards.get(j).y == b && losingBoards.get(j).z == cC){
                   win = true;
                   System.out.println(losingBoards.size());
                   System.out.println("%%%"+column + row);
                }

           }
        }
        for (int j = b-1; j >= 0; j--) {
            column=2;
            row=j;
            bB = j;
            cC = c - 1;
            if (cC >= bB) {

                System.out.println(a + "-" + bB + "-" + bB);
                for(int l=0; l < losingBoards.size(); l++){
                    if(losingBoards.get(l).x == a && losingBoards.get(l).y == bB && losingBoards.get(l).z == bB){
                        win = true;
                        System.out.println(losingBoards.size());
                        System.out.println("%%%"+column + row);

                    }

                }


            } else {
                System.out.println(a + "-" + bB + "-" + c);
                for(int m=0; m < losingBoards.size(); m++){
                    if(losingBoards.get(m).x == a && losingBoards.get(m).y == bB && losingBoards.get(m).z == c){
                        win = true;
                        System.out.println(losingBoards.size());
                        System.out.println("%%%"+column + row);
                    }

                }

            }
        }

        for (int k = a-1; k >0; k--) {
          column=1;
          row=k;
          aA=k;
            if(b>=aA){
                if(aA<c){
                    System.out.println("*"+aA+"-"+aA+"-"+aA);
                       for(int n=0; n < losingBoards.size(); n++){
                        if(losingBoards.get(n).x == aA && losingBoards.get(n).y == b && losingBoards.get(n).z == c){
                            win = true;
                            System.out.println("%%%"+column + row);
                            }

                    }
                }else{
                    System.out.println("#"+aA+"-"+aA+"-"+c);
                    for(int j=0; j < losingBoards.size(); j++){
                        if(losingBoards.get(j).x == aA && losingBoards.get(j).y == aA && losingBoards.get(j).z == c){
                            win = true;
                            System.out.println("%%%"+column + row);
                        }

                    }
                 }


                }else{
                System.out.println("&"+aA+"-"+b+"-"+c);
                for(int j=0; j < losingBoards.size(); j++){
                    if(losingBoards.get(j).x == aA && losingBoards.get(j).y == b && losingBoards.get(j).z == c){
                        win = true;
                        System.out.println(losingBoards.size());
                        System.out.println("%%%"+column + row);
                        }

                    }
                }

            }
        if(win == true){
            System.out.println("Winning Board");
            winningBoards.add(new Board(a, b, c));
        }else{
            System.out.println("Losing Board");
            losingBoards.add(new Board(a, b, c));
        }


        }






//




}







   //winning boards are ones in which after 1 move it is a guaranteed win
//    public void setWinningBoard() {
//       ArrayList<Board> winningBoard = new ArrayList<Board>();
//       winningBoard.add(new Board(1, 0, 0));
//   }
   //create a loosing board class
    // create some things to store the reducer values after every print



//Things to do:
//1. fix reducer--it's adding a -1 where it should be just a 0 or no board at all
//2. method to see if a reduction has a 1-0-0, if so, label that board a winning board and add it to an array. Something about a board.contains?
//3. coordinates! the x-coordinates come from the a,b,c for-loops in the reducer. x=1 is from a. x=2 is from b. x=3 is from c.
//the y coordinate comes for like how many reductions already occured--this I need to think about more.

