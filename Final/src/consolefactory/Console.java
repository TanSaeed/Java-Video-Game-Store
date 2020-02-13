package consolefactory;

public class Console { //this will be the superclass that all other consoles will derive from
	protected String cname;
	
	public Console(String cname){
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return cname;
	}
}
