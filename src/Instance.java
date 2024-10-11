public class Instance {

    private static volatile Instance instance;

    public static Instance tryReservation() {
        if(instance == null) {
            synchronized (Instance.class) {
                if (instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }
    
    public static void endReservation() {
        instance = null;
    }
}
