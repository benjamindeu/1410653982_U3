package aufgabe5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benjamindeutinger
 */
public class Boat extends Vehicle {
    private double draft;
    private short propeller;
    private double cargo;

    public Boat(){}
    
    public Boat(Color color, double draft, short propeller, double cargo, short wheels, short ps, short doors) {
        super(color, wheels, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }
    
    public void unload(){
        this.cargo = 0;
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Boat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + this.getPs() + " PS und einen "
                + "Tiefgang von " + this.getDraft() + " m";
    }

//---Getter & Setter------------------------------------------------------------ 
    
    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }    
}
