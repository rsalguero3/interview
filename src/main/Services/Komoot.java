package Services;


import Interface.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Komoot implements Service {
    private List<String> routes = new ArrayList<>(Arrays.asList("SRT", "Welsh Mountain", "Oaks to Philly"));

    /**
     * Creates a List with id prepended and appended to routes.
     * @param id String of id user.
     * @return Returns a List of routes with the id prepended and appended onto the route.
     */
    @Override
    public List<String> getModifyRouteList(String id) {
        List<String> modifiedList = new ArrayList<>();
        for (String route: routes){
            modifiedList.add(id + route + id);
        }
        return modifiedList;
    }

    public List<String> getRoutes() {
        return routes;
    }
}
