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
        int width = (int) Math.round(getWidth());
        int height = (int) Math.round(getHeight());
        String output = "";
        
        if (width < 2)  { width = 2; }
        if (height < 2) { height = 2; }
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                output += c;
            }
            output += "\n";
        }
        return output;
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
