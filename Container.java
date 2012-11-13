/**
 *
 * @author Matthias
 */
public abstract class Container<P> implements Pict{

    protected P[][] container;
    
    public Container(P[][] container){
        this.container=container;
    }
    protected int getWidth(){
        return container.length;
    }

    protected int getHeight(){
        return container[0].length;
    }

    protected P getBox(int x, int y){
        return container[x][y];
    }

    protected void setBox(int x, int y,P box){
        container[x][y]=box;
    }

}