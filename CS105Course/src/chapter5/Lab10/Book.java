package chapter5.Lab10;

public class Book {
	
	private String title,
	author;
	private double price;
	private int quatity;
	
	public Book(String title, String author, double price, int quatity ) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.quatity = quatity;
		
	}
	public Book(String title, String author ) {
		
		this.title = title;
		this.author = author;
		
		
	}
public Book(){
	
		
	}
	public double totalPrice() {
		double totalP = price * quatity;
		System.out.println("The Total Price is: " +totalP);
		return totalP;
	}
	
	public String writeOutup() {
		String res = "\nTitle: " + title+ "\nAuthor: " + author + "\nPrice: " + price + "\nQuatity: " +quatity + "\n";
		System.out.println(res);
		return res;
			
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
