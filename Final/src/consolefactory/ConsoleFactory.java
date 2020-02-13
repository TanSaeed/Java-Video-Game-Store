package consolefactory;

public abstract class ConsoleFactory { //used with outlet to get respective getters since outlet will not be abstract
	public abstract HandheldConsole getHandheldConsole(); // (composition relationship with ConsoleOutlet)
	public abstract HomeConsole getHomeConsole();
	public abstract HybridConsole getHybridConsole();
}
