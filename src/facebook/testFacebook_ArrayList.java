
package facebook;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class testFacebook_ArrayList {

     public static void main (String[] args){
         ArrayList<String> name = new ArrayList<String>();
         Scanner sc = new Scanner(System.in);
         while(true) {
             System.out.println("Enter the name for a person (enter #### to exit):");
             name.add(sc.next());
             System.out.println("FacebookPerson with name" + name + "is created!" );
             if(name.equals("####"))
                 System.exit(0);
             if(name.equals(name))
                 System.out.println("Name already exists. Try again");
             continue;       
         }
         Facebook.DrawingPanel screen = new Facebook.DrawingPanel(700, 550);
   

  
    System.out.println("-------select a person and type the mood below--------");

    //Ask the user to set the mood for a person, and update the mood, enter "####" to exit
    while(true){
        int j = 0;
    	System.out.println("Enter the name for a person (enter #### to exit):");
        ArrayList<String> name2 = new ArrayList<String>();
        if (name2 == name) {
            System.out.println("Enter the mood for the person");
		String mood = name2.nextLine();
                    name2.setMood(mood);
	} 
	System.out.println("unrecognized name!");
        }
    } // end while
} // end main

