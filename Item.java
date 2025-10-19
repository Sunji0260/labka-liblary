public class Item {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Item(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Автор не может быть пустым");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0 && year <= 2025) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Некорректный год");
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println(title + " взят.");
        } else {
            System.out.println(title + " недоступен.");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println(title + " возвращён.");
    }

    @Override
    public String toString() {
        return "Название: " + title +
               ", Автор: " + author +
               ", Год: " + year +
               ", Доступен: " + (available ? "Да" : "Нет");
    }
}
