/**
 *
 * @author steff
 */
public class Test {

    public static void main(String[] args) {
        
        /**
         * Typstrukturen und Vererbungen:
         * 
         * Scalable (implements Pict)
         * |
         * +------------+---------------+
         * |            |               |
         * Printable    DarkBox         FreeBox
         * |
         * +------------+
         * |            |
         * Box          ClearBox
         * 
         * 
         * Container (implements Pict)
         * |
         * +------------+
         * |            |
         * Repeated<P>  Scaled<P extends Pict>
         */
        
        System.out.println("Box:");
        Box boxA = new Box('#', '_', 2.4, 3.2);
        System.out.println(boxA);
        boxA.scale(2);
        System.out.println("Box x2\n"+boxA);
        boxA.scale(0.01);
        System.out.println("Box x0.01\n"+boxA);  
        
        System.out.println("DarkBox:");
        DarkBox darkBoxA = new DarkBox('d', 5, 3.1);
        System.out.println(darkBoxA);
        darkBoxA.scale(3);
        System.out.println("DarkBox x3\n"+darkBoxA);
        darkBoxA.scale(0.001);
        System.out.println("DarkBox x0.001\n"+darkBoxA);
        
        System.out.println("ClearBox:");
        ClearBox clearBoxA = new ClearBox(4.1, 4);
        System.out.println(clearBoxA);
        clearBoxA.scale(3);
        System.out.println("ClearBox x3\n"+clearBoxA);
        clearBoxA.scale(0.001);
        System.out.println("ClearBox x0.001\n"+clearBoxA);
        clearBoxA.scale(1000);
        System.out.println("ClearBox x1000\n"+clearBoxA);
        
        System.out.println("FreeBox:");
        FreeBox freeBoxA = new FreeBox("abc\ndef\nghi\njkl");
        System.out.println(freeBoxA);
        freeBoxA.scale(1.5);
        System.out.println("FreeBox x1.5\n"+freeBoxA);
        freeBoxA.scale(0.3);
        System.out.println("FreeBox x0.3\n"+freeBoxA);
        freeBoxA.scale(10);
        System.out.println("FreeBox x10\n"+freeBoxA);
        
        System.out.println("\nRepeated:");
        Scalable[][] repeatedArray = new Scalable[3][2];
        repeatedArray[0][0]=new Box('x', 'o', 5, 5);
        repeatedArray[1][0]=new DarkBox('m', 3, 3);       
        repeatedArray[2][0]=new ClearBox(4, 7);
        repeatedArray[0][1]=new FreeBox("abc\ndef");
        repeatedArray[1][1]=new Box('C', '.', 5, 5);
        repeatedArray[2][1]=new Box('E', 'O', 3, 7); 
        Repeated<Scalable> myRepeated=new Repeated<Scalable>(repeatedArray,1.0);
        System.out.println(myRepeated);   
        
        System.out.println("\nRepeated x1.4:");
        myRepeated.scale(1.4);
        System.out.println(myRepeated);
        
        System.out.println("\nRepeated x2:");
        myRepeated.scale(2);
        System.out.println(myRepeated);
        
        System.out.println("\nRepeated x0.1:");
        myRepeated.scale(0.1);
        System.out.println(myRepeated);
        
        System.out.println("\nScaled:");
        Scalable[][] scaledArray = new Scalable[3][2];
        scaledArray[0][0]=new Box('x', 'o', 5, 5);
        scaledArray[1][0]=new DarkBox('m', 3, 3);       
        scaledArray[2][0]=new ClearBox(4, 7);
        scaledArray[0][1]=new FreeBox("abc\ndef");
        scaledArray[1][1]=new Box('C', '.', 5, 5);
        scaledArray[2][1]=new Box('E', 'O', 3, 7);
        Scaled<Scalable> myScaled = new Scaled<Scalable>(scaledArray);
        System.out.println(myScaled);   
        
        System.out.println("\nScaled x1.5:");
        myScaled.scale(1.5);
        System.out.println(myScaled);
        
        System.out.println("\nScaled x2:");
        myScaled.scale(2);
        System.out.println(myScaled);
        
        System.out.println("\nScaled x0.2:");
        myScaled.scale(0.2);
        System.out.println(myScaled);
    }
}
