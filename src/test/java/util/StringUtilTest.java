package util;

import static org.junit.Assert.*;
import org.junit.Test;


public class StringUtilTest
{
    @Test
    public void repeatStringOnce()
    {
        assertEquals("This is my firsts test", "hola", StringUtil.repeat( "hola" , 1));
    }

    @Test
    public void repeatStringMultipleTimes()
    {
        assertEquals("This is my seconds test", "holaholahola", StringUtil.repeat( "hola" , 3));
    }

    @Test
    public void repeatStringZeroTimes()
    {
        assertEquals("This is my threes test", "", StringUtil.repeat( "hola" , 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegative()
    {
        assertEquals("This is my four test", "", StringUtil.repeat( "hola" , -1));
    }


}