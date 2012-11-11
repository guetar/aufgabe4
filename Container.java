
/**
 *
 * @author Matthias
 */
public abstract class Container<P> implements Pict{
    
    protected P[][] container;
    private double scalefactor;
    
    public Container(P[][] container, double scalefactor){
        this.container=container;
        this.scalefactor=scalefactor;
    }
    
}
