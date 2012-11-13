/**
 *
 * @author guetar
 */
public class Repeated<P> extends Container {
    
    double factor;
    
    public Repeated(P[][] container, double factor) {
        super(container);
        this.factor = factor;
    }

    @Override
    public void scale(double factor) {
        this.factor = factor;
    }
    
    @Override
    public String toString() {
        return "blah";
    }
}