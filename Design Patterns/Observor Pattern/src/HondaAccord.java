import EngineTypes.DieselEngine;

public class HondaAccord extends Vehicle{

    HondaAccord()
    {
        this.engineType = new DieselEngine();
    }


    @Override
    public void drive() {
        System.out.println("Driving Honda Accord!");
    }
}
