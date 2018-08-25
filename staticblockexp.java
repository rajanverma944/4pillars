
import java.util.*;
class Staticblock {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("this is static block ");
    }
    Staticblock(){
        System.out.println("an example of a Constructor");
    }
}
 
public class Main {
    public static void main(String args[]) {
 
       Staticblock t1 = new Staticblock();
       Staticblock t2 = new Staticblock();
    }
}