package consolestore;

//Account class is used to store the money in a given store

public class Account<T extends Number> { //account that uses a generic that limits it only to number class,
										// this is so a currency that is not a dollar can be used ie Yens or Rupees
	private T cash;
	private String currency = null;
	
	public Account(T cash, String currency) {
		super();
		this.cash = cash;
		this.currency = currency;
	}

	public T getCash() {
		return cash;
	}

	public void setCash(T cash) {
		this.cash = cash;
	}
	
	public String getCurrency(){
		return currency;
	}

}
