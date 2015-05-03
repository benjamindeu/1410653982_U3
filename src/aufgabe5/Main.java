package aufgabe5;

/**
 *
 * @author benjamindeutinger
 */
public class Main {
    
    private static final int listSize = 10;
    
    public static void main(String[] args) throws Exception {
        
        //Liste<Double> myList = new Liste(listSize);
        Liste<Benennbar> benennbarList = new Liste(listSize);
        Liste<Vehicle> vehicleList = new Liste(listSize);
        Liste<Car> carList = new Liste(listSize);
        Liste<Boat> boatList = new Liste(listSize);
        
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        Boat myBoat = new Boat();
        
        benennbarList.save(myVehicle);
        benennbarList.save(myCar);
        benennbarList.save(myBoat);
        
        vehicleList.save(myVehicle);
        vehicleList.save(myCar);
        vehicleList.save(myBoat);
        
        carList.save(myCar);
        //carList.save((Car) myVehicle);
        //carList.save(myBoat);

        boatList.save(myBoat);
        //boatList.save((Boat) myVehicle);
        //boatList.save(myCar);
      
        for(int i=0; i<listSize; i++){
            Object o = benennbarList.getElement(i);
            if(o!=null){
                System.out.println(o);
            }
            
            Object o2 = vehicleList.getElement(i);
            if(o2!=null){
                System.out.println(o2);
            }
            
            Object o3 = carList.getElement(i);
            if(o3!=null){
                System.out.println(o3);
            }
            
            Object o4 = carList.getElement(i);
            if(o4!=null){
                System.out.println(o4);
            }
        }
    }
}
