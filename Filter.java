import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> listFilter = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (predicate.test(list.get(i)) == true) {
                listFilter.add(list.get(i));
            }
        }
        return listFilter;
    }
}
