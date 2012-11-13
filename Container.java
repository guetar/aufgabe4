
/**
 *
 * @author Matthias
 */
public abstract class Container<P> implements Pict {
    
    //IV: container!=null; container[0]!=null
    protected P[][] container;

    //VB: container!=null; container[0]!=null
    //NB: this.container!=null; this.container[0]!=null
    public Container(P[][] container) {
        this.container = container;
    }

    //NB: return this.container.length
    protected int getWidth() {
        return container.length;
    }

    //NB: return this.container[0].length
    protected int getHeight() {
        return container[0].length;
    }

    //VB: x>=0;y>=0
    //NB: return this.container[x][y]
    protected P getBox(int x, int y) {
        return container[x][y];
    }

    //VB: x>=0;y>=0;box!=null
    //NB: container[x][y]!=null
    protected void setBox(int x, int y, P box) {
        container[x][y] = box;
    }
}
