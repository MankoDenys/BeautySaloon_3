import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Service extends CategoryService{
    private NameService nameService;
    private long price;
    private LocalTime leadTime;
    private String description;
//    private Map<LocalDate, Schedule> dateToSchedule = new LinkedHashMap<>();

    public Service(GeneralNameService generalNameService, NameService nameService, long price, LocalTime leadTime, String description) {
        super(generalNameService);
        this.nameService = nameService;
        this.price = price;
        this.leadTime = leadTime;
        this.description = description;

    }

    public NameService getNameService() {
        return nameService;
    }

    public long getPrice() {
        return price;
    }

    public LocalTime getLeadTime() {
        return leadTime;
    }

    public String getDescription() {
        return description;
    }


//    public Schedule getScheduleForDate(LocalDate date) {
//
//    }


    @Override
    public String toString() {
        return "Service{" +
                "nameService=" + nameService +
                ", price=" + price +
                ", leadTime=" + leadTime +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
