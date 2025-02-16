import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner in=new Scanner(System.in);
        while(!gameover){
            printboard(board);
            System.out.println("player "+ player+" enter move");
            int row=in.nextInt();
            int col=in.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                gameover=havewon(board,player);
                if(gameover){
                    System.out.println("player" + player+"has won");
                }else {
                    if (player == 'X'){
                    player = '0';}
                    else{
                        player = 'X';
                    }
                }
            }else{
                System.out.println("invalid move! Try again...");
            }

        }
        printboard(board);
    }

    public static boolean havewon(char[][] board, char player) {
         for(int row=0;row< board.length;row++){
             if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                 return true;
             }
         }
        for(int col=0;col< board[0].length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]== player && board[1][1]== player && board[2][2]== player)
            return true;
        if(board[0][2]== player && board[1][1]== player && board[2][0]== player)
            return true;

       return false;
    }

    public static void printboard(char[][] board) {
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print( board[row][col]+ " |");
            }
            System.out.println();
        }
    }
}
