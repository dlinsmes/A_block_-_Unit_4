import java.util.Scanner;
public class C4 {

    //these variables are accessible to all methods
    //in the class, and if you make a change to one,
    //the changes will be seen in the other methods
    public static int [][] board;
    public static Scanner s = new Scanner(System.in);

    //you can add more class variables if you want

    public static void main(String [] args) {

        //setup board
        //print board
        //loop until win or tie:
        //turn: ask for the move, validate move
        //place piece
        //print board
        //check for a win
        //switch to other player
    }

    //feel free to add/change return types or parameters

    public static void setupBoard() {}
    public static int getMove() { return -1;}
    public static boolean isValidMove() { return false;}
    public static void placePiece() {}
    public static boolean checkWin() { return false;}
    public static void printBoard() {}


}
