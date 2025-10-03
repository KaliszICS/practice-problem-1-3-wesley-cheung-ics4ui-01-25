import java.io.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String readFile(String filename) {
		FileReader inputStream = null;
		try {
			inputStream = new FileReader(filename);
			int c;
			String result = "";
			while ((c = inputStream.read())!=-1) {
				result = result + (char)c;
			}
			return result;
		}
		catch (IOException e) {
			return "-1";
		}
	}
	public static String backwardsReadFile(String filename) {
		FileReader inputStream = null;
		try {
			inputStream = new FileReader(filename);
			int c;
			String result = "";
			String store = "";
			while ((c = inputStream.read())!=-1) {
				result = result + (char)c;
			}
			for (int i = 0;i<result.length();i++) {
				store = store + result.charAt(result.length()-1-i);
			}
			return store;
		}

		catch (IOException e) {
			return "-1";
		}
	}

	

}
