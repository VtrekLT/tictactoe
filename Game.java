
package game;

public class Game {

    public static void main(String[] args){
        Canvas canvas = new Canvas();
        Number number = new Number();
        GameOver gameover = new GameOver();
        Draw draw = new Draw();
        boolean b;
        boolean isCurrentX = false;
        do {
            isCurrentX = !isCurrentX;
            canvas.drawCanvas();
            System.out.println("mark " + (isCurrentX ? "X" : "O"));
            int n = number.getNumber();
            canvas.canvas[n] = isCurrentX ? 1 : 2;
            b = !gameover.isGameOver(n);
            if (draw.isDraw()){
                System.out.println("Draw");
                return;
            }
        } while (b);
        canvas.drawCanvas();
        System.out.println();

        System.out.println("The winner is " + (isCurrentX ? "X" : "O") + "!");
    }
    
}



