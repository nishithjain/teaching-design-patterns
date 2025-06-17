
public class Main {

    public static void main(String[] args) {
        InternRegistry registry = new InternRegistry();

        // Register default interns
        DefaultInternsInitializer.registerDefaultInterns(registry);

        // Clone engineering intern
        Intern engIntern = registry.create(InternKeys.ENGINEERING);
        if (engIntern != null) {
            engIntern.setName("Nishith");
            engIntern.setEmail("write2nishi@eng.com");
            engIntern.setAge(43);
            engIntern.setGender("Male");
            engIntern.setUniversityName("SIT Tumkur");
            engIntern.setPhoneNumber("9999912345");

            printInternDetails(engIntern);
        }

        // Clone business analyst intern
        Intern baIntern = registry.create(InternKeys.BUSINESS_ANALYST);
        if (baIntern != null && baIntern instanceof BusinessAnalystIntern) {
            BusinessAnalystIntern ba = (BusinessAnalystIntern) baIntern;
            ba.setName("uday");
            ba.setEmail("uday@.com");
            ba.setAge(23);
            ba.setGender("Male");
            ba.setUniversityName("IIM Bangalore");
            ba.setPhoneNumber("8888843210");
            ba.setToolsKnown("Excel, Power BI");
            ba.setDataSourcesUsed("Retail DB, Surveys");
            printInternDetails(ba);
        }

        BusinessAnalystIntern d = (BusinessAnalystIntern) registry.create(InternKeys.BUSINESS_ANALYST);
        d.setName("darshan");
        d.setEmail("darshan@.com");
        d.setAge(23);
        d.setGender("Male");
        d.setUniversityName("IIM Bangalore");
        d.setPhoneNumber("8888843210");
        d.setToolsKnown("Excel, Power BI");
        d.setDataSourcesUsed("Retail DB, Surveys");

        printInternDetails(d);
    }

    private static void printInternDetails(Intern intern) {
        System.out.println("\n---------------- INTERN DETAILS ----------------");
        System.out.println("Name             : " + intern.getName());
        System.out.println("Email            : " + intern.getEmail());
        System.out.println("Age              : " + intern.getAge());
        System.out.println("Gender           : " + intern.getGender());
        System.out.println("University       : " + intern.getUniversityName());
        System.out.println("Phone Number     : " + intern.getPhoneNumber());

        if (intern instanceof BusinessAnalystIntern ba) {
            System.out.println("Tools Known      : " + ba.getToolsKnown());
            System.out.println("Data Sources     : " + ba.getDataSourcesUsed());
        }

        if (intern.getBatchInfo().isPresent()) {
            BatchInfo batch = intern.getBatchInfo().get();
            System.out.println("Batch Name       : " + batch.getName());
            System.out.println("Duration         : " + batch.getDuration());
            System.out.println("Location         : " + batch.getLocation());
        } else {
            System.out.println("Batch Info       : Not Available");
        }

        System.out.println("------------------------------------------------");
    }
}
