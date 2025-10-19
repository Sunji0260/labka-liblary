public class Book extends Item {
    private int pageCount;
    private String genre;

    public Book(String title, String author, int year, int pageCount, String genre) {
        super(title, author, year);
        setPageCount(pageCount);
        setGenre(genre);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        } else {
            throw new IllegalArgumentException("Некорректное количество страниц");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Жанр не может быть пустым");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Страниц: " + pageCount +
               ", Жанр: " + genre;
    }
}
