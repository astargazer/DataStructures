import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *This reads from a file in the local directory called testfile.txt
 *and writes to the console.
 *@Author Anna Mikesell Grossman
 */
public class ReadFromFile {

	private static final String FILENAME ="testfile.txt";
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File f = new File(FILENAME);
			br = new BufferedReader(new FileReader(f));
			String line;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
