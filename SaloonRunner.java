import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SaloonRunner {
    public static void main(String[] args) {

        User user = new User("Julia", new Account(1000));

        Specialist specialist1 = new Specialist(FullName.IVANOVA_IVANA, Profession.HAIRDRESSER, new Rating());
        user.addMark(specialist1, 5);
        System.out.println(specialist1);


        List<FullName> names = Arrays.asList(FullName.KOLYADA_DARIYA, FullName.IVANOVA_IVANA, FullName.HANDA_NATALIA,
                FullName.STASHKO_VERONIKA, FullName.TEHINA_MARYANA);
        Collections.sort(names);
        System.out.println(names);

        List<Integer> price = Arrays.asList(70, 150, 90, 200, 130, 100);
        Collections.sort(price);
        System.out.println(price);

        List<Integer> priceBetween = Filter.filter(price, new ChoicePrice(100, 150));


        List<NameService> namesService = Arrays.asList(NameService.CLEANING, NameService.DEPILATION, NameService.DYEING,
                NameService.FEMALE_HAIRCUT, NameService.HAND_EPILATION, NameService.LEG_EPILATION, NameService.LIFTING,
                NameService.MALE_HAIRCUT, NameService.MANICURE, NameService.MASSAGE, NameService.PEDICURE, NameService.PEELING);
        List<NameService> namesServiceSearch = Filter.filter(namesService, new ServicePredicator(NameService.CLEANING));
    }
}
// Specialist{fullName=IVANOVA_IVANA, profession=HAIRDRESSER, rating=Rating{summRat=5, quantity=1}}
//[IVANOVA_IVANA, KOLYADA_DARIYA, STASHKO_VERONIKA, HANDA_NATALIA, TEHINA_MARYANA]
//[70, 90, 100, 130, 150, 200]