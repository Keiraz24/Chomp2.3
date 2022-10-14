import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    int aA;

    int bB;

    int cC;


    public MyPlayer() {

        columns = new int[10];
        listBoards();
        reducer(2, 2, 2);

    }

    //add your code to return the row and the column of the chip you want to take.
    //you'll be returning a data type called Point which consists of two integers.
    public Point move(Chip[][] pBoard) {


        gameBoard = pBoard;
        int column = 0;
        int row = 0;
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

        for (int i = 1; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (x <= i && y <= i) {
                        if (y > x) {
                            continue;
                        }
                        System.out.println("Board: " + i + "-" + x + "-" + y);

                        counter++;
                    }

//
                }
            }

        }
        System.out.println(counter);

    }


    public void reducer(int a, int b, int c) {
        //if wanting to reference the method parameters in for loop, set parameter to a new variable just for the loop
//        for (int i = c - 1; i >= 0; i--) {
//            for(int j=b-1; b>=0; b--) {
//                if(j>=i){
//                    i=j;
//                        System.out.println(a + "-" + j + "-" + i);
//                }
//                }
//            }
        for (int k = a; k >=2; k--) {
            aA = k-1;
            bB=b;
            cC=c;
            if(bB>aA){
                System.out.println(aA + "-" + aA + "-" + aA);

            }else{
                System.out.println(aA + "-" + bB + "-" + cC);}
        }

        System.out.println("oerijv;awoeigjv'WP");

        for (int j = b; j >= 0; j--) {
//            System.out.println("AAAA");
            bB = j;
            cC = c-1;
            if (cC > bB) {

                System.out.println(a + "-" + bB + "-" + bB);

            } else{
                System.out.println(a + "-" + bB + "-" + cC);
            }


        }

        System.out.println("oerijv;awoeigjv'WP");

        for (int i = c-2; i >= 0; i--) {
            aA=a;
            cC = i;
            System.out.println(aA + "-" + b + "-" + cC);
        }

//


    }
}
//new code to print out the possible 3x3 boards

    //possible first moves for each board

