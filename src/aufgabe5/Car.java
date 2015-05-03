package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Car extends Vehicle{
    private boolean aircondition;
    private short airbag;
    
    public Car(){}
    
    public Car(Color color, short wheels, short ps, short doors, short airbag) {
        super(color, wheels, ps, doors);
        this.aircondition = false;
        this.airbag = airbag;
    }
    
    public void startAircondition(){
        if(this.aircondition==false){
            this.aircondition = true;
        }else{
            System.out.println("Die Aircondition laeuft bereits!");
        }
    }
    
    public void stopAircondition(){
        if(this.aircondition==true){
            this.aircondition = false;
        }else{
            System.out.println("Die Aircondition ist bereits ausgeschaltet!");
        }
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " +
                this.getSpeed() + " km/h";
    }
    
//---Getter & Setter------------------------------------------------------------ 

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
    
}
