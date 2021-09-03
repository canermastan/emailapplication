package emailApp;

public class Main {
	public static void main(String[] args) {
		Email email = new Email("Caner", "Mastan");
	
		email.setAlternativeEmail("asdasdasd@javajavajava.com");
		
		email.setPassword("asd");
		email.showInfo();
		
	}

}
