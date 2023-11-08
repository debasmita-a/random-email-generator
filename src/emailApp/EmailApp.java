package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		
		System.out.println(em1.showInfo());
		
		em1.setPassword("Truthwitch@23!");
		System.out.println("New password: " + em1.getPassword());

	}

}
