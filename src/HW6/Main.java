package HW6;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        getMails();
    }
    @SneakyThrows
    public static void getMails(){
        Path source = Paths.get("src/HW6/emails.txt");
        Path result = Paths.get("src/HW6/result.txt");

        try(
            BufferedReader reader = Files.newBufferedReader(source);
            BufferedWriter writer = Files.newBufferedWriter(result);
        ){
            String string;
            while ((string = reader.readLine()) != null){
                if (string.endsWith("@gmail.com")){
                    String[] split = string.split("\\s+");
                    writer.write(split[split.length-1]);
                    writer.newLine();
                }
            }
        }
    }
}
