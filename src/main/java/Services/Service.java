package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Service {

    /**
     * Creates a List based on the function passed in
     * @param routes List of routes to modify.
     * @param function A lambada expression telling how to modify each element in the list.
     * @return The modified List of routes.
     */
    public List<String> getModifyRouteList(List<String> routes, Function<String, String> function){
        return routes.stream().map(function)
                .collect(Collectors.toList());
    }
}