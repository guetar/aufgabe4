/**
 *
 * @author guetar
 */
public abstract class Printable extends Scalable implements Pict {
    
    private char outer;
    private char inner;
    
    public Printable(char outer, char inner, double width, double height) {
        super(width, height);
        this.outer = outer;
        this.inner = inner;
    }
    
    @Override
    //NB: output=rect
    public String toString() {
        int width = (int) Math.round(getWidth());
        int height = (int) Math.round(getHeight());
        String output = "";
        
        for(int i = 1; i < width; i++){
            for(int j = 1; j < height; j++){
                if(i == 0 || j == 0 || i == width || j == height){
                    output += outer;
                } else {
                    output += inner;
                }
                if(i == width) {
                    output += "\n";
                }
            }
        }
        return output;
    } 
    
    public void setOuter(char outer){
        this.outer = outer;
    }
}
