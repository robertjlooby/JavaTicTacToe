import java.io.InputStreamReader;
import java.io.PrintWriter;

public class HumanVsHumanConsoleGame {
    public static void main(String[] args) {
        ConsoleIO playerIO = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        Player player0 = new HumanPlayer("X", playerIO);
        Player player1 = new HumanPlayer("O", playerIO);
        Game game = new Game(new Player[]{player0, player1}, new TicTacToeBoard(), new BoardConsoleIO(new PrintWriter(System.out)));
        int winner = game.play();
        if(winner == 3){
            System.out.println("It was a tie.");
        } else {
            System.out.println("Player " + winner + " won!");
        }
    }
}
