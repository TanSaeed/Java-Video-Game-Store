package consolestore;

import consolefactory.*;

//Console Outlet, used to return the right object depending on what consolefactory was used to create it

public class ConsoleOutlet {
	private HandheldConsole handheld;
	private HomeConsole home;
	private HybridConsole hybrid;
	
	public ConsoleOutlet(ConsoleFactory cf){
		handheld = cf.getHandheldConsole();
		home = cf.getHomeConsole();
		hybrid = cf.getHybridConsole();
		}
	
	public String orderHandheld(){
		return handheld.toString();
	}
	
	public String orderHome(){
		return home.toString();
	}
	
	public String orderHybrid(){
		return hybrid.toString();
	}
}
