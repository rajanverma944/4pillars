import java.util.Scanner;


abstract class Vehicle
{

    public abstract void start();
    public void stop()
    {
        System.out.println("the Vehicle has Stoped");
    }
}



class twowheeler extends Vehicle
{
        public void start()
        {
                System.out.println("the twowheeler has Started");
        }   
}



class fourwheeler extends Vehicle
{
        public void start()
        {
                System.out.println("the fourwheeler has Started");
        }
}




public class vehicleinheritance
{
    public static void main(String args[])
    {
        twowheeler s = new twowheeler();



        fourwheeler r = new fourwheeler();


        s.start();


        s.stop();


        r.start();


        r.stop();
    }
}