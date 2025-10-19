public class DVD extends Item {
    private int duration;
    private String director;

    public DVD(String title, String author, int year, int duration, String director) {
        super(title, author, year);
        setDuration(duration);
        setDirector(director);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            throw new IllegalArgumentException("Некорректная длительность");
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director != null && !director.isEmpty()) {
            this.director = director;
        } else {
            throw new IllegalArgumentException("Режиссёр не может быть пустым");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Длительность: " + duration + " мин" +
               ", Режиссёр: " + director;
    }
}
