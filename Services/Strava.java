package Services;

import Interface.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strava implements Service {
    List<String> routes = new ArrayList<>(Arrays.asList("SRT", "CVT", "Perkiomen"));

    /**
     * Creates a List with id prepended to routes.
     * @param id String of id user.
     * @return Returns a List of routes with the id prepended onto the route.
     */
    @Override
    public List<String> modifyRouteList(String id) {
        List<String> modifiedList = new ArrayList<>();
        for (String route: routes){
            modifiedList.add(id + route);
        }
        return modifiedList;
    }
}
