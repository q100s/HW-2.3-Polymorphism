public class Bicycle extends Transport implements Service {
    public Bicycle(String modelName, int wheelCounter) {
        super(modelName, wheelCounter);
    }

    @Override
    public void servicing() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
