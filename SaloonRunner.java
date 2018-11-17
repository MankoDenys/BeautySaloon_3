import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SaloonRunner {
    public static void main(String[] args) {

        User user = new User("Julia", new Account(1000));

        Specialist specialist1 = new Specialist("IVANOVA IVANA", Profession.HAIRDRESSER, new Rating());
        user.addMark(specialist1, 5);
        Specialist specialist2 = new Specialist("KOLYADA DARIYA", Profession.MANICURIST, new Rating());
        user.addMark(specialist2, 8);
        Specialist specialist3 = new Specialist("HANDA NATALIA", Profession.MASSEUR, new Rating());
        user.addMark(specialist3, 9);
        System.out.println(specialist1);


        List<String> names = Arrays.asList("KOLYADA DARIYA", "IVANOVA IVANA", "HANDA NATALIA",
                "STASHKO VERONIKA", "TEHINA MARYANA");
        Collections.sort(names);
        System.out.println(names);

        List<Long> price = Arrays.asList(70L, 150L, 90L, 200L, 130L, 100L);
        Collections.sort(price);
        System.out.println(price);

        List<Long> priceBetween = Filter.filter(price, new ChoicePrice(111, 211));
        System.out.println(priceBetween);


        List<NameService> namesService = Arrays.asList(NameService.CLEANING, NameService.DEPILATION, NameService.DYEING,
                NameService.FEMALE_HAIRCUT, NameService.HAND_EPILATION, NameService.LEG_EPILATION, NameService.LIFTING,
                NameService.MALE_HAIRCUT, NameService.MANICURE, NameService.MASSAGE, NameService.PEDICURE, NameService.PEELING);

        List<NameService> namesServiceSearch = Filter.filter(namesService, new ServicePredicator(NameService.LEG_EPILATION));
        System.out.println(namesServiceSearch);

        List<Specialist> rating = Arrays.asList(specialist1, specialist2, specialist3);
        Collections.sort(rating);
        System.out.println(rating);
        List<Specialist> ratingBetween = Filter.filter(rating, new ChoiceByRating(3, 6));
        System.out.println(ratingBetween);
    }
}
// Specialist{fullName=IVANOVA_IVANA, profession=HAIRDRESSER, rating=Rating{summRat=5, quantity=1}}
//[IVANOVA_IVANA, KOLYADA_DARIYA, STASHKO_VERONIKA, HANDA_NATALIA, TEHINA_MARYANA]
//[70, 90, 100, 130, 150, 200]