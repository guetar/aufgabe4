/**
 *
 * @author steff
 */
public class Box extends Printable implements Pict{
    
    //VB: outer darf kein Leerzeichen sein
    public Box(char outer, char inner, double width, double height) {
       super(outer, inner, width, height);
       if (outer == ' ') { setOuter('#'); }
    }
}
