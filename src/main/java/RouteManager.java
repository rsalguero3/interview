import Services.Komoot;
import Services.RWGPS;
import Services.Strava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RouteManager {

    public Strava stravaService = new Strava();
    public RWGPS rwgpsService = new RWGPS();
    public Komoot komootService = new Komoot();

    public List<String> getAllRoutes(){
        List<String> stravaRoutes = stravaService.getRoutes();
        List<String> rwgpsRoutes = rwgpsService.getRoutes();
        List<String> komootRoutes = komootService.getRoutes();

        return Stream.of(stravaRoutes, rwgpsRoutes, komootRoutes)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<String> getUniqueRoutes(){
        List<String> stravaRoutes = stravaService.getRoutes();
        List<String> rwgpsRoutes = rwgpsService.getRoutes();
        List<String> komootRoutes = komootService.getRoutes();

        Set<String> set = new LinkedHashSet<>(stravaRoutes);
        set.addAll(rwgpsRoutes);
        set.addAll(komootRoutes);
        return new ArrayList<>(set);
    }

    public List<String> getUserRoutes(String userId){

        List<String> stravaRoutes = stravaService.getModifyRouteList(userId);
        List<String> rwgpsRoutes = rwgpsService.getModifyRouteList(userId);
        List<String> komootRoutes = komootService.getModifyRouteList(userId);

        return Stream.of(stravaRoutes, rwgpsRoutes, komootRoutes)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<String> getUserRoutesByService(String userId, String [] services){
        ArrayList<String> routes = new ArrayList<>();

        for (int i = 0; i < services.length; i++){
            switch (services[i]){
                case "Strava":
                    routes.addAll(stravaService.getModifyRouteList(userId));
                    break;
                case "RWGPS":
                    routes.addAll(rwgpsService.getModifyRouteList(userId));
                    break;
                case "Komoot":
                    routes.addAll(komootService.getModifyRouteList(userId));
                    break;
            }
        }
        return routes;
    }
}
