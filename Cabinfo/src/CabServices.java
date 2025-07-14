public class CabServices {
	public static void main(String args[]) {
		CabPassenger cp = new CabPassenger();
		cp.setname("Pratik");
		cp.setPickupLocation("Null Stop");
		cp.setDropLocation("Railway Station");
		cp.setTravelTime(10);
		cp.setMobNumber(6465140);
		
		System.out.println(cp.getname());
		System.out.println(cp.getPickupLocation());
		System.out.println(cp.getDropLocation());
		System.out.println(cp.getTravelTime());
		System.out.println(cp.MobNumber());
		
	}

}
class CabPassenger{
	private String name;
	private String PickupLocation;
	private String DropLocation;
	private int TravelTime;
	private int MobNumber;
	
	void setname(String name)
	{
		this.name = name;
	}
	String getname()
	{
		return name;
	}
	
	void setPickupLocation(String PickupLocation)
	{
		this.PickupLocation = PickupLocation;
	}
	String getPickupLocation()
	{
		return PickupLocation;
	}
	
	void setDropLocation(String DropLocation)
	{
		this.DropLocation = DropLocation;
	}
	String getDropLocation()
	{
		return DropLocation;
	}
	
	void setTravelTime(int TravelTime)
	{
		this.TravelTime = TravelTime;
	}
	int getTravelTime()
	{
		return TravelTime;
	}
	
	void setMobNumber(int MobNumber)
	{
		this.MobNumber = MobNumber;
	}
	int MobNumber()
	{
		return MobNumber;
	}
}