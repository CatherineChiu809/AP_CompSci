/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Car mobile = new Car();
        Car batmobile = new Car("Lamburghini",525,"black");
        batmobile.paint("Pink");
        mobile.vroom();
        batmobile.vroom();
        System.out.println(mobile.getModel());
	}
}