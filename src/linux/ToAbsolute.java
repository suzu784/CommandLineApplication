package linux;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ToAbsolute {
	public static void main(String[] args) {
		Path path = Paths.get("");
		String directoryName = path.toAbsolutePath().toString();
		System.out.println("Current Working Directory is = " + directoryName);
	}
}
