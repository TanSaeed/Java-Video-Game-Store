package microsoft;

import consolefactory.*;


public class Microsoft extends ConsoleFactory { //used to override abstract class ConsoleFactory so respective 
												//console can be gotten 
	@Override
	public HandheldConsole getHandheldConsole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HomeConsole getHomeConsole() {
		// TODO Auto-generated method stub
		return new XboxOne();
	}

	@Override
	public HybridConsole getHybridConsole() {
		// TODO Auto-generated method stub
		return null;
	}

}
