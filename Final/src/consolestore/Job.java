package consolestore;


public class Job { 
	
	public enum Staff { //enums used for staff and there respective job
		Kazi("Cashier"),
		Zae("Inventory Manager"),
		Brando("Warehouse Importer"),
		Syed("Accountant");
		
		private String name;
		Staff(String n)
		{
			this.name = n;
		}
		
		public String getJob()
		{
			return name;
		}	
	}	
	
	private Staff staff;
	   
	public Job(Staff s)
	{
		this.staff = s;
	}
	
	public Staff getStaff()
	{
		return staff;
	}
	
}
