package sony;

import consolefactory.*;

public class Sony extends ConsoleFactory {//used to override abstract class ConsoleFactory so respective 
										  //console can be gotten 

	@Override
	public HandheldConsole getHandheldConsole() {
		// TODO Auto-generated method stub
		return new PlaystationVita();
	}

	@Override
	public HomeConsole getHomeConsole() {
		// TODO Auto-generated method stub
		return new Playstation4();
	}

	@Override
	public HybridConsole getHybridConsole() {
		// TODO Auto-generated method stub
		return null;
	}

}
