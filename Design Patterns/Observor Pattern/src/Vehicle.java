import EngineTypes.EngineType;

public abstract class Vehicle {

     EngineType engineType;

    public void drive()
    {
        System.out.println("Basic driving..");
    }


    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }


    public void displayEngineInformation()
    {
        engineType.engineInfo();
    }
}
