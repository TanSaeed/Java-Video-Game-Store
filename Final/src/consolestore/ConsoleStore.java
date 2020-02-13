package consolestore;

public class ConsoleStore {
	private static ConsoleStore cstore = null;
	
	protected int ps4, xboxone, wiiu, nswitch, vita, ds;
	protected static Account<Double> acc; // has a relationship (composition)
	
	private ConsoleStore(){
		acc = new Account<Double>((double) 3000, "Dollars");
		ps4 = 0;
		xboxone = 0;
		wiiu = 0;
		nswitch = 0;
		vita = 0;
		ds = 0;
	}
	
	public static ConsoleStore getConsoleStore(){ // Singleton design forcing only one console store
		if(cstore == null){
			cstore = new ConsoleStore();
			System.out.println("Store is opened, account holds:" + acc.getCash() + " in " + acc.getCurrency());
		}
		return cstore;
	}

	public double getAcc() {
		return (double) acc.getCash();
	}
	
	public void importConsole(String s){ // case statement is used to check if the money is in the account
		switch(s)						// if so we will import a console into the store, each console has set
		{								// import price
		case "Playstation 4":
			if((acc.getCash() - 250) >= 0){
				ps4++;
				acc.setCash(acc.getCash() - 250);
				System.out.println("Playstation 4 imported for 250$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a Playstation 4, Current Balance:" + acc.getCash());
			break;
			
		case "Xbox One":
			if((acc.getCash() - 300) >= 0){
				xboxone++;
				acc.setCash(acc.getCash() - 300);
				System.out.println("Xbox One imported for 300$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a Xbox One, Current Balance:" + acc.getCash());
			break;
			
		case "Wii U":
			if((acc.getCash() - 210) >= 0){
				wiiu++;
				acc.setCash(acc.getCash() - 210);
				System.out.println("Wii U imported for 210$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a Wii U, Current Balance:" + acc.getCash());
			break;
			
		case "Nintendo Switch":
			if((acc.getCash() - 270.50) >= 0){
				nswitch++;
				acc.setCash(acc.getCash() - 270.50);
				System.out.println("Nintendo Switch imported for 270.50$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a Nintendo Switch, Current Balance:" + acc.getCash());
			break;
			
		case "Playstation Vita":
			if((acc.getCash() - 244) >= 0){
				vita++;
				acc.setCash(acc.getCash() - 244);
				System.out.println("Playstation Vita imported for 244$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a PS Vita, Current Balance:" + acc.getCash());
			break;
			
		case "Nintendo 3DS":
			if((acc.getCash() - 289) >= 0){
				ds++;
				acc.setCash(acc.getCash() - 289);
				System.out.println("Nintendo 3DS imported for 289$, Current Balance:" +acc.getCash());}
			else 
				System.out.println("You dont have enough money to import a Nintendo 3DS, Current Balance:" + acc.getCash());
			break;
		}
	}
	public void sellConsole(String s){ // similar to import but checks to see if we have a console and then sells it
		switch(s)					  // for set sell price
		{
		case "Playstation 4":
			if(ps4 > 0){
				ps4--;
				acc.setCash(acc.getCash() + 299);
				System.out.println("Playstation 4 sold for 299$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Playstation 4s in stock!");
			break;
			
		case "Xbox One":
			if(xboxone > 0){
				xboxone--;
				acc.setCash(acc.getCash() + 500);
				System.out.println("Xbox One sold for 500$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Xbox Ones in stock!");
			break;
			
		case "Wii U":
			if(wiiu > 0){
				wiiu--;
				acc.setCash(acc.getCash() + 250);
				System.out.println("Wii U sold for 250$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Wii Us in stock!");
			break;
			
		case "Nintendo Switch":
			if(nswitch > 0){
				nswitch--;
				acc.setCash(acc.getCash() + 299);
				System.out.println("Nintendo Switch sold for 299$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Nintendo Switches in stock!");
			break;
			
		case "Playstation Vita":
			if(vita > 0){
				vita--;
				acc.setCash(acc.getCash() + 299);
				System.out.println("Playstation Vita sold for 299$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Playstation Vitas in stock!");
			break;
			
		case "Nintendo 3DS":
			if(ds > 0){
				ds--;
				acc.setCash(acc.getCash() + 299);
				System.out.println("Nintendo 3DS sold for 299$, Current Balance:" + acc.getCash());}
			else
				System.out.println("No Nintendo 3DSes in stock!");
			break;
		}
	}

	@Override // toString method to return stock list and balance
	public String toString() {
		return  "Current Balance:" + acc.getCash()  + "\n" + "------Stock------" + "\n" +
				"Playstion 4: " + ps4 + "\n" + "Xbox One: " + 
				xboxone + "\n" +  "Wii U: " + wiiu + "\n" +  "Nintendo Switch: " + nswitch + "\n"
				+ "Playstation Vita: " + vita + "\n" + "Nintendo 3DS: " + ds + "\n" + "-----------------" + "\n";
	}
	
	

}
