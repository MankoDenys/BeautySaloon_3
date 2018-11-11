import java.util.function.Predicate;

public class ChoicePrice implements Predicate<Long> {
    private final long min;
    private final long max;

    public ChoicePrice(long min, long max) {
        this.min = min;
        this.max = max;
    }
    @Override
    public boolean test(Long n) {
        return n >= min && n <= max;
    }

}
