/**
 *
 * @author steff
 */
public class DarkBox extends Scalable implements Pict {
    private char c;
    
    //VB: width >0; height > 0
    public DarkBox(char c, double width, double height) {
        super(width, height);
        this.c = c;
    }
    
    
    public String toString() {
        int width = getWidth();
        int height = getHeight();
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
    
    public void setChar(char c) {
        this.c = c;
    }
}
