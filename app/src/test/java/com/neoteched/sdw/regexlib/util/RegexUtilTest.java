package com.neoteched.sdw.regexlib.util;

import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

/**
 * Created by shendawei on 16/9/6.
 */
public class RegexUtilTest {
    public static final String Tag = RegexUtilTest.class.getSimpleName();

    @Mock
    Log log;

    @Before
    public void setUp() throws Exception {
        log.d(Tag, "setUp...");
    }

    @After
    public void tearDown() throws Exception {
        log.d(Tag, "tearDown...");
    }

    @Test
    public void testIsChineseChar() throws Exception {
        String str1 = "你我他科技"; //判断是否匹配单个字符
        assertFalse(RegexUtil.isChineseChar(str1));
        String str2 = "neoteched.com";
        assertFalse(RegexUtil.isChineseChar(str2));
        String str3 = "met我123";
        assertFalse(RegexUtil.isChineseChar(str3));
        String str4 = "met你我他123";
        assertFalse(RegexUtil.isChineseChar(str4));
        String str5 = "你";
        assertTrue(RegexUtil.isChineseChar(str5));
        String str6 = "m";
        assertFalse(RegexUtil.isChineseChar(str6));
    }

    @Test
    public void testIsChinese() throws Exception {
        String str1 = "你我他科技";
        assertTrue(RegexUtil.isChinese(str1));
        String str2 = "neoteched.com";
        assertFalse(RegexUtil.isChinese(str2));
        String str3 = "met我123";
        assertFalse(RegexUtil.isChinese(str3));
        String str4 = "met你我他123";
        assertFalse(RegexUtil.isChinese(str4));
    }

    @Test
    public void testIsDoubleByte() throws Exception {
        log.d(Tag, "not testIsDoubleByte..");
    }

    @Test
    public void testIsSpaceLine() throws Exception {
        log.d(Tag, "not testIsSpaceLine..");
    }

    @Test
    public void testIsUrl() throws Exception {
        String url = "https://www.baidu.com";
        assertTrue(RegexUtil.isUrl(url));
        url = "www.baidu.com";
        assertFalse(RegexUtil.isUrl(url));
        url = "http://www.baidu.com.dakdfa";
        assertTrue(RegexUtil.isUrl(url));
    }

    @Test
    public void testIsQQNo() throws Exception {
        String num = "438729160";
        assertTrue(RegexUtil.isQQNo(num));
    }

    @Test
    public void testIsPostCode() throws Exception {
        String code = "100123";
        assertTrue(RegexUtil.isPostCode(code));
        code = "10086";
        assertFalse(RegexUtil.isPostCode(code));
    }

    @Test
    public void testIsIdentityCard() throws Exception {
        String card = "410122198709031717";
        assertTrue(RegexUtil.isIdentityCard(card));
        card = "41012219870903171X";
        assertTrue(RegexUtil.isIdentityCard(card));
        card = "41012219870903171x";
        assertFalse(RegexUtil.isIdentityCard(card));
        card = "4101221987090317X1";
        assertFalse(RegexUtil.isIdentityCard(card));
    }

    @Test
    public void testIsInteger() throws Exception {
        String num = "100000000000000";
        assertTrue(RegexUtil.isInteger(num));
        num = "100000.000000000";
        assertFalse(RegexUtil.isInteger(num));
    }

    @Test
    public void testIsPositiveInteger() throws Exception {
        String num = "-100000000000000";
        assertFalse(RegexUtil.isPositiveInteger(num));
    }

    @Test
    public void testIsNegativeInteger() throws Exception {
        String num = "-100000000000000";
        assertTrue(RegexUtil.isInteger(num));
    }

    @Test
    public void testIsEmail() throws Exception {
        String email = "name@163.com";
        assertTrue(RegexUtil.isEmail(email));
        email = "name@163.da.com";
        assertTrue(RegexUtil.isEmail(email));
        email = "name@163.da.com.xxxxx";
        assertTrue(RegexUtil.isEmail(email));
    }

    @Test
    public void testIsTelephone() throws Exception {
        log.d(Tag, "not testIsTelephone..");
    }

    @Test
    public void testIsPhone() throws Exception {
        String phone = "18912343134";
        assertTrue(RegexUtil.isPhone(phone));
        phone = "12612343134";
        assertFalse(RegexUtil.isPhone(phone));
        phone = "17012343134";
        assertTrue(RegexUtil.isPhone(phone));
    }

    @Test
    public void testIsCM() throws Exception {
        log.d(Tag, "not testIsCM..");
    }

    @Test
    public void testIsCU() throws Exception {
        log.d(Tag, "not testIsCU..");
    }

    @Test
    public void testIsCT() throws Exception {
        log.d(Tag, "not testIsCT..");
    }

    @Test
    public void testGetPhoneType() throws Exception {
        String phone = "18911103587";
        assertEquals("中国电信", RegexUtil.getPhoneType(phone));
        phone = "13511103587";
        assertEquals("中国移动", RegexUtil.getPhoneType(phone));
    }

    @Test
    public void testIsMetCustomRule() throws Exception {
        log.d(Tag, "not testIsMetCustomRule..");
    }
}