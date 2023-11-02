public class Demo {

    public static void main(String[] args) {
        Customer cliente = new Customer("Bia", true);
        Factory factory = getFactory(cliente);

        if (factory != null) {
            Car car = factory.create(cliente.getGradeRequest());
            car.startEngine();
        } else {
            System.out.println("Cliente não possui contrato com a empresa.");
        }
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return null;
        }
    }
}
