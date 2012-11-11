
/**
 *
 * @author Matthias
 */
public abstract class Scalable implements Pict {
    //IV: width>0;height>0

    private double width;
    private double height;

    //VB:width>0;height>0
    //NB:this.width>0;this.height>0
    public Scalable(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //VB: 0.1 <= factor <= 10.0;
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    //NB: return width
    public double getWitdh() {
        return width;
    }

    //NB: return height
    public double getHeight() {
        return height;
    }
}
