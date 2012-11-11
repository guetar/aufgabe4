/**
 *
 * @author guetar
 */
public class FreeBox extends Scalable {
    
    private char[][] input;
    
    public FreeBox(String input, int width, int height) {
        super(width, height);
        
        String n = System.getProperty("line.separator");
        String[] inputLines = input.split(n);
        
        setWidth(inputLines[0].length());
        setHeight(inputLines.length);
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                this.input[i][j] = inputLines[j].charAt(i);
            }
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        int w = input.length;
        int h = input[0].length;
        
        for(int i = 0; i < getWidth(); i++) {
            for(int j = 0; j < getHeight(); j++) {
                output += input[i%w][j%h];
                if(i == getWidth()) {
                    output += "\n";
                }
            }
        }
        return output;
    }
}