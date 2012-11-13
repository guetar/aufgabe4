/**
 *
 * @author Matthias
 */
public abstract class Scalable implements Pict {
    //IV: width>0;height>0
    private double width;
    private double height;

    //VB: width>0;height>0
    //NB: this.width>0;this.height>0
    public Scalable(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Scalable() {
    }

    //VB: 0.1 <= factor <= 10.0;
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }
    
    //VB: width>0
    protected void setWidth(double width){
        this.width=width;
    }
 
    //VB: height>0
    protected void setHeight(double height){
        this.height=height;
    }    
    
    //NB: return width
    public int getWidth() {
        return (int) Math.ceil(width);
    }

    //NB: return height
    public int getHeight() {
        return (int) Math.ceil(height);
    }
}