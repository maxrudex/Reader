package app;

public class Main {
    public static void main(String[] args) {
        String[] returnedBookNames = {"Высшая математика", "Квантовая физика"};
        Book[] returnedBooks = new Book[3];
        returnedBooks[0] = new Book();
        returnedBooks[1] = new Book("Азбука", "Неизвестно");
        returnedBooks[2] = new Book("Энциклопедия", "Авторов много");

        String[] takenBookNames = {"Основы Java"};
        Book[] takenBooks = new Book[1];
        takenBooks[0] = new Book("Философия Java", "Эккель");

        Reader reader = new Reader(12345, "Иванов И.А.");
        reader.returnBook(3);
        reader.returnBook(returnedBookNames);
        reader.returnBook(returnedBooks);

        reader.takeBook(2);
        reader.takeBook(takenBookNames);
        reader.takeBook(takenBooks);

    }
}