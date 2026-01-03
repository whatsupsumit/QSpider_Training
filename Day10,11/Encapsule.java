

//Encapsule:: the binding or wrapping variabl and methods of an object is known as encapsulation.
// why we use it ?
// to achieve data hiding
//the process of providing direct access but giving controlled access is data hiding 

//how?
// using private access modifier.........private is a keyword.... if we make any keyword as private we cannot use that variable directly in different class....we can only use it in the same class

// how to provide constrolled access?
// using getter and setter method///getter is used to retrieve private varibales .....setter is used to modify private variable


public class Encapsule {

    // Private instance variables
    private String name;
    private int age;
    private String country;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //getter and setter for age
    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //getter and setter for country
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country= country;
    }
    public static void main(String[] args) {
        Encapsule object = new Encapsule();
        object.setName("Sumit");
        object.setAge(21);
        object.setCountry("India");

        System.out.println("Name : "+ object.getName());
        System.out.println("Age : "+ object.getAge());
        System.out.println("Country : "+ object.getCountry());
        
    }
}
