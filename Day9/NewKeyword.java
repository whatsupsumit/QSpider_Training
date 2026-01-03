//Object is a instance of class
// How to create an object??
// new is a keyword
// it is a unary operator.
// with the help of new keyword we can create n number of object from one class.
// it will return address of an object
// whenever we are using a new keyword which is used to store address of an object.

//className is a non primitive datatype which is used to store address of an object.

//How to use non-static members inside static context?
// with the help of object reference variable.


//how to use static member inside static variable
//Note: every object is directly pointing towards class static area.

//when ever we have non-static variable and local variable with same name if we use ...Directly inside non static coontext the high priority is given for local variable.........
//to use non-static variable we have to use this. 

// this:
// this is a keyword 
// it is a non- static reference variable ,
// it is used to store the address of current object.
// it can be used only inside non-static context;

public class NewKeyword {
    static String username;
    static int a = 10;


    // public void test()
    // {
    //     System.out.println("test start");
    //     System.out.println(a);
    //     int a = 25;
    //     System.out.println("a = "+a);


    //     NewKeyword ob = new NewKeyword();
    //     System.out.println(ob.a);
    //     System.out.println(this.a);
    //     System.out.println("test end");
    // }

    public void test()
    {
        System.out.println("test start");
        System.out.println("this: "+this);
        System.out.println("test end");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        // System.out.println(new NewKeyword().a);
        // System.out.println(new NewKeyword().a);
        // System.out.println(new NewKeyword().a);
        // System.out.println("Main ends");
        // NewKeyword ref = new NewKeyword();
        // System.out.println(ref);
        // System.out.println(ref);
        // System.out.println(ref.a);

        // System.out.println("Directly: "+a);
        // System.out.println("With the help of classname: "+NewKeyword.a);
        // System.out.println("With the help of object reference: "+ref.a);
        // System.out.println("Main ends");

        // NewKeyword r1 = new NewKeyword();
        // r1.username = "Sumo";
        // NewKeyword r2 = new NewKeyword();
        // r2.username = "ABCD";
        // NewKeyword r3 = new NewKeyword();
        // r3.username = "XYZ";
        // System.out.println(r1.username);
        // System.out.println(r2.username);
        // System.out.println(r3.username);

        // NewKeyword r = new NewKeyword();
        // r.a = 50;
        // r.test();
        // System.out.println("main end");

        NewKeyword r1 = new NewKeyword();
        System.out.println("r1: "+ r1);
        NewKeyword r2 = new NewKeyword();
        System.out.println("r2: "+ r2);
        NewKeyword r3 = new NewKeyword();
        System.out.println("r3: "+ r3);

        r2.test();
        System.out.println("main ends");

    }
}
