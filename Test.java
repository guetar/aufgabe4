/**
 *
 * @author steff
 */
public class Test {

    public static void main(String[] args) {
        
        System.out.println("Box:");
        Box boxA = new Box('#', '_', 2.4, 3.2);
        System.out.println(boxA);
        boxA.scale(2);
        System.out.println("Scale x2\n"+boxA);
        boxA.scale(0.01);
        System.out.println("Scale x0.01\n"+boxA);  
        
        System.out.println("DarkBox:");
        DarkBox darkBoxA = new DarkBox('d', 5, 3.1);
        System.out.println(darkBoxA);
        darkBoxA.scale(3);
        System.out.println("Scale x3\n"+darkBoxA);
        darkBoxA.scale(0.001);
        System.out.println("Scale x0.001\n"+darkBoxA);
        
        System.out.println("ClearBox:");
        ClearBox clearBoxA = new ClearBox(4.1, 4);
        System.out.println(clearBoxA);
        clearBoxA.scale(3);
        System.out.println("Scale x3\n"+clearBoxA);
        clearBoxA.scale(0.001);
        System.out.println("Scale x0.001\n"+clearBoxA);
        clearBoxA.scale(1000);
        System.out.println("Scale x1000\n"+clearBoxA);
        
        System.out.println("FreeBox:");
        FreeBox freeBoxA = new FreeBox("abc\ndef");
        System.out.println(freeBoxA);
        freeBoxA.scale(1.5);
        System.out.println("Scale x1.5\n"+freeBoxA);
        freeBoxA.scale(0.3);
        System.out.println("Scale x0.3\n"+freeBoxA);
        freeBoxA.scale(10);
        System.out.println("Scale x10\n"+freeBoxA);
        
        
        
        System.out.println("\nRepeated:");
        Scalable[][] boxarr = new Scalable[3][2];
        boxarr[0][0]=new Box('x', 'o', 5, 5);
        boxarr[1][0]=new DarkBox('m', 3, 3);       
        boxarr[2][0]=new ClearBox(4, 7);
        boxarr[0][1]=new FreeBox("abc\ndef");
        boxarr[1][1]=new Box('C', '.', 5, 5);
        boxarr[2][1]=new Box('E', 'O', 3, 7); 
        Repeated<Scalable> reA=new Repeated<Scalable>(boxarr,1.0);
        System.out.println(reA);   
        
        System.out.println("\nRepeated x1.5:");
        reA.scale(1.5);
        System.out.println(reA);
        
        System.out.println("\nRepeated x0.3:");
        reA.scale(0.3);
        System.out.println(reA);
        
        
        
        System.out.println("\nScaled:\n");
        boxarr = new Scalable[3][2];
        boxarr[0][0]=new Box('x', 'o', 5, 5);
        boxarr[1][0]=new DarkBox('m', 3, 3);       
        boxarr[2][0]=new ClearBox(4, 7);
        boxarr[0][1]=new FreeBox("abc\ndef");
        boxarr[1][1]=new Box('C', '.', 5, 5);
        boxarr[2][1]=new Box('E', 'O', 3, 7); 
        Scaled<Scalable> scA = new Scaled<Scalable>(boxarr);
        System.out.println(reA);   
        
        System.out.println("\nScaled x1.5:");
        scA.scale(1.5);
        System.out.println(reA);
        
        System.out.println("\nScaled x0.3:");
        scA.scale(0.3);
        System.out.println(reA);
    }
}
