/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    //constructors
    public Car(){
        model = "bus";
        maxSpeed = 1.1;
        isElectric = false;
        color = "blue and red";
    }
    
    public Car(String m, double s, String c){
        model = m;
        maxSpeed = s;
        isElectric = false;
        color = c;
    }
    
    //methods
    public void paint(String c){
        color = c;
    }
    
    public void vroom(){
        int count = 0;
        while(count<maxSpeed){
            System.out.println(model+" goes vroom");
            count = count + 10;
        }
       
    }
    public String getModel(){
        return model;
    }
}