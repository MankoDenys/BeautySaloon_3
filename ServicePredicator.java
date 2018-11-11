import java.util.function.Predicate;

public class ServicePredicator implements Predicate<Service> {
    private NameService nameService;

    public ServicePredicator(NameService nameService) {
        this.nameService = nameService;
    }
    @Override
    public boolean test(Service service) {
        return service.getNameService().compareTo(nameService) == 0;
    }
}
