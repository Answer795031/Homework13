import java.util.Objects;

public class Book {
    // класс для описания книги

    private String bookName; // название книги
    private Author author;
    private int year; // год публикации

    public Book(String bookName, Author author, int year){
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        // переопределение метода toString для корректного вывода данных о книге

        return "\nКнига: \"" + getBookName() + "\"\nГод публикации: " + getYear() + "\n" + getAuthor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, year);
    }

    public String getBookName(){
        // геттер для названия книги
        return this.bookName;
    }

    public void setBookName(String bookName){
        // сеттер для названия книги
        this.bookName = bookName;
    }

    public Author getAuthor(){
        // геттер для автора
        return this.author;
    }

    public void setAuthor(Author author){
        // сеттер для автора
        this.author = author;
    }

    public int getYear(){
        // геттер для года публикации книги
        return this.year;
    }

    public void setYear(int year){
        // сеттер для года публикации книги
        this.year = year;
    }


}
