package aufgabe4;

/**
 *
 * @author benjamindeutinger
 */
public class Liste <T>{
    private T[] list;
    private int size;
    private int pointer = 0;
    
    public Liste(int size){
        //list = new T[size];
        list = (T[]) new Object[size];
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
//        }else if(--pointer == -1){
//            return null;
        }else{
            pointer = 0;
            return null;
        }
    }
}
