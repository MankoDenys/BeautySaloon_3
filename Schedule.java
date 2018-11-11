import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private final List<TimeSlot> freeTimeSlots = new ArrayList<>();

    public TimeSlot getNearestTimeSlot(LocalTime time) {
        List<TimeSlot> newTimeSlot = new ArrayList<>();
        for (TimeSlot elem : freeTimeSlots) {
            if (elem.getFinish().equals(time));
            newTimeSlot.add(elem);
        }
        return (TimeSlot) newTimeSlot;
    }
}
