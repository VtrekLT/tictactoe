
package game;

public class Canvas {
     static int [] canvas = {0,0,0,
                             0,0,0,
                             0,0,0};

        public void drawCanvas(){
        System.out.println("     |     |     ");
        for (int i = 0; i < canvas.length; i++) {
            if (i!=0){
                if (i%3==0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                }
                else
                    System.out.print("|");
            }

            if (canvas[i]==0) System.out.print("  " + i + "  ");
            if (canvas[i]==1) System.out.print("  X  ");
            if (canvas[i]==2) System.out.print("  O  ");
        }
        System.out.println();
        System.out.println("     |     |     ");
    }
}
