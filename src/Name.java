class Name {
    private String firstName;
    private String surname;
    private String patronymic;

    // Конструктор для инициализации всех параметров
    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    // Конструктор для имени без фамилии и отчества
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Конструктор для имени с фамилией и личным именем
    public Name(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    // Метод для получения строкового представления имени
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (surname != null && !surname.isEmpty()) {
            sb.append(surname).append(" ");
        }
        if (firstName != null && !firstName.isEmpty()) {
            sb.append(firstName).append(" ");
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            sb.append(patronymic);
        }
        return sb.toString().trim();
    }
}
