package Services;

import Interface.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RWGPS implements Service {
    List<String> routes = new ArrayList<>(Arrays.asList("CVT", "Perkiomen", "Welsh Mountain"));

    @Override
    public void modifyRouteList(String id) {

    }
}
