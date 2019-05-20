package Services;

import java.util.ArrayList;
import java.util.List;

public class Service {
    /**
     * Creates a List of routes and id placed on the route name based on the append and prepend booleans
     * @param id String of id user
     * @param routes List of routes
     * @param append true, appends id to route name
     * @param prepend true, prepends id to route name
     * @return A List of routes with userid attached.
     */
    public List<String> getModifyRouteList(String id, List<String> routes, boolean append, boolean prepend){
        List<String> modifiedList = new ArrayList<>();
        for (String route: routes){
            if (prepend && append){
                modifiedList.add(id + route + id);
            }
            else if (prepend) {
                modifiedList.add(id + route);
            }
            else {
                modifiedList.add(route + id);
            }
        }
        return modifiedList;
    }
}