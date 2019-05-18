package Services;

import Interface.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Komoot implements Service {
    List<String> routes = new ArrayList<>(Arrays.asList("SRT", "Welsh Mountain", "Oaks to Philly"));

    @Override
    public void modifyRouteList(String id) {

    }
}
