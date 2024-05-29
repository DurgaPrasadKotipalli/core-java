package com.se11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEnhancements {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/content.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        String newFileContent = fileContent.replace("sachin", "Sachin Tendulkar");
        Path newFilePath = Paths.get("./resources/content2.txt");
        Files.writeString(newFilePath, newFileContent);
    }
}
