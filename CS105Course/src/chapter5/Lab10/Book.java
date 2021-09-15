package chapter5.Lab10;
public class Book {
	
	private String title, author;
	private double price;
	private int quatity;
	
	public Book(String title, String author, double price, int quatity ) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.quatity = quatity;
		
	}
	
	public Book(){
		title = "Java of Beginers";
		author = "Patrick";
		price = 0.0;
		quatity = 0;
		
	}
	public double totalPrice() {
		double totalP = price * quatity;
		System.out.println("The Total Price is: " +totalP);
		return totalP;
	}
	
	public String writeOutup() {
		return  "\nTitle: " + title+ "\nAuthor: " + author + "\nPrice: " + price + "\nQuatity: " +quatity + "\n";
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	

}
