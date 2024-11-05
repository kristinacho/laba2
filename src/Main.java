import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1.2. Человек
        System.out.println("Задание 1.2. Человек");

        // Создание объектов Name
        Name cleopatraName = new Name();
        cleopatraName.name = "Клеопатра";

        Name pushkinName = new Name();
        pushkinName.surname = "Пушкин";
        pushkinName.name = "Александр";
        pushkinName.patronymic = "Сергеевич";

        Name mayakovskiyName = new Name();
        mayakovskiyName.surname = "Маяковский";
        mayakovskiyName.name = "Владимир";

        Person cleopatra = new Person(cleopatraName, 152);
        Person pushkin = new Person(pushkinName, 167);
        Person vladimir = new Person(mayakovskiyName, 189);

        // Вывод информации о людях (Задание 1.2)
        System.out.println("Человек с именем \"" + cleopatra.getName().name + "\" и ростом " + cleopatra.height);
        System.out.println("Человек с именем \"" + pushkin.getName().name + "\" и ростом " + pushkin.height);
        System.out.println("Человек с именем \"" + vladimir.getName().name + "\" и ростом " + vladimir.height);

        // Задание 1.3. Имена
        System.out.println("\nЗадание 1.3. Имена");

        System.out.println(cleopatraName);
        System.out.println(pushkinName);
        System.out.println(mayakovskiyName);

        System.out.println("\nЗадание 2.2.Объединенный вывод:");

        System.out.println(cleopatra);
        System.out.println(pushkin.getName() + ", рост: " + pushkin.height);
        System.out.println(vladimir.getName() + ", рост: " + vladimir.height);

        // Задание 3.3. Города.
        System.out.println("\nЗадание 3.3. Города.");

        // Создание городов
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // маршруты между городами
        A.addRoute(B, 5);
        A.addRoute(D, 6);
        A.addRoute(F, 1);

        B.addRoute(A, 5);
        B.addRoute(F, 1);
        B.addRoute(C, 3);

        C.addRoute(B, 3);
        C.addRoute(D, 4);

        D.addRoute(C, 4);
        D.addRoute(A, 6);
        D.addRoute(E, 2);

        E.addRoute(D, 2);
        E.addRoute(F, 2);

        F.addRoute(A, 1);
        F.addRoute(E, 2);
        F.addRoute(B, 1);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

        // создание города с маршрутами
        List<Route> routesForNewCity = new ArrayList<>();
        routesForNewCity.add(new Route(B, 10));
        routesForNewCity.add(new Route(C, 15));

        City G = new City("G", routesForNewCity);
        System.out.println("\nНовый город:");
        System.out.println(G);

        System.out.println("\nЗадание 5.5.Дробь.");
        Fraction f1 = new Fraction(2, 6);
        Fraction f2 = new Fraction(7, 21);
        Fraction f3 = new Fraction(3, 4);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));

        Fraction result = f1.sum(f2).div(f3).minus(5);

        System.out.println("Результат: " + result);

    }
}