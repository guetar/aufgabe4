/**
 *
 * @author Matthias
 */
public abstract class Container<P> implements Pict {
    
    //IV: container!=null; container[0]!=null
    private P[][] container;
    private int maxWidth;
    private int maxHeight;

    //VB: container!=null; container[0]!=null
    //NB: this.container!=null; this.container[0]!=null
    public Container(P[][] container) {
        this.container = container;
        initMaxSize();
    }

    public void initMaxSize() {
        maxWidth = 0;
        maxHeight = 0;
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                
                Scalable box = (Scalable) getBox(i, j);
                if(box.getWidth() > maxWidth) maxWidth = box.getWidth();
                if(box.getHeight() > maxHeight) maxHeight = box.getHeight();
            }
        }
    }

    //NB: return this.container.length
    protected int getWidth() {
        return container.length;
    }

    //NB: return this.container[0].length
    protected int getHeight() {
        return container[0].length;
    }
    
    protected int getMaxWidth() {
        return maxWidth;
    }
    
    protected int getMaxHeight() {
        return maxHeight;
    }
    
    protected void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    protected void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
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
