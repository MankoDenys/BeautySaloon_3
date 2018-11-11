import java.util.Comparator;
import java.util.List;

public class ComparableName implements Comparator<Specialist> {
    @Override
    public int compare(Specialist s1, Specialist s2) {
        return s1.getFullName().compareTo(s2.getFullName());
    }
}
