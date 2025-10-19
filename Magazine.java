public class Magazine extends Item {
    private int issueNumber;
    private String frequency;

    public Magazine(String title, String author, int year, int issueNumber, String frequency) {
        super(title, author, year);
        setIssueNumber(issueNumber);
        setFrequency(frequency);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0) {
            this.issueNumber = issueNumber;
        } else {
            throw new IllegalArgumentException("Некорректный номер выпуска");
        }
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        if (frequency != null && !frequency.isEmpty()) {
            this.frequency = frequency;
        } else {
            throw new IllegalArgumentException("Частота не может быть пустой");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Выпуск №: " + issueNumber +
               ", Частота: " + frequency;
    }
}
