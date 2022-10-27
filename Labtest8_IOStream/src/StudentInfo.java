
public class StudentInfo {
	private String name;
    private String id;
    private String contact;
	
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   public StudentInfo(String name, String id, String contact) {
		super();
		this.name = name;
		this.id = id;
		this.contact = contact;
	}
   
   public String getName() {
	return name;
    }
   public void setName(String name) {
	this.name = name;
    }
   public String getId() {
	return id;
    }
   public void setId(String id) {
	this.id = id;
    }
   public String getContact() {
	return contact;
    }
   public void setContact(String contact) {
	this.contact = contact;
    }
}
