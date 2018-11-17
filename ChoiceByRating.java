import java.util.function.Predicate;

public class ChoiceByRating implements Predicate<Specialist> {
    private final int min;
    private final int max;

    public ChoiceByRating(int min, int max) {
        this.min = min;
        this.max = max;
    }
    @Override
    public boolean test(Specialist specialist) {
        return specialist.getRating() >= min && specialist.getRating() <= max;
    }

    @Override
    public String toString() {
        return "ChoicePrice{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
