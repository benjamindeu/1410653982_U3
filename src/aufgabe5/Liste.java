package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Liste <T extends Benennbar>{
    private T[] list;
    private int size;
    private int pointer = 0;
    
    public Liste(int size){
        //list = new T[size];
        list = (T[]) new Benennbar[size]; //durch constraint kein Objekt als Object mehr möglich
        this.size = size; 
    }
    
    public void save(T parm) throws Exception{
        if(pointer >=this.size){
            throw new Exception("Liste ist voll!");
        }else{
            list[pointer] = parm;
            pointer++;
        }
    }
    
    public Object getElement(int i) throws Exception{
        if((--pointer >= 0)){
            return list[i];  
        }else{
            pointer = 0;
            return null;
        }
    }
}
