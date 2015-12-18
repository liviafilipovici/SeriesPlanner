package seriesplanner;

import org.junit.Test;
import static org.junit.Assert.*;

public class TvSeriesShowServiceTest {
    @Test
    public void shouldReturnEmptyListWhenPassingNullName() {
        TvSeriesShowService tvSeriesShowService = new TvSeriesShowService();
        assertEquals(tvSeriesShowService.findShows(null).size(), 0);
    }

    @Test
    public void shouldReturnPopulatedListWhenAtLeastOneOfTheShowsIsFound() {
        TvSeriesShowService tvSeriesShowService = new TvSeriesShowService();
        assertEquals(tvSeriesShowService.findShows("abc").size(), 10);
    }
}
