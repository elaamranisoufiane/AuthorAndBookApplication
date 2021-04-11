package authorbook;

public abstract class Book {
	 String title;
	 Author author;
	 float sellingPrice;
	 int quantitySold;
	public  Book() {
		 
	}
	public Book(String title, Author author, float sellingPrice) throws IllegalArgumentException{
		super();
		this.title = title;
		this.author = author;
		this.sellingPrice = sellingPrice;
		this.quantitySold=0;
	}
	public void setTitle(String title) throws IllegalArgumentException{
		if (title.isEmpty()) {
			throw new IllegalAccessError();
		}
		this.title = title;
	}
	public void setSellingPrice(float sellingPrice) throws IllegalArgumentException{
		if (sellingPrice == 0) {
			throw new IllegalAccessError();
		}
		this.sellingPrice = sellingPrice;
	}
	public void setQuantitySold(int quantitySold) throws IllegalArgumentException{
		if (quantitySold < 0) {
			throw new IllegalAccessError();
		}
		this.quantitySold = quantitySold;
	}
	public String getTitle() {
		return title;
	}
	public abstract float  calcRoyalties();
	
	@Override
	public String toString() {
		return  title + " by " + author + ", Selling Price: " + sellingPrice + ", Quantity Sold: "
				+ quantitySold ;
	}
	
	
	

}
