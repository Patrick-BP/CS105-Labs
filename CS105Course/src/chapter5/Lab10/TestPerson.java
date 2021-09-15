package chapter5.Lab10;
public class TestPerson {

	public static void main(String[] args) {
		
		PersonAddress personInfo = new PersonAddress();
		System.out.println("\n--------- Defalt Constructor -----------------\n");
		System.out.println(personInfo);
		System.out.println("\n--------- Defalt Parameterized Constructor -----------------\n");
		
		personInfo.setFirstName("Patrick ");
		personInfo.setlastName("Bihizi");
		personInfo.setEmail("papybp@gmail.com");
		personInfo.setTelNumber("4692150557");

		System.out.println(personInfo);
		
		System.out.println("\n--------- Validating Parameterized Constructor -----------------\n");
		
		PersonAddress personInfo2 = new PersonAddress();
		personInfo2.setFirstName("Patrick");
		personInfo2.setlastName("Bihizi");
		personInfo2.setEmail("papybpgmailcom");
		personInfo2.setTelNumber("4692150557567456");
		
		System.out.println(personInfo2);
	}

}
