package csvops;

import com.opencsv.bean.CsvToBeanBuilder;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCSVBean {
    @Test
    public void beanTest() throws FileNotFoundException {
        //opencsv
        String filePath = "src/test/java/csvops/read.csv";
        List<Visitors> visitorsList = new CsvToBeanBuilder(new FileReader(filePath))
                .withSeparator(';')
                .withSkipLines(1)
                .withType(Visitors.class).build().parse();

        System.out.println(visitorsList.get(0).getsNo());

        List<Visitors> result = visitorsList
                .stream()
                .filter(x->x.getFirstName().trim().equalsIgnoreCase("naidu"))
                .collect(Collectors.toList());

        System.out.println(result.get(0).getsNo());
        System.out.println(result.get(0).getFirstName());
        System.out.println(result.get(0).getLastName());

    }
}
