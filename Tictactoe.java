package tictactoe;

public class Tictactoe extends Main {
    
         Canvas canvas = new Canvas();
         Number number = Number.getInstance();
         GameOver gameover = new GameOver();
         Draw draw = new Draw();
         Parameters p = new Parameters();
         
        Tictactoe() {
        do {
            p.invert(p.getIsCurrentX());
            canvas.drawCanvas();
            if(p.getIsCurrentX())
                System.out.println("mark " + "X");
            else System.out.println("mark " + "O");
            int n = number.getNumber();
            if(p.getIsCurrentX())
                canvas.canvas[n]=1;
            else canvas.canvas[n]=2;
            p.setB(!gameover.isGameOver(n));
            if (draw.isDraw()){
                System.out.println("Draw");
            }
        } while (p.getB());
        canvas.drawCanvas();
        System.out.println();

        System.out.println("The winner is " + (p.getIsCurrentX() ? "X" : "O") + "!");
    }
}