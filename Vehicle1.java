
public class Vehicle1 {
	public String vehicle;
	public String NoPlate;
	//public int Bilvehicle;
	
	public Vehicle1(String v,String n) {
		vehicle=v;
		NoPlate=n;
	//	Bilvehicle=b;
	}
	
	public  void setvehicle(String v) {
		vehicle=v;
	}
	public  void setNoplate(String n) {
		NoPlate=n;
	}
	//public void setBilvehicle(int b) {
	//	Bilvehicle=b;
	//}
	public String getvehicle() {
		return vehicle;
	}
	public String getNoPlate() {
		return NoPlate;
	}
//	public int getBilvehicle() {
//		return Bilvehicle;
	//}
	class bus extends Vehicle1{
		public bus(String v,String n) {
			super(v,n);
		}
		public String getbus() {
			return vehicle+" "+NoPlate;
		}
	}
	class car extends Vehicle1{
		public car(String v,String n) {
			super(v,n);	
		}
		public String getcar() {
			return vehicle+" "+NoPlate;
		}
	}
	class motorcycle extends Vehicle1{
		public motorcycle(String v,String n) {
			super(v,n);
		}
		public String getmotorcycle() {
			return vehicle+" "+NoPlate;
		}
	}
	class lorry extends Vehicle1{
		public lorry(String v,String n) {
			super(v,n);
		}
		public String getlorry() {
			return vehicle+" "+NoPlate;
		}
	}
}



