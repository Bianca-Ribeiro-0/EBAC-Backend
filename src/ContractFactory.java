public class ContractFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("Bia".equals(requestedGrade)) {
            return new Duster(100, "full", "black");
        } else {
            return new Hb20(90, "full", "white");
        }
    }
}
