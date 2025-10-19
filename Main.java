package library;

public class Main {
    public static void main(String[] args) {
        Item book = new Book("Мастер и Маргарита", "М. Булгаков", 1967, 480, "Роман");
        Item magazine = new Magazine("National Geographic", "Редакция", 2024, 145, "Ежемесячно");
        Item dvd = new DVD("Интерстеллар", "К. Нолан", 2014, 169, "Кристофер Нолан");

        Item[] items = { book, magazine, dvd };

        for (Item item : items) {
            System.out.println(item.toString());
        }

        System.out.println();
        book.borrowItem();
        book.returnItem();
    }
}
