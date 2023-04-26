public class Car extends Transport{
    public Car(String modelName, int wheelCounter) {
        super(modelName, wheelCounter);
    }
    @Override
    public void servicing() {
        System.out.println("Проверяем двигатель");
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}