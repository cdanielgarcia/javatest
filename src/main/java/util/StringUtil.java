package util;


public class StringUtil
{
    public static String repeat(String str, int times){
        String result = "";
        if(times < 0)
        {
            throw new IllegalArgumentException("Negative numbers doesn't allowed");
        }
        for (int i = 0; i < times; i++)
        {
                result += str;
        }
        return result;
    }
}
