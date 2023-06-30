package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryClassFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Files.list(Paths.get(".")).forEach(x->System.out.println(x));
		Path Direc=Paths.get(".");
		
	//Files.list(Direc).forEach(System.out::println);
//		Files.walk(Direc, 4).forEach(System.out::println);
		//Predicate<? super Path> predicate=path->String.valueOf(path).contains(".java");
	//Files.walk(Direc,4).filter(predicate).forEach(System.out::println);
BiPredicate<Path, BasicFileAttributes> matcher=(path,attribute)->String.valueOf(path).contains(".java");
		
		Files.find(Direc, 4, matcher).forEach(System.out::println);

		
		
		BiPredicate<Path, BasicFileAttributes> direcmatcher=(path,attributes)->attributes.isDirectory();
		//print directory
		Files.find(Direc,4, direcmatcher).forEach(System.out::println);;
	}

}
