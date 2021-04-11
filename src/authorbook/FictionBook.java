package authorbook;

public class FictionBook extends Book {
	 String targetAudience;

	// overloaded constructors
	public FictionBook() {

	}

	

	public FictionBook(String title, Author author)
			throws IllegalArgumentException {
		super(title, author, 100);
		this.targetAudience = "A";
	}



	public FictionBook(String title, Author author, float sellingPrice, String targetAudience)
			throws IllegalArgumentException {
		super(title, author, sellingPrice);
		this.targetAudience = targetAudience;
	}



	@Override
	public float calcRoyalties() {
		float royalties = 0;
		if (targetAudience.equals("A")) {
			royalties = ((sellingPrice*quantitySold)*5)/100;
		} else if (targetAudience.equals("C")) {
			royalties = ((sellingPrice*quantitySold)*7)/100;
		}
		return royalties;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+calcRoyalties();
	}

}
