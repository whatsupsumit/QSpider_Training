public class P4 {
    static int x = 5;
    static int y;
    static{
        System.out.println("Sb-1 start");
        y = x++ + ++x;
        System.out.println("x in s1= " + x);
        System.out.println("y in c1= " + y);
        System.out.println("Sb-1 end");
    }
    static{
        System.out.println("Sb-2 start");
        x = y-- - --x;
        System.out.println("x in s2= " + x);
        System.out.println("y in s2= " + y);
        System.out.println("Sb-2 end");
    }
    public static void cal(int x)
    {

        System.out.println("Sm-1 start");
        System.out.println("X in cal in start: "+ x);
        System.out.println("Y in cal in start: "+ y);
        System.out.println("p4.x now "+ P4.x);
        System.out.println("p4.y now "+ P4.y);
        int y = x++ + ++P4.x;
        System.out.println("local x in cal = "+ x);
        System.out.println("local y in cal= "+ y);

        P4.y = y+x;
        System.out.println("static y "+ P4.y);
        System.out.println("Sm-1 end");
        System.out.println("X in cal in end: "+ x);
        System.out.println("Y in cal in end: "+ y);

    }

    public static int Process()
    {
        System.out.println("X in start in process: "+ x);
        System.out.println("Y in start in process: "+ y);

        System.out.println("sm-2 start");
        System.out.println("p4.x now "+ P4.x);
        System.out.println("p4.y now "+ P4.y);
        int x = P4.x + y++;
        P4.x = x - --y;
        System.out.println("x in process= "+ x); 
        System.out.println("y in process= "+ y); 
        System.out.println("sm2 end");
        return x;

    }
    public static void main(String[] args) {
        System.out.println("main start");
        cal(x++);
        int result = Process();
        System.out.println(result);
        System.out.println("X in main = "+ x);
        System.out.println("Y in main = "+ y);
        System.out.println("main ends");
    }
}
