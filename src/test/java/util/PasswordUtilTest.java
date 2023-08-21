package util;

import org.junit.Test;

import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest
{
    @Test
    public void passwordIsWeakWhenIsLessThanEightLetter(){
        assertEquals(WEAK, PasswordUtil.assesPassword("123$%"));
    }

    @Test
    public void passwordIsWeakWhenHasOnlyLetter(){
        assertEquals(WEAK, PasswordUtil.assesPassword("daEKKelKD"));
    }

    @Test
    public void passwordIsMediumWhenHasLetterAndNumbers(){
        assertEquals(MEDIUM, PasswordUtil.assesPassword("daniel213"));
    }

    @Test
    public void passwordIsStrongWhenHasLetterNumbersAndSymbols(){
        assertEquals(STRONG, PasswordUtil.assesPassword("#4daa66#!4"));
    }
}