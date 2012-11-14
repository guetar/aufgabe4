/**
 *
 * @author guetar
 */
public class Scaled<P extends Pict> extends Container<P> {
    
    public Scaled(P[][] container) {
        super(container);
        initMaxSize();
    }
    
    @Override
    public void scale(double factor) {
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                P box = getBox(j, i);
                box.scale(factor);
            }
        }
        initMaxSize();
    }
    
    @Override
    public String toString() {
        String output = "";
        String delimiter = System.getProperty("line.separator");
        
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getMaxHeight(); j++) {
                for(int k = 0; k < getWidth(); k++) {
                    P box = (P) getBox(k, i);
                    String[] boxOut = box.toString().split(delimiter);
                    
                    int diff = getMaxWidth();
                    
                    if(boxOut.length > j) {
                        output += boxOut[j];
                        diff = getMaxWidth() - boxOut[j].length();
                    }

                    for(int l = 0; l < diff; l++) {
                        output += " ";
                    }
                }
                output += "\n";
            }
        }
        return output;
    }
}
