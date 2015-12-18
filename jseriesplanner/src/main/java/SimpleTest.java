import com.omertron.thetvdbapi.TheTVDBApi;
import com.omertron.thetvdbapi.model.Series;

import java.util.List;

public class SimpleTest {
    public static void main(String[] args) throws Exception{
        TheTVDBApi tvDB = new TheTVDBApi("318F652C7CDB567A");
        List<Series> series = tvDB.searchSeries("ray", "en");
        for(final Series s : series){
            System.out.println(s.getSeriesName());
        }
    }
}
