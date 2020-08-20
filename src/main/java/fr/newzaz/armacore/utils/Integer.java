package fr.newzaz.armacore.utils;

public class Integer {
    public static boolean isInteger(String string) {
        try {
            java.lang.Integer.parseInt(string);
        } catch (NumberFormatException e){
            return false;
        }

        return true;
    }
}
