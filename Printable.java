/**
 *
 * @author guetar
 */
public abstract class Printable extends Scalable implements Pict {
    
    private char outer;
    private char inner;
    
    //VB: outer!=NULL;inner!=NULL;width>0;height>0
    //NB: this.outer!=NULL;this.inner!=NULL
    public Printable(char outer, char inner, double width, double height) {
        super(width, height);
        this.outer = outer;
        this.inner = inner;
    }
    
    //VB: outer!=NULL
    public void setOuter(char outer) {
        this.outer = outer;
    }
    
    //VB: inner!=NULL
    public void setInner(char inner) {
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
    
    //NB: output=1Line
    public String toString(int line) {
        String output = "";
        int width = (int) Math.round(getWidth());
        
        if(line == 0 || line == (int) Math.round(getHeight())) {
            for(int i = 0; i < width; i++) {
                output += outer;
            }
        } else {
            for(int j = 0; j < width; j++) {
                if(j == 0 || j == width) {
                    output += outer;
                } else {
                    output += inner;
                }
            }
        }
        return output;
    }   
}
