package csvops;

import com.opencsv.*;
import com.opencsv.exceptions.CsvException;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadCSV {

    @Test
    public void readCSVTest() throws IOException, CsvException {
        //opencsv
        String filePath = "src/test/java/csvops/read.csv";

        ICSVParser csv = new CSVParserBuilder()
                .withSeparator(';')
                .build();
        CSVReader res = new CSVReaderBuilder(new FileReader(filePath))
                .withCSVParser(csv)
                .withSkipLines(1)
                .build();

        List<String[]> lst = res.readAll();

        for (int i = 0; i <= lst.size() - 1; i++) {
            String[] row = lst.get(i);
            for (String cell : row) {
                System.out.println(cell);
            }
        }
        res.close();
//
//
//        Map<String, String> result = new LinkedHashMap<>();
//
//        CSVReader reader = null;
//        reader = new CSVReaderBuilder(new FileReader(filePath))
//                .withSkipLines(1)
//                .build();
//        String[] nextLine;
//        while ((nextLine = reader.readNext()) != null) {
//            System.out.println(nextLine[0]);
//            System.out.println(nextLine[1]);
//            System.out.println(nextLine[2]);
//        }
//        reader.close();
    }
}
