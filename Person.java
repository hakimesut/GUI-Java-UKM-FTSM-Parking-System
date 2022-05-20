
public class Person {
	public String Name;
	public String Id;
	public String Job;
	
	
	public Person(String n,String i,String j) {
		Name=n;
		Id=i;
		Job=j;
		
	}
	public void setName(String n) {
		Name=n;
	}
	public void setId(String i) {
		Id=i;
	}
	public void setJob(String j) {
		Job=j;
	}
	public String getName() {
		return Name;
	}
	public String getJob() {
		return Job;
	}
	public String getId() {
		return Id;
	}
	class Student extends Person{
		public Student(String n,String i,String j) {
			super(n,i,j);
		}
		 public String getStudent() {
			return Name+" "+Id+" "+Job;
		}
	}
	class Staff extends Person{
		public Staff (String n,String i,String j) {
			super(n,i,j);
		}
		String getordinary() {
			return Name+" "+Id+" "+Job;
		}
		String getmanagement() {
			return Name+" "+Id+" "+Job;
		}
	}
	
}


