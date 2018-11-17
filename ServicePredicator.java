import java.util.function.Predicate;

public class ServicePredicator implements Predicate<NameService> {
    private NameService nameService;

    public ServicePredicator(NameService nameService) {
        this.nameService = nameService;
    }
    @Override
    public boolean test(NameService ns) {
        return ns.equals(nameService);
    }

    @Override
    public String toString() {
        return "ServicePredicator{" +
                "nameService=" + nameService +
                '}';
    }
}
