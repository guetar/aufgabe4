/**
 *
 * @author steff
 */
public class Test {

    public static void main(String[] args) {
    
        Box boxA = new Box('#', '_', 3, 4);
        DarkBox darkBoxA = new DarkBox('d', 5, 3);
        ClearBox clearBoxA = new ClearBox(4, 4);
<<<<<<< HEAD
        //FreeBox freeBoxA = new FreeBox("abc\ndef", 3, 2);
=======
        ClearBox clearBoxB = new ClearBox(2,2);
        FreeBox freeBoxA = new FreeBox("abc\ndef");
>>>>>>> branch 'master' of https://github.com/guetar/aufgabe4.git
        
        Box[][] boxarr=new Box[2][1];
        boxarr[0][0]=new Box('C', '.', 3, 5);
        boxarr[1][0]=new Box('E', 'O', 3, 5);        
        Repeated<Box> reA=new Repeated<Box>(boxarr,1.0);
        
        System.out.println(boxA);
        boxA.scale(2);
        System.out.println("Scale x2\n"+boxA);
        boxA.scale(0.01);
        System.out.println("Scale x0.01\n"+boxA);
        
        System.out.println(darkBoxA);
        darkBoxA.scale(3);
        System.out.println("Scale x3\n"+darkBoxA);
        darkBoxA.scale(0.001);
        System.out.println("Scale x0.001\n"+darkBoxA);
        
        System.out.println(clearBoxA);
<<<<<<< HEAD
        clearBoxA.scale(3);
        System.out.println("Scale x3\n"+clearBoxA);
        clearBoxA.scale(0.001);
        System.out.println("Scale x0.001\n"+clearBoxA);
        clearBoxA.scale(1000);
        System.out.println("Scale x1000\n"+clearBoxA);

        

        
        //System.out.println(freeBoxA);
        System.out.println(reA);        
=======
        System.out.println(clearBoxB);
        System.out.println(freeBoxA);
>>>>>>> branch 'master' of https://github.com/guetar/aufgabe4.git
    }
}
