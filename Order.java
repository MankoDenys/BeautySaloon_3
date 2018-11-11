import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id = UUID.randomUUID().toString();
    private List<Service> services = new ArrayList<>();
    private List<Specialist> specialists = new ArrayList<>();
    private LocalDate date;
    private LocalTime time;

    public long getPrice() {
        long price = 0;
        for(Service service:services) {
            price += service.getPrice();
        }
        return price;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void addSpecialist(Specialist specialist) {
        specialists.add(specialist);
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", services=" + services +
                ", specialists=" + specialists +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
