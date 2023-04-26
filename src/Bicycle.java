public class Bicycle extends Transport implements Service {
    public Bicycle(String modelName, int wheelCounter) {
        super(modelName, wheelCounter);
    }

    @Override
    public void servicing() {
        for (int i = 1; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
