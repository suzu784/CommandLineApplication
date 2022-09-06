package linux;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {
	public static void main(String[] args) {
		Path path = Paths.get("");
		String directoryName = path.toAbsolutePath().normalize().toString();
		System.out.println("Current Working Directory is = " + directoryName);
	}
}
