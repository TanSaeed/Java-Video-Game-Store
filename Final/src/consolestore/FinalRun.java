package consolestore;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import consolefactory.*;
import consolestore.Job.Staff;
import sony.*;
import nintendo.*;
import microsoft.*;

// Tan Saeed Fianl Project
// Please check word doc for documentation, these will just be comments in here

public class FinalRun {
	public static void main (String[] args){

		 ConsoleFactory sFactory = new Sony(); // A Console Factory refrence used via polymorphism to instanciate a Sony object
		 ConsoleFactory nFactory = new Nintendo();
		 ConsoleFactory mFactory = new Microsoft();
		 
		 ConsoleOutlet sonyOutlet = new ConsoleOutlet(sFactory); // console factory is then made into a console outlet
		 ConsoleOutlet nintOutlet = new ConsoleOutlet(nFactory); // s = sony, nin = nintendo, micro = microsoft
		 ConsoleOutlet microOutlet = new ConsoleOutlet(mFactory);
		 
		 Job k = new Job(Staff.Kazi); //enums for staff, yes in retrospect I realized this is a awful way to use enum
		 Job z = new Job(Staff.Zae);
		 Job b = new Job(Staff.Brando);
		 Job s = new Job(Staff.Syed);
		 
		 int choice = 0; // used for choices in the program
		 
		 Scanner sc = new Scanner(System.in); // scanner using a keyboard as input
		 
		 System.out.println("Welcome to the store console game! made by Zae Saeed! "
		 		+ "In this game you will be in charge of a store." + "\n"
		 		+ "Every day several customers will show up and its your job to sell them the consoles." + "\n"
		 		+"In the start of the day you will get a chance to order shipemnts from the manufacturer."
		 		+ "\n" + "\n"
		 		+ "---Press anything to meet the staff!---");
		 
		 sc.nextLine();
		 
		 System.out.println("This is " + k.getStaff() + " hes the " + k.getStaff().getJob()); //uses enums to
		 System.out.println("This is " + z.getStaff() + " hes the " + z.getStaff().getJob());//display staff
		 System.out.println("This is " + b.getStaff() + " hes the " + b.getStaff().getJob());
		 System.out.println("This is " + s.getStaff() + " hes the " + s.getStaff().getJob());
		 
		 System.out.println("\n" + "---Press anything to set up shop!---"); 
		 
		 sc.nextLine();
		 
		 ConsoleStore store = ConsoleStore.getConsoleStore(); // singleton design, creates one console store
		 int day = 0; //used for days
		 int rReq = 0;// random number generated for console request string array
		 int rNum1 = 0; // random number generator int
		 int rNum2 = 0;// random number generator int 2
		 
		 // Several String arrays, |req = console request| |people = random people| |weather = the weather for the day
		 String[] req = new String[] {"Playstation 4","Xbox One","Wii U","Nintendo Switch","Playstation Vita","Nintendo 3DS"};
		 String[] people = new String[] {"Tom","Jerry","Ibrahim","John","Harnish","Umang","Phipps","Drew","Jake","Sara"};
		 String[] weather = new String[] {"Sunny","Blizard!!","Slight Clouds", "Rainy","ThunderStorm!",
				 "Sunny wi- christ was that UAV?!","Black plague season! les get it boys", 
				 "Snowy", "Foggy", "Rain with some sun"};		 
	
		 System.out.println("\n" + "---Awesome! Press anything to start the day---");
		 
		 sc.nextLine();
		 
		 while(choice != -1) // scanner waits until -1 is entered to end program
		 {
			 day++;
			 rNum2 = ThreadLocalRandom.current().nextInt(0, 9 + 1); // random number generated for weather
			 
			 
			 System.out.println("Day: " + day );
			 System.out.println("Weather: " + weather[rNum2]);
			 System.out.println(z.getStaff() + " gets the inventory sheet for you");
			 System.out.println(store); // calls store.toString
			 
			 //bunch of for loops to get certain number of orders
			 System.out.println(b.getStaff() + " is asking what to import for today");
			 System.out.println("How many Playstation 4s would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(sonyOutlet.orderHome()); // in this case we are ordering ps4s from sonys 
			 }												  // store outlet, overriding for sonys version of orderHome
			 												  // rest of the code is , using proper outlet and order 
			 System.out.println("How many Xbox Ones would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(microOutlet.orderHome());
			 }
			 
			 System.out.println("How many Wii Us would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(nintOutlet.orderHome());
			 }
			 
			 System.out.println("How many Nintendo Switches would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(nintOutlet.orderHybrid());
			 }
			 
			 System.out.println("How many Playstation Vitas Would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(sonyOutlet.orderHandheld());
			 }
			 
			 System.out.println("How many Nintendo 3Ds Would you like to order?");
			 choice = sc.nextInt();
			 for (int i = 0; i<choice; i++)
			 {
				 store.importConsole(nintOutlet.orderHandheld());
			 }
			 
			 System.out.println("\n" + k.getStaff() + " is maning the front post waiting for customers");
			 
			 int line = ThreadLocalRandom.current().nextInt(0, 15 + 1); // generates number of pople who showed up
			 System.out.println(line + " customers have showed up today!");
			 for (int i = 0; i<line; i++)
			 {
				 
				 rReq = ThreadLocalRandom.current().nextInt(0, 5 + 1); // req number used with req String array
				 rNum1 = ThreadLocalRandom.current().nextInt(0, 9 + 1);// random number used for a random name
				 
				 System.out.println("\n"+ people[rNum1] + " has showed up and is asking for a " + req[rReq]);
				 System.out.println("Sell " + people[rNum1] + " a " + req[rReq] + "? (1 = yes, 0 = no)");
				 choice = sc.nextInt();
				 if (choice == 1) // simple choice to sell or not sell to customer 
				 {
					 store.sellConsole(req[rReq]); //store uses sellConsole method to sell proper console
				 }
				 else if (choice == 0) // decline to sell
				 {
					 System.out.println("You have decided not to sell");
				 }
				 else // fail safe for bad input
				 {
					 System.out.println("You told the customer gibberish, and he walked off pissed");
				 }
				 
			 }
			 
			 
			 System.out.println(s.getStaff() + " is crunching the numbers, new balance is " + store.getAcc());
			 System.out.println("Well thats a wrap, Enter 1 for the next day or enter -1 to quit");
			 choice = sc.nextInt(); // choice to end the program or continue to the next day
			 
		 }
		
		 System.out.println("Fianl Balance:" + store.getAcc()); // uses store.getAcc method to return double type
		 System.out.println("Thanks For Playing!");
		 sc.close();
		 System.exit(0);
	}
}
