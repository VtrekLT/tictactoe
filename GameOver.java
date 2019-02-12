package tictactoe;

public class GameOver extends Canvas {
        static boolean isGameOver(int n) {
        // 0 1 2
        // 3 4 5
        // 6 7 8
        int row = n-n%3;
        if (canvas[row]==canvas[row+1] &&
                canvas[row]==canvas[row+2]) 
            return true;
        int column = n%3; 
        if (canvas[column]==canvas[column+3])
            if (canvas[column]==canvas[column+6]) 
                return true;
        if (n%2!=0) return false;
        if (n%4==0) {
            if (canvas[0] == canvas[4] &&
                    canvas[0] == canvas[8]) 
                return true;
            if (n!=4) return false;
        }
        return canvas[2] == canvas[4] &&
                canvas[2] == canvas[6];
    }
}
