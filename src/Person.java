class Person {
    private Name name; // Имя человека
    int height; // Рост человека

    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name.name + ", рост: " + height; // Изменяем вывод на имя без фамилии и отчества
    }
    // Геттер для имени
    public Name getName() {
        return name;
    }
}