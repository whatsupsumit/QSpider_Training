public class StaticPrac {
    static int a = 10; // static variable   ...we can use it without assign ....they store default value
    static int b = 30;


    public static void test()
    {
        System.out.println("Test: ");
        int a = 25;
        System.out.println(a); //local variable will be given the priority ,,,,
        System.out.println(StaticPrac.a);// to access the variable from global area we need to consider the classname.
    }
    public static void main(String[] args) {
        // System.out.println(a);
        // System.out.println(a+b);
        System.out.println("Main Start");
        A.test();
        System.out.println("Main Ends");
    }

    static{
        System.out.println("Welcome to LPU");
    }
}

class A{
    static{
        System.out.println("Welcome to A class");
    }
    public static void test()
    {
        System.out.println("test start");
        System.out.println("Test end");
    }
}



//difference between Static method and Block
//Static: performs class-level action and utility function  ex: Math.pow()    
// 2.Execute only when explicitly called classname.methodname()
//3.can be called multiple time throughout the programs execution.
//4.can except parameters and return values.
//5.can only directly access static variables and other static methods.


//Static Block
// Initializes static variables, loads configuration, or performs one-time setup when the class is loaded.
//Automatically executed once by the JVM when the class is first loaded into memory, even before the main() method.
//Cannot be called explicitly; runs automatically and only once.
//Cannot accept parameters or return anything.
//Can only directly access static variables and call static methods

