package Services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class RWGPS extends Service {
    public List<String> routes = new ArrayList<>(Arrays.asList("CVT", "Perkiomen", "Welsh Mountain"));

    /**
     * Creates a List with id appended to routes.
     * @param id String of id user.
     * @return Returns a List of routes with the id appended onto the route.
     */
    public List<String> getModifyRouteList(String id) {
        Function<String, String> pattern = (s) -> s + id;
        return super.getModifyRouteList(routes, pattern);
    }

    public List<String> getRoutes() {
        return routes;
    }
}
