package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fileToRead=Paths.get("./Directory/readFile");
		
		List<String> data=List.of("Apple","Orange","Grapes");
		Files.write(fileToRead, data);
		
	}

}
