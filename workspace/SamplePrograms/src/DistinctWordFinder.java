import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class DistinctWordFinder {

	public static void main(String[] args) {
		DistinctWordFinder distinctWordFinder = new DistinctWordFinder();
		Map<String, List<String>> wordMap = distinctWordFinder.getDistinctWords("C:\\Users\\585728\\Desktop\\Sample.txt");
		for(Map.Entry<String, List<String>> entry: wordMap.entrySet()){
			if(entry.getKey().equals("distinctWordList")){
				System.out.println(entry.getKey());
				for(String distinctWord : entry.getValue()){
					System.out.println(distinctWord);
				}
			} else if(entry.getKey().equals("duplicateWordList")){
				System.out.println(" \n" + entry.getKey());
				for(String duplicateWord : entry.getValue()){
					System.out.println(duplicateWord);
				}
			}
		}
	}

	private Map<String, List<String>> getDistinctWords(String fileLocation) {
		FileInputStream fileInputStream = null;
		DataInputStream dataInputStream = null;
		BufferedReader bufferedReader = null;
		List<String> distinctWordList = new ArrayList<String>();
		List<String> duplicateWordList = new ArrayList<String>();
		Map<String, List<String>> wordMap = new HashMap<String, List<String>>();
		
		try {
			fileInputStream = new FileInputStream(fileLocation);
			dataInputStream = new DataInputStream(fileInputStream);
			bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
			
			String line = null;
				while((line = bufferedReader.readLine()) != null){
					StringTokenizer st = new StringTokenizer(line, " .!?");
					while(st.hasMoreTokens()){
						String temp = st.nextToken().toLowerCase();
						if(!distinctWordList.contains(temp)){
							distinctWordList.add(temp);
						} else {
							duplicateWordList.add(temp);
						}
					}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufferedReader != null){
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		wordMap.put("distinctWordList", distinctWordList);
		wordMap.put("duplicateWordList", duplicateWordList);
		return wordMap;
	}
}
