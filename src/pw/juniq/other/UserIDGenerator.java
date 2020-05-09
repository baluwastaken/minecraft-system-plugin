package pw.juniq.other;

public class UserIDGenerator {
    public static String getUserID(){
        String id = "";
        int i = (int) (Math.random() * 999999);
        id = Integer.toString(i);
        return id;
    }
}
