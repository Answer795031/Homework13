public class Main {

    public static void main(String[] args) {

        // создаем объекты levTolstoy и warAndPeace
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);

        // создаем объекты joanneRowling и harryPotter
        Author joanneRowling = new Author("Джоан", "Роулинг");
        Book harryPotter = new Book("Гарри Поттер и философский камень", joanneRowling, 1997);

        System.out.println(warAndPeace);
        System.out.println(harryPotter);

        System.out.println("\nХэш-код объекта warAndPeace: " + warAndPeace.hashCode());
        System.out.println("\nХэш-код объекта harryPotter: " + harryPotter.hashCode());

        System.out.println("\nПроверка объектов на равенство: " + warAndPeace.equals(harryPotter));

        harryPotter.setYear(2000);
        // изменяем год публикации (Марти Макфлай, перестань баловаться) с помощью сеттера

        System.out.println(harryPotter);

    }
}