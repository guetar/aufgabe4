/**
 *
 * @author Matthias
 */
public class ClearBox extends Printable{
    
    //VB: width>0; height>0
    public ClearBox(double width, double height){
        super('*',' ',width,height);   
    }
    
    //NB: return width/height 
    public double getAspectRatio(){
        return getWidth()/getHeight();
    }
}
