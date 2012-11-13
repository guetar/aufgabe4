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
        int width = getWidth();
        int height = getHeight();
        String output = "";
        
        if (width < 2)  { width = 2; }
        if (height < 2) { height = 2; }
        
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(i == 0 || j == 0 || i == height-1 || j == width-1){
                    output += outer;
                } else {
                    output += inner;
                }
            }
            output += "\n";
        }
        return output;
    }
}