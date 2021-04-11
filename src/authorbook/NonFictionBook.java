package authorbook;

public class NonFictionBook extends Book{
  int deweyClassfication ;
  //overloaded constr

  
  
  
  public NonFictionBook(String title, Author author, float sellingPrice, int deweyClassfication)
		throws IllegalArgumentException {
	super(title, author, sellingPrice);
	this.deweyClassfication = deweyClassfication;
}
  
public NonFictionBook(String title, Author author)
		throws IllegalArgumentException {
	super(title, author, 150);
	this.deweyClassfication = 0000;
}

@Override
public float calcRoyalties() {
	return ((sellingPrice*quantitySold)*10)/100;
}

@Override
	public String toString() {
		
		return super.toString()+" "+calcRoyalties();
	}


}
