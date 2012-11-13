/**
 *
 * @author steff
 */
public class Test {

    public static void main(String[] args) {
    
        Box boxA = new Box('#', '_', 3, 4);
        Box boxB = new Box('X', 'o', 3, 2);
        DarkBox darkBoxA = new DarkBox('d', 5, 3);
        ClearBox clearBoxA = new ClearBox(4, 4);
        ClearBox clearBoxB = new ClearBox(2,2);
        //FreeBox freeBoxA = new FreeBox("abc\ndef", 3, 2);
        
        System.out.println(boxA);
        System.out.println(boxB);
        System.out.println(darkBoxA);
        System.out.println(clearBoxA);
        System.out.println(clearBoxB);
        //System.out.println(freeBoxA);
    }
}
