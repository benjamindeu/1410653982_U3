package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Vehicle extends Benennbar{ 
    private short wheels;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    private Color color;
    
    public Vehicle(){}
    
    public Vehicle(Color color, short wheels, short ps, short doors) {
        this.color = color;
        this.wheels = wheels;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
    }


//------------------------------------------------------------------------------     
    
    public void start(){
        this.started = true;
    }
    
    public void stop(){
        this.started = false;
    }
    
    public void accelerate(short speed){
        if(((this.speed+speed)<250)&&(this.started==true)){
            this.speed += speed;
        }else if(this.started==false){
            System.out.println("Das Vehicle ist nicht gestartet!");
        }else{
            System.out.println("Das Vehicle kann nicht so schnell fahren!");
        }
    }
    
    public void breaken(short speed){
        if(((this.speed-speed)>0)&&(this.started==true)){
            this.speed -= speed;
        }else if(this.started==false){
            System.out.println("Das Vehicle ist nicht gestartet!");
        }else{
            System.out.println("Das Vehicle steht bereits!");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" + "wheels=" + wheels + ", ps=" + ps + ", doors=" + 
                doors + ", started=" + started + ", speed=" + speed + ", color=" + color + '}';
    }
    
//---Getter & Setter------------------------------------------------------------    
    
    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
