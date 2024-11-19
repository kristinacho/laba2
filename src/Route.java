class Route {//маршрут между городами
    private City destination; // Город назначения
    private double cost; // Стоимость поездки
//констрктор для создания нового маршрута
    public Route(City destination, double cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public String toString() {
        return destination.getName() + ": " + cost;
    }
}
