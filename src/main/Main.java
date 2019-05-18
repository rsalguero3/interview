public class Main {

    public static void main(String[] args) {
        RouteManager routeManager = new RouteManager();

        System.out.println("All Routes: " + routeManager.getAllRoutes());
        System.out.println("Unique Routes: " + routeManager.getUniqueRoutes());
        System.out.println("For User 42: " + routeManager.getUserRoutes("42"));
        System.out.println("For User 42 services " +
                routeManager.getUserRoutesByService("42", new String[]{"Komoot", "RWGPS"}));
    }
}

