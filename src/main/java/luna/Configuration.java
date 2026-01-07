package luna;

public class Configuration {
    public static String IP_ADDRESS = "http://127.0.0.1";
    public static String CACHE_DIR = "./data/cache/";

    /**
     * Disable [CONNECT_UPDATE_SERVER] / [JAGGRAB_ENABLED] to provide a static cache
     */
    public static boolean CONNECT_UPDATE_SERVER = true;
    public static boolean JAGGRAB_ENABLED = true;

    /**
     * This fixes mouse buttons on later JVMs
     */
    public static boolean FIX_MOUSE_BUTTONS = true;

    /**
     * Luna Protocol BugFix
     */
    public static boolean LUNA_WALKING_BUFFER_FIX = false;

    public static boolean RSA_ENABLED = true;
}
