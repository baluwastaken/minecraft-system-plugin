package pw.juniq.other;

public class UserIDGenerator {
    public static String getUserID(){
        String id = "";
        int i = (int) (Math.random() * 99999);
        id = "" + i;
        return id;
    }
}
