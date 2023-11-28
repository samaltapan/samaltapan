package main.java.assignment.com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnrichInputProcessFile {
	
	private String reverseInputAsciiChars(String line) {
		StringBuilder builder = new StringBuilder(line);
		return builder != null ? builder.reverse().toString() : "";
	}
	
	private void writeToOutputFile(List<String> lines) {
		Path tempDirectory = Path.of("C:\\assignment\\temp");
		StringBuilder result = new StringBuilder();
		try {
			
			Path filePath = Files.createTempFile(tempDirectory, "output", "result.txt");
			if(Objects.nonNull(lines) && lines.size()> 0) {
				lines.stream().forEach(line -> {
					result.append(line).append("\n");
				});
				try {
					Files.writeString(filePath, result.toString());
					System.out.println("Out put file Created on C:\\assignment\\temp");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> processInputFile(String path) {
		List<String> result = new ArrayList<>();
		if(path == null || path.equals("")) {
			System.out.print("Invalid file Path");
			return result;
		}
		Path filePath = Path.of(path);
		
		try {			
			List<String> fileContent = Files.readAllLines(filePath);
			if(Objects.nonNull(fileContent) && fileContent.size()> 0) {
				fileContent.stream().forEach(line -> {
					result.add(reverseInputAsciiChars(line));
				});
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(Objects.nonNull(result) && result.size()> 0) {
			writeToOutputFile(result);
		}
		return result;
	}
}



