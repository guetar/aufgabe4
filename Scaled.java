/**
 *
 * @author guetar
 */
public class Scaled<P> extends Container {
    
    public Scaled(P[][] container, double scalefactor) {
        super(container, scalefactor);
    }

    @Override
    public void scale(double factor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}