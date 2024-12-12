/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void printAnimal(){
        System.out.println("    _____,,;;;`;       ;';;;,,_____");
        System.out.println(",~(  )  , )~~\\|       |/~~( ,  (  )~;");
        System.out.println("\' / / --`--,             .--\'-- \\ \\ `");
        System.out.println(" /  \\    | '             ` |    /  \\");
    }
    
    public static void greeting(String name){
        System.out.println("Greetings " + name+"!");
    }
    
    public static double raise(double salary, int percent){
        //double ppercent = percent/100.0;
        double newsalary = salary+(salary(percent/100.0));
        return(newsalary);
    }
    
    public static void main(String args[]) {
        greeting("Catherine");
        double num = raise(6000,6);
        System.out.println(num);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        num = raise(num+6000,6);
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
	}
}