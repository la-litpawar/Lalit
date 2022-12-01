package staticmethods_variables;

// outside classes cannot be static it is not dependent on any other class.
public class Outerclass {
    // only inner classes can be static.


   }
   class innerclass{

    static String name;
   static int num=45;

    public innerclass(int num) {
        this.num = num;
    }


    public static void main(String[] args) {

        innerclass ajAY= new innerclass(334);
        innerclass aj= new innerclass(34);
        System.out.println(ajAY.num);
        System.out.println(aj.num);
    }
}
