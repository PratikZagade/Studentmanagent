public class BusServices {
	public static void main(String args[]) {
		BusPassenger bp = new BusPassenger();
		bp.setName("Pratik");
		bp.setSeatNo(12);
		bp.setRoute("Amravati to Pune");
		bp.setTravelDate(05022025);
		bp.setMobNumber(93072573);
		bp.setage(22);
		
		System.out.println(bp.getName());
		System.out.println(bp.getSeatNo());
		System.out.println(bp.getRoute());
		System.out.println(bp.TravelDate());
		System.out.println(bp.getMobNumber());
		System.out.println(bp.age());
		
		
		
	}

}
class BusPassenger{
	private String Name;
	private int SeatNo;
	private String Route;
	private int TravelDate;
	private int MobNumber;
	private int age;
	
	
	void setName(String Name)
	{
		this.Name = Name;
	}
	String getName()
	{
		return Name;
	}
	
	
	void setSeatNo(int SeatNo)
	{
		this.SeatNo = SeatNo;
	}
	int getSeatNo()
	{
		return SeatNo;
	}
	
	void setRoute(String Route) {
		this.Route = Route;
	}
	String getRoute()
	{
		return Route;
	}
	
	void setTravelDate(int TravelDate)
	{
		this.TravelDate = TravelDate;
	}
	int TravelDate()
	{
		return TravelDate;
	}
	
	
	void setMobNumber(int MobNumber)
	{
		this.MobNumber = MobNumber;
	}
	int getMobNumber()
	{
		return MobNumber;
	}
	void setage(int age)
	{
		this.age = age;
	}
	int age()
	{
		return age;
	}
	
	
	
}