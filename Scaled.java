///**
// *
// * @author guetar
// */
//public class Scaled<P extends Pict> extends Container {
//    
//    private double maxWidth;
//    private double maxHeight;
//    
//    public Scaled(P[][] container) {
//        super(container);
//    }
//
//    @Override
//    public void scale(double factor) {
//        for(int i = 0; i < getWidth(); i++) {
//            for(int j = 0; j < getHeight(); j++) {
//                Scalable box = (Scalable) getBox(i, j);
//                box.scale(factor);
//                if(box.getWidth() > maxWidth) maxWidth = box.getWidth();
//                if(box.getHeight() > maxHeight) maxHeight = box.getHeight();
//            }
//        }
//    }
//    
//    @Override
//    public String toString() {
//        String output = "";
//        for(int i = 0; i < getWidth(); i++) {
//            for(int j = 0; j < getHeight(); j++) {
//                P box = (P) getBox(i, j);
//                output += box.toString(j);
//            }
//        }
//        return output;
//    }
//}
