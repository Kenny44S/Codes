import EngineTypes.EngineType;
import EngineTypes.PetrolEngine;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new HondaAccord();

        car1.drive();

        car1.displayEngineInformation();

        EngineType petrolEngine = new PetrolEngine();

        car1.setEngineType(petrolEngine);

        car1.displayEngineInformation();
    }
}
