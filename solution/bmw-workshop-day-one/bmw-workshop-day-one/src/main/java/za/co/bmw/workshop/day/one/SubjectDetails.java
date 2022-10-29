package za.co.bmw.workshop.day.one;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class SubjectDetails  {
    public static String readFile() {

        String filePath = Objects.requireNonNull(SubjectDetails.class.getClassLoader().getResource("coursedetails.json")).getPath();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream
                     = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8))
        {
            //Read the content with Stream
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String fileContent = contentBuilder.toString();
        return fileContent;

    }
}
