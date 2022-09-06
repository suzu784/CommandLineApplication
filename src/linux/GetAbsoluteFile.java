package linux;

import java.io.File;

public class GetAbsoluteFile {
	public static void main(String[] args) {
		File file = new File("");
		String directoryName = file.getAbsoluteFile().toString();
		System.out.println("Current Working Directory is = " + directoryName);
	}
}
