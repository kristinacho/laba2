class Route {
    public City destination; // Город назначения
    public double cost; // Стоимость поездки

    public Route(City destination, double cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public String toString() {
        return destination.getName() + ": " + cost;
    }
}