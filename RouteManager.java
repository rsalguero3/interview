import Interface.Service;
import Services.Komoot;
import Services.RWGPS;
import Services.Strava;

public class RouteManager {

    Service[] services = {new Strava(), new RWGPS(), new Komoot()};


}
