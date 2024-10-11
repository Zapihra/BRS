public class Instance {
    // apua singletonin implementoimisesta
    // https://paulsofts.com/singleton-design-pattern/

    //singleton pattern

    private static Instance instance;

    public synchronized static Instance startReservation() {
        if(instance == null) {
            instance = new Instance();
        }
        return instance;
    }
    
    public static void endReservation() {
        instance = null;
    }
}
