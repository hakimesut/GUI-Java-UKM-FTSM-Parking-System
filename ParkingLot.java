
public class ParkingLot {
	public String Location;
	public String Type;
	
	
	public ParkingLot(String l,String t) {
		Location=l;	
		Type=t;
		
	}
	public void setLocation(String l) {
		Location=l;
	}
	
	public void setType(String t) {
		Type=t;
	}
	
	public String getLocation() {
		return Location;
	}
	
	public String getType() {
		return Type;
	}
	public String CarLot() {
		return Location+" "+Type;
	}
	
	public String StaffLot() {
		return Location+" "+Type;
	}
	public String ManagerLot()	{
		return Location+" "+Type;
	}
	public String MotorcycleLot() {
		return Location+" "+Type;
	}
}


