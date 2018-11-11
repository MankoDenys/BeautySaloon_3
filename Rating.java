public class Rating {
    private int summRat = 0;
    private int quantity = 0;

    public Rating() {
        this.summRat = summRat;
        this.quantity = quantity;
    }

    public int getSummRat() {
        return summRat;
    }

    public int getNumber() {
        return quantity;
    }

    public int averageRating() {
        if (quantity == 0) {
            throw new IllegalStateException("No marks");
        }
        return summRat / quantity;
    }

    public void addMark(int mark) {
        summRat += mark;
        quantity++;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "summRat=" + summRat +
                ", quantity=" + quantity +
                '}';
    }
}
