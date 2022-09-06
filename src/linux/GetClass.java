package linux;

public class GetClass {
	String getCurrentDirectory() {
		return this.getClass().getClassLoader().getResource("").getPath();
	}
	
	public static void main(String[] args) {
		String directoryName = new GetClass().getCurrentDirectory();
		System.out.println("Current Working Directory is = " + directoryName);
	}
}
