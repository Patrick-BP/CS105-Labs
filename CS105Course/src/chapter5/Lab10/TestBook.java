package chapter5.Lab10;

public class TestBook {

	public static void main(String[] args) {
		Book bookobj = new Book("Java for Beginers", "Patrick");
		
		bookobj.setQuatity(10);
		bookobj.setPrice(50.6);
		
		bookobj.writeOutup();
		bookobj.totalPrice();
		

	}

}
