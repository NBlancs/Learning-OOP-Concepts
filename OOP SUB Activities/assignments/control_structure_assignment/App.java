package assignments.control_structure_assignment;

import java.util.Scanner;
// Name: Noel Jhumel G. Blanco
// Section IT2R13
// Subject: Object-Oriented Programming

// Requirment: 
  // Read About Switch Case Statements in Java
  // Implement a switch case statement using real-world scenarios
  // Implement a nested loop using real-world scenarios

public class App {

    // eyyy colorrrss
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m"; 
    public static final String ANSI_RED = "\u001B[31m"; 
    public static final String ANSI_GREEN = "\u001B[32m"; 
    public static final String ANSI_BLUE = "\u001B[34m"; 
    public static final String ANSI_PURPLE = "\u001B[35m"; 
    public static final String ANSI_CYAN = "\u001B[36m"; 

    // eyy bold colors
    public static final String YELLOW_BOLD = "\033[1;33m"; 
    public static final String BLUE_BOLD = "\033[1;34m";  

    
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){


        try {
            System.out.println("Name: Noel Jhumel G. Blanco");
            System.out.println("Section: ITR13");
            System.out.println("Subject: Object-Oriented Programming\n");
            System.out.println(BLUE_BOLD+"\n======= MAIN MENU ========\n");
            System.out.println("Select an option:\n"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"1. Switch Statements (Schedule Tracker)");
            System.out.println("2. Nested Loops (To-do list)");
            System.out.println("3. Terminate Program"+ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            System.out.print(ANSI_GREEN+"\nInput here: "+ANSI_RESET);
            int input = scanner.nextInt();

            switch(input){
                case 1 -> switchStatement();
                case 2 -> nestedLoop();
                case 3 -> terminateProgram();
                default -> {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(ANSI_RED+"\nPlease Input Value from 1 - 3 Only. Thanks.\n"+ANSI_RESET);
                    menu();
                }

            }
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(ANSI_RED+"\nPlease Input an Integer. Thanks.\n"+ANSI_RESET);
            menu();
        }

        
        
    }

    public static void switchStatement(){
        try {
                System.out.println(YELLOW_BOLD+"\n======== Switch Statement (Schedule Tracker) ========\n"); 
        while (true) { 
                Scanner scanner = new Scanner(System.in);
                System.out.println(YELLOW_BOLD+"\nNote: 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday");
                System.out.println("Note: 8 = Back to Menu"+ANSI_RESET);
                System.out.print(ANSI_GREEN+"Input day here (1-7): "+ANSI_RESET);
                int choice = scanner.nextInt();
    
                

                // switch case statements
                switch (choice) {
                    case 1:
                        System.out.println(ANSI_YELLOW+"\n======== Monday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"7AM - 9AM - Environmental Science Class (Online)");
                        System.out.println("1PM - 3PM - Intro to Human-Computer Interaction Class (Online)");
                        System.out.println("6PM - 9PM - Fundamentals of Database Systems Class (Online)"+ANSI_RESET);

                        break;
                    case 2:
                        System.out.println(ANSI_YELLOW+"\n======== Tuesday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"9AM - 12PM - PE PathFit3 Class (Face-to-Face)"+ANSI_RESET);
                        break;
                    case 3:
                        System.out.println(ANSI_YELLOW+"\n======== Wednesday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"REST DAY"+ANSI_RESET);
                        break;
                    case 4:
                        System.out.println(ANSI_YELLOW+"\n======== Thursday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"7AM - 9AM - Intro to Human-Computer Interaction Class (Face-to-Face)");
                        System.out.println("1PM - 4PM - Object-Oriented Programming Class (Face-to-Face)");
                        System.out.println("6PM - 9PM - Platform Technologies Class (Online)"+ANSI_RESET);

    
                        break;
                    case 5: 
                        System.out.println(ANSI_YELLOW+"\n======== Friday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"7AM - 9AM - Environmental Science Class (Face-to-Face)");
                        System.out.println("10AM - 12PM - Object Oriented Programming (Online)"+ANSI_RESET);
                        break;
                    case 6:
                        System.out.println(ANSI_YELLOW+"\n======== Saturday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"7AM - 10AM - Fundamentals of Database Systems Class (Face-to-Face)");
                        System.out.println("2:30PM - 4:30PM - Platform Technologies Class (Face-to-Face)");
                        System.out.println("4:30PM - 7:30PM - Accounting Principles Class (Face-to-Face)"+ANSI_RESET);
                        break;
                    case 7:
                        System.out.println(ANSI_YELLOW+"\n======== Sunday ========\n"+ANSI_RESET);
                        System.out.println(BLUE_BOLD+"REST DAY"+ANSI_RESET);

                        break;

                    case 8:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        menu();
                        break;
                    
                    default:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println(ANSI_RED+"\nPlease Input value from 1 - 7. Thanks\n"+ANSI_RESET);
                        switchStatement();
                        break;
                }
    
}       
 } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(ANSI_RED+"\nPlease Input an Integer. Thanks.\n"+ANSI_RESET);
            switchStatement();
        }
    }


    public static void nestedLoop(){
        try {
            System.out.println(YELLOW_BOLD+"\n======== Nested Loop (To-do list) ========\n"+ANSI_RESET);

     
                String[] days = {ANSI_YELLOW+"Monday", ANSI_YELLOW+"Tuesday", ANSI_YELLOW+"Wednesday", ANSI_YELLOW+"Thursday",  ANSI_YELLOW+"Friday",  ANSI_YELLOW+"Saturday",  ANSI_YELLOW+"Sunday"};
                String [][]todos = {
                    	{BLUE_BOLD+"Attend Online Classes", "Read Books", "Practice Coding"+ANSI_RESET},
                        {BLUE_BOLD+"Attend PE Class", "Check for Assignments", "Answer Assignments if there is any", "Practice Coding"+ANSI_RESET},
                        {BLUE_BOLD+"Watch TV Shows", "Read Manhwa", "Read Books"+ANSI_RESET},
                        {BLUE_BOLD+"Attend Face-to-Face and Online Classes", "Learn ReactJS", "Commit Changes to Personal Website Portfolio"+ANSI_RESET},
                        {BLUE_BOLD+"Attend Face-to-Face and Online Classes", "Review Subjects", "Check USTEP for any updates"+ANSI_RESET},
                        {BLUE_BOLD+"Attend Face-to-Face Classes", "Practice Coding"+ANSI_RESET},
                        {BLUE_BOLD+"Recreational Activities", "Watch Netflix Shows"+ANSI_RESET}
                };
                System.out.println(ANSI_YELLOW+"\nWeekly To-Do List (September 16 - September 22, 2024)\n"+ANSI_RESET);

                // nested for loop
                for (int i = 0; i < days.length; i++){
                    System.out.println(days[i]+":");
                    for (int j = 0; j<todos[i].length; j++){
                        System.out.println("  - "+todos[i][j]);
                    }    
                    System.out.println();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println(ANSI_YELLOW+"\nType 1 to go back to menu\n"+ANSI_RESET);
            System.out.print(ANSI_GREEN+"Input here: "+ANSI_RESET);
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                menu();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(ANSI_RED+"\nPlease Input a value of 1 only. Thanks\n"+ANSI_RESET);
                nestedLoop();

            }
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(ANSI_RED+"\nPlease Input an Integer. Thanks.\n"+ANSI_RESET);
            nestedLoop();
        }
    }

    public static void terminateProgram(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(ANSI_RED+"======== PROGRAM TERMINATED ========"+ANSI_RESET);
        System.exit(0);
    }
}

