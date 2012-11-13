/**
 *
 * @author guetar
 */
public class Scaled<P extends Pict> extends Container {
    
    private double maxWidth;
    private double maxHeight;
    
    public Scaled(P[][] container) {
        super(container);
        scale(1.0);
    }

    @Override
    public void scale(double factor) {
        maxWidth = 0;
        maxHeight = 0;
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                
                Scalable box = (Scalable) getBox(i, j);
                box.scale(factor);
                
                if(box.getWidth() > maxWidth) maxWidth = box.getWidth();
                if(box.getHeight() > maxHeight) maxHeight = box.getHeight();
            }
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        String delimiter = System.getProperty("line.separator");
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                
                P box = (P) getBox(i, j);
                String[] boxOut = box.toString().split(delimiter);
                
                for(int k = 0; k < maxHeight; k++) {
                    output += boxOut[k];

                    int diff = (int) Math.round(maxWidth) - boxOut[k].length();
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
