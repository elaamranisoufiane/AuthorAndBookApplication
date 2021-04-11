package authorbook;

public class Author {
	 String name;
	 String affiliation;
	 String emailAddress;
	//default and Overloaded constructors
	public Author() {
		 
	}

	public Author(String name, String affiliation, String emailAddress) {
		super();
		this.name = name;
		this.affiliation = affiliation;
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() throws IllegalArgumentException{
		if (name.isEmpty() || affiliation.isEmpty() || emailAddress.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return "Author : name=" + name + ", affiliation=" + affiliation + ", emailAddress=" + emailAddress ;
	}
	

}
