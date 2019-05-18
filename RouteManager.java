import Services.Komoot;
import Services.RWGPS;
import Services.Strava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RouteManager {

    private Strava stravaService = new Strava();
    private RWGPS rwgpsService = new RWGPS();
    private Komoot komootService = new Komoot();

    public List<String> getAllRoutes(String userId){

        List<String> stravaRoutes = stravaService.modifyRouteList(userId);
        List<String> rwgpsRoutes = rwgpsService.modifyRouteList(userId);
        List<String> komootRoutes = komootService.modifyRouteList(userId);

        return Stream.of(stravaRoutes, rwgpsRoutes, komootRoutes)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
