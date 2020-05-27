package csvops;

import com.opencsv.CSVWriter;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    @Test
    public void writeTest() throws IOException {
        String fileOutputPath = "src/test/java/csvops/write.csv";
        CSVWriter csvWriter = new CSVWriter(new FileWriter(fileOutputPath, false));

        String[] headerRecord = {"Name", "Email", "Phone", "Country"};
        csvWriter.writeNext(headerRecord);

        csvWriter.writeNext(new String[]{"Sundar Pichai ♥", "sundar.pichai@gmail.com", "+1-1111111111", "India"});
        csvWriter.writeNext(new String[]{"Satya Nadella", "satya.nadella@outlook.com", "+1-1111111112", "India"});

        csvWriter.close();
    }
}
