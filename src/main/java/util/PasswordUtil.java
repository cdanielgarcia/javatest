package util;


public class PasswordUtil
{
    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }
    public static SecurityLevel assesPassword(String password){
        if(password.length()<8){
            return SecurityLevel.WEAK;
        }
        //Regular Expression indicate that has letter from a until z and uppercase too, all times that it want.
        if(password.matches("[a-zA-Z]+")){
            return SecurityLevel.WEAK;
        }
        if(password.matches("[a-zA-Z0-9]+")){
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
