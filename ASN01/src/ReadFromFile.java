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

	private static final String FILENAME ="testfile.txt";// the name of the file to be read from the local directory
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File f = new File(FILENAME);
			br = new BufferedReader(new FileReader(f));//creates new reader to read from the file
			//may throw a FNF exception
			String line;
			while((line = br.readLine())!=null){ //assigns the next available line to the line String variable until end of file
				//may throw IO exception
				System.out.println(line);//writes the line to console
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close(); // buffered readers and writers must be closed after use
				//may throw IO exception
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
