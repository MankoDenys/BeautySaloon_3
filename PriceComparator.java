import java.util.Comparator;

public class PriceComparator implements Comparator<Service> {
    @Override
    public int compare(Service serv1, Service serv2) {
        return Long.compare(serv1.getPrice(), serv2.getPrice());
    }
}
