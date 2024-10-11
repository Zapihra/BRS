public class Instance {

    private static volatile Instance instance;

    public static Instance tryReservation() {
        Instance in = Instance.instance;
        if(in == null) {
            synchronized (Instance.class) {
                in = Instance.instance;
                if (in == null) {
                    Instance.instance = in = new Instance();
                }
            }
        }
        return in;
    }
    
    public static void endReservation() {
        instance = null;
    }
}
