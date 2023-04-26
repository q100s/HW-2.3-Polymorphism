public class Truck extends Transport{
    public Truck(String modelName, int wheelCounter) {
        super(modelName, wheelCounter);
    }
    @Override
    public void servicing() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
