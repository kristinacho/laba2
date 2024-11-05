class Name {
    public String surname;    // Фамилия
    public String name;       // Имя
    public String patronymic; // Отчество

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (surname != null && !surname.isEmpty()) {
            sb.append(surname).append(" ");
        }
        if (name != null && !name.isEmpty()) {
            sb.append(name);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            sb.append(" ").append(patronymic);
        }
        return sb.toString().trim();
    }
}