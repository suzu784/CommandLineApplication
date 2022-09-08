package linux;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File dir = new File("");
		
		File[] list = dir.listFiles();
		
		if(list != null) {
			for(int i = 0; i < list.length; i++) {
				if(list[i].isFile()) {
					System.out.println("ファイルです : " + list[i].toString());
				}
				else if(list[i].isDirectory()) {
					System.out.println("ディレクトリです : " + list[i].toString());
				}
			}
		} else {
			System.out.println("null");
		}
	}
}
