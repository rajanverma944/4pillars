import java.util.Scanner;
class overPrint
{
    public void overprint()
    {
        System.out.println("NULL argument");
    }
    public void overprint(int x)
    {
        System.out.println("Integer argument"+ x);
    }
    public void overprint(float x)
    {
        System.out.println("float argument"+x);
    }
}
public class overloadprint
{
    public static void main(String args[])
    {
        overPrint a = new overPrint();
        overPrint b = new overPrint();
        overPrint c = new overPrint();
        a.overprint();
        b.overprint(5);
        c.overprint(5.5f);
    }
}
