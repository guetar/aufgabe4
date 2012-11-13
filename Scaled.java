/**
 *
 * @author guetar
 */
public class Scaled<P extends Pict> extends Container {
    
    public Scaled(P[][] container) {
        super(container);
    }
    
    @Override
    public void scale(double factor) {
        
    }
    
    @Override
    public String toString() {
        String output = "";
        String delimiter = System.getProperty("line.separator");
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                
                P box = (P) getBox(i, j);
                String[] boxOut = box.toString().split(delimiter);
                
                for(int k = 0; k < getMaxHeight(); k++) {
                    output += boxOut[k];

                    int diff = getMaxWidth() - boxOut[k].length();
                    for(int l = 0; l < diff; l++) {
                        output += " ";
                    }
                    output += "\n";
                }
            }
        }
        System.out.println("output = " + output);
        return output;
    }
}
