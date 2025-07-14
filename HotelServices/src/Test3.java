public class Test3 {
	public static void main(String args[]) {
		HotelServices hs = new HotelServices();
		hs.setName("Pratik");
		hs.setEmail("pratikzagade7@gmail.com");
		hs.setAddress("Pune");
		hs.setStayDays(5);
		hs.setNumberOfGuests(10);
		
		System.out.println(hs.getName());
		System.out.println(hs.getEmail());
		System.out.println(hs.getAddress());
		System.out.println(hs.getStayDays());
		System.out.println(hs.getNumberOfGuests());
	}

}
class HotelServices
{
	private String Name;
	private String Email;
	private String Address;
	private int StayDays;
	private int NumberOfGuests;
	
	void setName(String Name) {
		this.Name = Name;
	}
	String getName()
	{
		return Name;
	}
	
	void setEmail(String Email) {
		this.Email = Email;
	}
	String getEmail()
	{
		return Email;
	}
	void setAddress(String Address) {
		this.Address = Address;
	}
	String getAddress()
	{
		return Address;
	}
	void setStayDays(int StayDays) {
		this.StayDays=StayDays;
	}
	int getStayDays()
	{
		return StayDays;
	}
	void setNumberOfGuests(int NumberOfGuests)
	{
		this.NumberOfGuests = NumberOfGuests;
	}
	int getNumberOfGuests()
	{
		return NumberOfGuests;
	}
	
}
