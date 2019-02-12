package tictactoe;

public class Draw extends Canvas {
        public boolean isDraw() {
        for (int n : canvas) if (n==0) return false;
        return true;
    }
}
