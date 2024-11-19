class Person {
    private String name;
    public int height;

    // Конструктор для инициализации имени и роста
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Человек с именем " + name + " и ростом " + height;
    }
}

class Personn {
    private Name name;
    public int height;

    public Personn(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Человек с именем " + name + " и ростом " + height;
    }

    // Геттер для имени
    public Name getName() {
        return name;
    }
}
