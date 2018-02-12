public class Animal 
{
    private String name;
    private String animalType;
    private int age;
    
    public Animal(String name, String animalType, int age)
    {
        this.name = name;
        this.animalType = animalType;
        this.age = age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void printInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Animal Type: " + this.animalType);
        this.printCapability(this.getHuntingCapability());
        System.out.println("----------------------");
    }
    
    public Hunter getHuntingCapability()
    {
        if(this.age < 2)  return new CantHunt();
        else return new CanHunt();
    }
    
    public void printCapability(Hunter hunter)
    {
        hunter.hunt();
    }
    
    public static void main(String[] args)
    {
        Animal tiger = new Animal("Angoora", "Tiger", 1);
        tiger.printInfo();
        tiger.setAge((int) 2);
        tiger.printInfo();
    }
}


interface Hunter  
{
    public void hunt();
}

class CanHunt implements Hunter
{
    @Override
    public void hunt()
    {
        System.out.println("Yaay!! I can go hunting in the wild... ALL ALONE..!!");
    }
}

class CantHunt implements Hunter
{
    @Override
    public void hunt()
    {
        System.out.println("Uh oh... I ain't that old to go hunting all alone...");
    }
}
