package pojo;



public class Emp {
	private int cus_id;
	public static int key;
	private static String name,password,email,country;
	
	public int getKey() {
		System.out.println("this is get key..."+key);
		return key;
	}

	public void setKey(int key) {
		System.out.println("set key to "+ key);
		this.key = key;
	}


	/*public Emp(int key) {
		super();
		this.key = key;
	}*/
    
	public int getCus_id() {
		return cus_id;
	}


	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
