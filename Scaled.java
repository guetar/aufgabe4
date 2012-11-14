/**
 *
 * @author guetar
 */
public class Scaled<P extends Pict> extends Container {
    
    public Scaled(P[][] container) {
        super(container);
    }
    
    @Override
    // VB: factor > 0
    // NB: factor an alle P weitergegeben
    public void scale(double factor) {
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                P box = (P) getBox(j, i);
                box.scale(factor);
            }
        }
        initMaxSize();
    }
    
    @Override
    //VB: P[][] boxes != null
    //NB: String-Feld aller EinzelStrings
    public String toString() {
        P[][] boxes = (P[][]) getBoxes();
        int countX = getWidth();
        int countY = getHeight();
        String[][][] boxLines = new String[countX][countY][];
        
        for(int x = 0; x < countX; x++) {
            for(int y = 0; y < countY; y++) {
                boxLines[x][y] = boxes[x][y].toString().split("\n");
            }
        }
        
        String output = "";
        for (int y = 0; y < countY; y++) {
            
            for(int line = 0; line < getMaxHeight(); line++) {
                
                for (int x = 0; x < countX; x++) {
                    
                    String s = "";                

                    if(line < boxLines[x][y].length) {
                        s = boxLines[x][y][line];

                        if(s.length() < getMaxWidth()) {
                            int j = getMaxWidth()- s.length();
                            for(int i = 0; i < j; i++) {
                                s += " ";
                            }
                        }
                    }
                    else {
                        for(int i = 0; i < getMaxWidth(); i++) {
                            s += " ";
                        }
                    }
                    output += s;
                }
                output += "\n";
            } 
        }
        return output;
    }
}
