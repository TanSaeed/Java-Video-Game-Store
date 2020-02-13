package nintendo;

import consolefactory.*;

public class Nintendo extends ConsoleFactory {//used to override abstract class ConsoleFactory so respective 
											  //console can be gotten 

	@Override
	public HandheldConsole getHandheldConsole() {
		// TODO Auto-generated method stub
		return new Nintendo3DS();
	}

	@Override
	public HomeConsole getHomeConsole() {
		// TODO Auto-generated method stub
		return new WiiU();
	}

	@Override
	public HybridConsole getHybridConsole() {
		// TODO Auto-generated method stub
		return new NintendoSwitch();
	}

}
