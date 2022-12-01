package staticmethods_variables;

public class static2 {

      static int x=34;
      static int y;

      // ONLY runs once when first block is created . when the class is loaded for the first time.
      static {
          System.out.println(" this is static block ");

          y= x*3;
      }

    public static void main(String[] args) {

          static2 abc= new static2();

           System.out.println(static2.x +" " + static2.y);

           static2.y= x+10;

        System.out.println(static2.x+ " " + static2.y);

          static2 jkl=new static2();  // the static block did not run here for second object
         // otherwise the output of static block will be printed twice. you can check it by running it.

        System.out.println(static2.x+ " " + static2.y);

    }
}
