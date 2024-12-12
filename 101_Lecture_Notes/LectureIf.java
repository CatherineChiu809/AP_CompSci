/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You awake to find yourself in a dimly lit room aboard an alien spaceship. The air is cool, and the hum of the ship’s engines reverberates through the metallic walls. You have no idea how you got here, but you know you must find a way to escape before it’s too late.");
        System.out.println("As you explore the room, you discover a hidden hatch behind a panel. You pry it open and find yourself in a control room filled with blinking lights and strange, alien consoles. It seems like the ship’s command center. You see three distinct areas to investigate:");
        System.out.println("\nOption 1: The Alien Console: A complex array of buttons and screens. It could provide information on the ship’s systems or even help you take control of the ship.");
        System.out.println("\nOption 2: The Navigation Room: A large map of the galaxy with various coordinates. You might find a way to chart a course back to Earth or discover the ship’s current location.");
        System.out.println("\nOption 3: The Storage Locker: Filled with various tools and equipment. It might contain something useful for your escape or provide clues about the aliens.");
        System.out.println("\nEnter your choice: ");
        
        int a1 = sc.nextInt(); 
        
        if(a1 == 1){
            System.out.println("\nThe Alien Console: You approach the console and start fiddling with the buttons. After a few moments, you manage to access the ship’s control systems. You can:");
            System.out.println("\nOption 1: Initiate a Shipwide Lockdown: This might prevent the aliens from discovering your escape but could also lock you in with no way out.");
            System.out.println("\nOption 2: Engage the Cloaking Device: This could make the ship invisible, giving you a better chance to sneak around, but it might also make it harder for you to find your way.");
            System.out.println("\nOption 3: Override the Ship’s Controls: Potentially take control of the ship’s systems and steer it, which could lead you to safety if you can manage to navigate.");
            System.out.println("\nEnter your choice: ");
            
            int a2 = sc.nextInt();
        }
        
        else if(a1 == 2){
            System.out.println("\nThe Navigation Room: You examine the map and find that the ship is currently in deep space, far from any known star systems. You can:");
            System.out.println("\nOption 1: Chart a Course to a Nearby Planet: If you can figure out the ship’s propulsion system, you might be able to land on an uninhabited planet and seek shelter.");
            System.out.println("\nOption 2: Send a Distress Signal: Using the ship’s communication systems to send out a distress signal in hopes that someone might rescue you.");
            System.out.println("\nOption 3: Locate the Ship’s Home Planet: If you can find where the aliens come from, you might be able to plan an escape route or find a way to blend in.");
            System.out.println("\nEnter your choice: ");
            
            int a2 = sc.nextInt();
        }
        
        else if(a1 == 3){
            System.out.println("\nThe Storage Locker: You rummage through the locker and find various alien tools and supplies. You can:");
            System.out.println("\nOption 1: Take a Multi-tool: It might be useful for bypassing security systems or repairing damaged equipment.");
            System.out.println("\nOption 2: Grab a Stealth Suit: This could help you blend in with the aliens and move around the ship unnoticed.");
            System.out.println("\nOption 3: Find a Map and Keycard: These items might give you a better understanding of the ship’s layout and allow you to access restricted areas.");
            System.out.println("\nEnter your choice: ");
            
            int a2 = sc.nextInt();
            if(true){
                System.out.println("\nWith these items in hand, you consider your next move. The map reveals several crucial areas of the ship, including a potential escape pod bay and a restricted laboratory. The keycard can unlock doors to these areas. You can:");
                System.out.println("\nOption 1: Take a Multi-tool: It might be useful for bypassing security systems or repairing damaged equipment.");
                System.out.println("\nOption 2: Grab a Stealth Suit: This could help you blend in with the aliens and move around the ship unnoticed.");
                System.out.println("\nOption 3: Find a Map and Keycard: These items might give you a better understanding of the ship’s layout and allow you to access restricted areas.");
                System.out.println("\nEnter your choice: ");
            }
        }
        
        else{
            System.out.println("\nThat is not a valid option choice please rerun the program");
        }
        
	}
}