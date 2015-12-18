package seriesplanner.api;

import seriesplanner.api.models.Show;

import java.util.List;

public interface ShowsService {
    List<Show> searchShows(String name);
}
