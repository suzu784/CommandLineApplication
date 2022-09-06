package linux;

public class GetProperty {
	public static void main(String[] args) {
		String directoryName = System.getProperty("user.dir");
		System.out.println("Current Working Directory is " + directoryName);
	}
}
