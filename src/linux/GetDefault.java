package linux;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class GetDefault {
	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("");
		String directoryName = path.toAbsolutePath().toString();
		System.out.println("Current Working Directory is = " + directoryName);
	}
}
