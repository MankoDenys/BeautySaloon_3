import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class ServiceIO {

    public static void writeService(String fileName, List<Service> servs) throws IOException {
        try (BufferedWriter bwriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Service serv : servs) {
                bwriter.write(String.valueOf(serv));
                bwriter.newLine();
            }
        }
    }

    public static List<String> readService(String fileName)throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> list = new ArrayList<>();
            String str;
            while ((str = reader.readLine()) != null) {
                list.add(str);
            }
            reader.close();
            return list;
        }
    }

    public static void writeServiceIntoBinFile(String fileName, List<Service> servs) throws IOException {
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutput.writeObject(servs);
        }
    }

    public static List<Service> readServiceFromBinFile(String fileName) throws IOException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Service>)objectInput.readObject();
        } catch (ClassNotFoundException | ClassCastException | InvalidClassException e) {
            throw new IllegalArgumentException("Binary file is corrupted", e);
        }
    }

//    public static Service readServiceFromFile(String fileName) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            return readService(reader);
//        }
//    }
//
//    private static Service readService(BufferedReader reader) throws IOException {
//        String line = reader.readLine();
//        return parseService(line);
//    }
//
//    private static Service parseService(String line) {
//        String[] signification = line.split(";");
//        if (signification.length < 5) {
//            throw new IllegalArgumentException("Missing values: " + line);
//        }
//        Set<NameService> nameService = parseNameService(signification[1]);
//        if (nameService == null) {
//            return null;
//        }
//        Set<GeneralNameService> generalNameService = parseGeneralNameService(signification[0]);
//        if (generalNameService == null) {
//            return null;
//        }
//        String description = signification[4].trim();
//        long price = Long.parseLong(signification[2].trim());
//        LocalTime leadTime = LocalTime.parse(signification[3].trim());
//        NameService nameService = NameService.valueOf(signification[1].trim());
//        CategoryService generalNameService = new CategoryService(GeneralNameService.valueOf(signification[0].trim()));
//
//        return new Service(new CategoryService(new GeneralNameService(generalNameService)), nameService, price, leadTime, description);
//    }


//    public static Set<NameService> parseNameService(String line) {
//        Set<NameService> nameService = new HashSet<>();
//        String[] nss = line.split(",");
//        for (String ns : nss) {
//            ns = ns.trim();
//            nameService.add(NameService.valueOf(ns));
//        }
//        return nameService;
//    }
//
//    public static Set<GeneralNameService> parseGeneralNameService(String line) {
//        Set<GeneralNameService> generalNameService = new HashSet<>();
//        String[] gnss = line.split(",");
//        for (String gns : gnss) {
//            gns = gns.trim();
//            generalNameService.add(GeneralNameService.valueOf(gns));
//        }
//        return generalNameService;
//    }
}
