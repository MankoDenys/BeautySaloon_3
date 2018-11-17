import java.io.IOException;
import java.time.LocalTime;
import java.util.*;

public class SaloonIORunner {

    private static final String OUTPUT_TEXT_FILE = "e://Javaproject//BeautySaloon//ServiceList.txt";
    private static final String INPUT_TEXT_FILE = "e://Javaproject//BeautySaloon//ServiceList.txt";
    private static final String BIN_FILE = "e://Javaproject//BeautySaloon//ServiceList_BIN.txt";

    public static void main(String[] args) {

        Service serv1 = new Service(GeneralNameService.HAIR, NameService.FEMALE_HAIRCUT, 150L, LocalTime.of(0, 55), "Woman modern cut");
        Service serv2 = new Service(GeneralNameService.HAIR, NameService.MALE_HAIRCUT, 80L, LocalTime.of(0, 30), "Man modern cut");

        List<Service> servs = Arrays.asList(serv1, serv2);

        try {
            System.out.println("Reading from text file: " + INPUT_TEXT_FILE);
            List<String> serviceList = ServiceIO.readService(INPUT_TEXT_FILE);
            System.out.println(serviceList);

            System.out.println("Writing into text file: " + OUTPUT_TEXT_FILE);
            ServiceIO.writeService(OUTPUT_TEXT_FILE, servs);

            System.out.println("Writing into bin file: " + BIN_FILE);
            ServiceIO.writeServiceIntoBinFile(BIN_FILE, servs);

            System.out.println("Reading from bin file: " + BIN_FILE);
            Service serviceFromBinFile = (Service) ServiceIO.readServiceFromBinFile(BIN_FILE);
            System.out.println(serviceFromBinFile);

            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("IO Error. " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
        }

    }
}
