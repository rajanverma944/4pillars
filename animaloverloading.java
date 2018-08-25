import java.util.Scanner;
abstract class Animal
{
    private String breed,colour;
    Animal(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColour()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Animal
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog barks"+"nbreed = "+getBreed()+"ncolour = "+getColour());
    }
}
class Cat extends Animal
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat meows"+"nbreed = "+getBreed()+"n colour = "+getColour());
    }
}
public class animaloverloading
{
    public static void main(String args[])
    {
        Cat c = new Cat("Persian","white");
        Dog d = new Dog("german shephard","black");
        d.speak();
        c.speak();
    }
}
