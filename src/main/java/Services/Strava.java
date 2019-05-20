package Services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strava extends Service {
    public List<String> routes = new ArrayList<>(Arrays.asList("SRT", "CVT", "Perkiomen"));

    /**
     * Creates a List with id prepended to routes.
     * @param id String of id user.
     * @return Returns a List of routes with the id prepended onto the route.
     */
    public List<String> getModifyRouteList(String id) {
        return super.getModifyRouteList(id, routes, false, true);
    }

    public List<String> getRoutes() {
        return routes;
    }
}
