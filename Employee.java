package staticmethods_variables;

public class Employee {

       int age;
       int salary;
       String name;
       boolean married;

       // one property that is common to all employees is no of employees at the org //
       // so the properties that are not related to objects but that are common to all objects of that class.
       //   This can be declared as static variables.

      //  when a member is declared static as Static variables  it can be accessed before creating the object of the class

      // static variables are independent of objects.
      static long no_ofemp;

    public Employee(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;

        // When you are declaring, accessing, modifying static variables don't do it using reference variable
        // like this ---
        this.no_ofemp += 1; // it will work but convention is use class name to perform operations.

        Employee.no_ofemp += 1;// This is conventional.

    }

    // YOU can use static methods without creating the object of the class
    //if we are not declaring main method as static we will not be able to ru it without creating object of the class
    // Main is the first thing that runs first to ru the program so it should not be dependant on class
    // Thats why main is static.


    public static void main(String[] args) {  // MOST COMMON STATIC METHOD IS STATIC MAIN METHOD.

        // Creating objects of employee class //

        Employee Rahul=new Employee(21,20000,"Rahul roy ",false);
        Employee Saurabh=new Employee(26,62000,"Saurabh roy ",true);


         Employee Saur=new Employee(29,70000,"Saurabh roy ",true);
            System.out.println(Rahul.no_ofemp);
            System.out.println(Saurabh.no_ofemp);
            System.out.println(Employee.no_ofemp);

             Employee ABC=new Employee(16,34000,"JKL",true);
              ABC.fun();

              // Non-static methods cannot be accessed from a static method.
         // either make it static or create an object. because it requires an instance.
          welcome(); // you sn use static methods inside static easily. because it is not depend on instances or objects.
    }



    static void welcome(){


        System.out.println(" welcome here ");
    }

    void fun(){
         // hello does not need any object because at last fun is going to create an object in main method.
        hello();
    }
    void hello(){

         welcome();// static methods can be called inside non static method.
        System.out.println(" hello ");
    }
}

