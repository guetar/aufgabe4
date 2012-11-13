/**
 *
 * @author steff
 */
public class DarkBox extends Scalable implements Pict {
    private char c;
    
    //VB: width und height > 0
    public DarkBox(char c, double width, double height) {
        super(width, height);
        this.c = c;
    }
    
    
    public String toString() {
        String s = "";
        for(int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                s += c;
            }
            s += "\n";
        }
        return s;
    }
    
    
    public String toString(int line) {
        String s = "";
        for (int i = 0; i < getWidth(); i++) {
            s += c;
        }
        return s;
    }
    
    public void setChar(char c) {
        this.c = c;
    }
}
