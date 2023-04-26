public class ServiceStation {
    public void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                continue;
            } else {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                transports[i].servicing();
            }
        }
    }
}
