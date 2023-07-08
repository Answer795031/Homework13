public class Main {

    public static void main(String[] args) {

        // создаем объекты levTolstoy и warAndPeace
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);

        // создаем объекты joanneRowling и harryPotter
        Author joanneRowling = new Author("Джоан", "Роулинг");
        Book harryPotter = new Book("Гарри Поттер и философский камень", joanneRowling, 1997);
        // Вызов методов

        System.out.println("\nКнига: \"" + warAndPeace.getBookName() + "\"\nГод публикации: " + warAndPeace.getYear()
                + "\nАвтор: " + warAndPeace.getAuthor());

        System.out.println("\nКнига: \"" + harryPotter.getBookName() + "\"\nГод публикации: " + harryPotter.getYear()
                + "\nАвтор: " + harryPotter.getAuthor());

        harryPotter.setYear(2000);
        // изменяем год публикации (Марти Макфлай, перестань баловаться) с помощью сеттера

        System.out.println("\nКнига: \"" + harryPotter.getBookName() + "\"\nГод публикации: " + harryPotter.getYear()
                + "\nАвтор: " + harryPotter.getAuthor());

    }
}