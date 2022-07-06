package furama_project_101.commom;

public class CheckFacility {
    private static String REGEX_ROOM="^[S][V][R][O][0-9]{4}";
    public static boolean checkRoom(String name){
        return name.matches(REGEX_ROOM);
    }
    private static String REGEX_VILLA="^[S][V][V][L][0-9]{4}";
    public static boolean checkVilla(String name){
        return name.matches(REGEX_VILLA);
    }
    private static String REGEX_HOUSE="^[S][V][H][O][0-9]{4}";
    public static boolean checkHouse(String name){
        return name.matches(REGEX_HOUSE);
    }
}
