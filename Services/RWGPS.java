package Services;

import Interface.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RWGPS implements Service {
    List<String> routes = new ArrayList<>(Arrays.asList("CVT", "Perkiomen", "Welsh Mountain"));

    /**
     * Creates a List with id appended to routes.
     * @param id String of id user.
     * @return Returns a List of routes with the id appended onto the route.
     */
    @Override
    public List<String> modifyRouteList(String id) {
        List<String> modifiedList = new ArrayList<>();
        for (String route: routes){
            modifiedList.add(route + id);
        }
        return modifiedList;
    }
}
