package tictactoe;

public class Parameters {
    
         private boolean b;
         private boolean isCurrentX = false;

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean getIsCurrentX() {
        return isCurrentX;
    }

    public void setIsCurrentX(boolean isCurrentX) {
        this.isCurrentX = isCurrentX;
    }
    public void invert(boolean isCurrentX) {
        this.isCurrentX = !isCurrentX;
    }


         
         
}
