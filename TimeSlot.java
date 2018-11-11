import java.time.LocalTime;

public class TimeSlot {
    private final LocalTime start;
    private final LocalTime finish;

    public TimeSlot(LocalTime start, LocalTime finish) {
        this.start = start;
        this.finish = finish;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getFinish() {
        return finish;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "start=" + start +
                ", finish=" + finish +
                '}';
    }
}
