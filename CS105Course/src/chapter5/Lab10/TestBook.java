package chapter5.Lab10;
public class TestBook {

	public static void main(String[] args) {
		Book bookobj = new Book();
		
		System.out.println(bookobj.getPrice());
		System.out.println(bookobj.getQuatity());
		
		bookobj.setQuatity(10);
		bookobj.setPrice(50.6);
		
		System.out.println(bookobj.writeOutup());
		bookobj.totalPrice();

	}

}
