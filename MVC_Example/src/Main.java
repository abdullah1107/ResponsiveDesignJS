public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		model.addObserver(view);
		model.setUserName("Badhon");
		model.setEmail("badhon@gmail.com");
		model.setRoll(12344);

	}

}
