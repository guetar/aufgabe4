/**
 *
 * @author steff
 */
public class DarkBox extends Scalable implements Pict {
    private char c;
    
    //VB: width und height > 0
    public DarkBox(double width, double height, char c) {
        super(width, height);
        this.c = c;
    }
    
    
    public String toString() {
        String s = "";
        for(int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                s += c;
            }
        }
        return s;
    }
    
    public void setChar(char c) {
        this.c = c;
    }
}
