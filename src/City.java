import java.util.ArrayList;
import java.util.List;
class City {
    public String name; // город
    public List<Route> routes; // Список маршрутов

    // Конструктор для создания города с названием
    public City(String name) {
        this.name = name;
        this.routes = new ArrayList<>();
    }

    // Новый конструктор для создания города с названием и маршрутами
    public City(String name, List<Route> routes) {
        this.name = name;
        this.routes = new ArrayList<>(routes);
    }

    public String getName() {
        return name;
    }

    public void addRoute(City destination, double cost) {
        routes.add(new Route(destination, cost));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (Route route : routes) {
            sb.append("  ").append(route).append("\n");
        }
        return sb.toString();
    }
}