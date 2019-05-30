public class Animal 
{
    private String name;
    private String animalType;
    private int age;
    
    private Hunter hunterType;
    
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
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Animal Type: " + animalType);
        getHuntingCapability();
        printHuntingCapability(hunterType);
        System.out.println("----------------------");
    }
    
    public void getHuntingCapability()
    {
        if(age < 2)  hunterType = new CantHunt();
        else hunterType = new CanHunt();
    }
    
    public void printHuntingCapability(Hunter hunter)
    {
        hunter.hunt();
    }
    
    public static void main(String[] args)
    {
        Animal tiger = new Animal("Angoora", "Tiger", 1);
        tiger.printInfo();
        tiger.setAge(2);
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
