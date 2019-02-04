
package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number extends Canvas{

    
        public int getNumber(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n < canvas.length && canvas[n]==0){
                    return n;
                }
                System.out.println("Choose free cell and enter its number");
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number");
            } catch (IOException e) {
            }
        }
    }

}
