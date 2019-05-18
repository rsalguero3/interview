import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RouteManagerTest {

    @Test
    public void getAllRoutes() {
        RouteManager routeManager = new RouteManager();

        List<String> routes = new ArrayList<>();
        routes.add("SRT");
        routes.add("CVT");
        routes.add("Perkiomen");
        routes.add("CVT");
        routes.add("Perkiomen");
        routes.add("Welsh Mountain");
        routes.add("SRT");
        routes.add("Welsh Mountain");
        routes.add("Oaks to Philly");

        Assert.assertEquals(routes, routeManager.getAllRoutes());
    }

    @org.junit.Test
    public void getUniqueRoutes() {
        RouteManager routeManager = new RouteManager();

        List<String> routes = new ArrayList<>();
        routes.add("SRT");
        routes.add("CVT");
        routes.add("Perkiomen");
        routes.add("Welsh Mountain");
        routes.add("Oaks to Philly");

        Assert.assertEquals(routes, routeManager.getUniqueRoutes());
    }

    @org.junit.Test
    public void getUserRoutes() {
        RouteManager routeManager = new RouteManager();

        List<String> routes = new ArrayList<>();
        routes.add("42SRT");
        routes.add("42CVT");
        routes.add("42Perkiomen");
        routes.add("CVT42");
        routes.add("Perkiomen42");
        routes.add("Welsh Mountain42");
        routes.add("42SRT42");;
        routes.add("42Welsh Mountain42");
        routes.add("42Oaks to Philly42");

        Assert.assertEquals(routes, routeManager.getUserRoutes("42"));
    }

    @org.junit.Test
    public void getUserRoutesByService() {
        RouteManager routeManager = new RouteManager();

        List<String> routes = new ArrayList<>();
        routes.add("42SRT42");
        routes.add("42Welsh Mountain42");
        routes.add("42Oaks to Philly42");
        routes.add("CVT42");
        routes.add("Perkiomen42");
        routes.add("Welsh Mountain42");

        Assert.assertEquals(routes, routeManager.getUserRoutesByService("42", new String[] {"Komoot", "RWGPS"}));
    }
}