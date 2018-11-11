public class CategoryService {
    private GeneralNameService generalNameService;

    public CategoryService(GeneralNameService generalNameService) {
        this.generalNameService = generalNameService;
    }

    public GeneralNameService getGeneralNameService() {
        return generalNameService;
    }

    @Override
    public String toString() {
        return "CategoryService{" +
                "generalNameService=" + generalNameService +
                '}';
    }
}
