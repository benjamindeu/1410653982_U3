package aufgabe4;

/**
 *
 * @author benjamindeutinger
 */
public class Main {
    
    private static final int listSize = 10;
    
    public static void main(String[] args) throws Exception {
        //Liste<Double> myList = new Liste<Double>(10);
        Liste<Double> myList = new Liste(listSize);
        myList.save(2.0);
        myList.save(5.0);
        myList.save(200.0);
        
        for(int i=0; i<listSize; i++){
            //System.out.println(myList.getElement(i));
            Object o = myList.getElement(i);
            if(o!=null){
                System.out.println(o);
            }
        }
    }
    
}
