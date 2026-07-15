import java.sql.*;

// Import packages
// load and register the Driver
// Create Connection
// create a statement 
// execute the query
// process the result
// close
 public class ConnectionDB {
    public static void main(String[] args){
        int a =91;
        String s=String.valueOf(a);
        System.out.println(a);
        System.out.println(s);
        char f='a';
        int b=f;
        int d=97;
        char g=(char)d;
        System.out.println("here"+b);
        System.out.println(g);
        String[] j={"Ashish","Bedare"};
        String l=j[0];
        System.out.println(l);
        System.out.println("HEHere");
        System.out.println('c'-'a');

        int c=Character.getNumericValue(s.charAt(1));
        System.out.println(c);

       
    }
    
}
