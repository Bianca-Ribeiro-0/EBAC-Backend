public class Customer {
    private String name;
    private String gradeRequest;
    private boolean hasCompanyContract;

    public Customer(String name, boolean hasCompanyContract) {
        this.name = name;
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public String name(){
        return name;
    }
    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }
    public String getGradeRequest() {
        return gradeRequest;
    }

}
