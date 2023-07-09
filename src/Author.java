import java.util.Objects;

public class Author {
    // класс для описания автора

    private String authorName; // имя автора
    private String authorSurname; // фамилия автора

    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        // переопределение метода toString для корректного вывода данных об авторе

        return "Имя автора: " + getAuthorName() + "\nФамилия автора: " + getAuthorSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    public String getAuthorName(){
        // геттер для имени автора
        return this.authorName;
    }

    public void setAuthorName(String authorName){
        // сеттер для имени автора
        this.authorName = authorName;
    }

    public String getAuthorSurname(){
        // геттер для фамилии автора
        return this.authorSurname;
    }

    public void setAuthorSurname(String authorSurname){
        // сеттер для фамилии автора
        this.authorSurname = authorSurname;
    }


}
