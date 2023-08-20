package util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest
{
    @Test
    public void repeatStringOnce()
    {
        Assert.assertEquals("This is my firsts test", "hola", StringUtil.repeat( "hola" , 1));
    }

    @Test
    public void repeatStringMultipleTimes()
    {
        Assert.assertEquals("This is my seconds test", "holaholahola", StringUtil.repeat( "hola" , 3));
    }

    @Test
    public void repeatStringZeroTimes()
    {
        Assert.assertEquals("This is my threes test", "", StringUtil.repeat( "hola" , 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegative()
    {
        StringUtil.repeat( "hola" , -1);
    }


}