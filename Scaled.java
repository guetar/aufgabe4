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
        
//        for(int j = 0; j < getHeight() * getMaxHeight(); j++) {
//            for(int i = 0; i < getWidth(); i++) {
//                
//                P box = (P) getBox(i, j / getMaxHeight());
//                String[] boxOut = box.toString().split(delimiter);
//                System.out.println("j = " + j);
//                System.out.println("getHeight() = " + getHeight());
//                System.out.println("j%getHeight() = " + j%getHeight());
//                output += boxOut[j%getHeight()];
//                int diff = getMaxWidth() - boxOut[j%getHeight()].length();
//
//                for(int l = 0; l < diff; l++) {
//                    output += " ";
//                }
//            }
//            output += "\n";
//        }
        
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getMaxHeight(); j++) {
                for(int k = 0; k < getWidth(); k++) {
                    
                    P box = (P) getBox(i, k);
                    String[] boxOut = box.toString().split(delimiter);
                    
                    int diff = getMaxWidth();
                    
                    if(boxOut.length >= j) {
                        diff = getMaxWidth() - boxOut[j].length();
                    }

                    for(int l = 0; l < diff; l++) {
                        output += " ";
                    }
                }
                output += "\n";
            }
        }
        System.out.println("output = " + output);
        return output;
    }
}
