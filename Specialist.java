import java.util.Comparator;

public class Specialist implements Comparable<Specialist> {
    private String fullName;
    private Profession profession;
    private Rating rating = new Rating();

    public Specialist(String fullName, Profession profession, Rating rating) {
        this.fullName = fullName;
        this.profession = profession;
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public Profession getProfession() {
        return profession;
    }

    public int getRating() {
        return rating.averageRating();
    }

    public void addMark(int mark) {
        rating.addMark(mark);
    }

    public int compareTo(Specialist specialist) {
        return getFullName().compareTo(specialist.getFullName());
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "fullName='" + fullName + '\'' +
                ", profession=" + profession +
                ", rating=" + rating +
                '}';
    }
}
