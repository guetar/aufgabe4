/**
 *
 * @author guetar
 */
public class FreeBox extends Scalable {
    
    private char[][] input;
    //VB: input!=NULL;width>0;height>0
    //    Alle Zeilen gleich lang
    //NB: this.input=char[inputWidth][inputHeight];this.width>0;this.height>0
    public FreeBox(String input) {
        super();
        
        String delimiter = System.getProperty("line.separator");
        String[] inputLines = input.split(delimiter);
        
        setWidth(inputLines[0].length());
        setHeight(inputLines.length);
        
        this.input = new char[getWidth()][getHeight()];
        
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                this.input[j][i] = inputLines[i].charAt(j);
            }
        }
    }
    
    @Override
    //NB: output=rect
    public String toString() {
        String output = "";
        int w = input.length;
        int h = input[0].length;
        
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                output += input[j%w][i%h];
            }
            output += "\n";
        }
        return output;
    }
}
