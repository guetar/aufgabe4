/**
 *
 * @author guetar
 */
public class Scaled<P extends Pict> extends Container {
       
    public Scaled(P[][] container, double scalefactor) {
        super(container);
    }

    @Override
    public void scale(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}