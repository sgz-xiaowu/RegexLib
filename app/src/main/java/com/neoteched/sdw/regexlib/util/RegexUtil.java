package com.neoteched.sdw.regexlib.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.neoteched.sdw.regexlib.constant.RegexConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shendawei on 16/9/6.
 */
public class RegexUtil {

    public static boolean isChineseChar(String text) {
        return isMatchRegex(RegexConstant.CHINESE_CHARACTER, text);
    }

    public static boolean isChinese(String text) {
        return isMatchRegex(RegexConstant.CHINESE_CHARACTERS, text);
    }

    public static boolean isDoubleByte(String text) {
        return isMatchRegex(RegexConstant.DOUBLE_BYTE_CHARACTERS, text);
    }

    public static boolean isSpaceLine(String text) {
        return isMatchRegex(RegexConstant.SPACE_LINE, text);
    }

    public static boolean isUrl(String text) {
        return isMatchRegex(RegexConstant.URL, text);
    }

    public static boolean isQQNo(String text) {
        return isMatchRegex(RegexConstant.QQ, text);
    }

    public static boolean isPostCode(String text) {
        return isMatchRegex(RegexConstant.POST_CODE, text);
    }

    public static boolean isIdentityCard(String text) {
        return isMatchRegex(RegexConstant.IDENTITY_CARD, text);
    }

    public static boolean isInteger(String text) {
        return isMatchRegex(RegexConstant.INTEGER, text);
    }

    public static boolean isPositiveInteger(String text) {
        return isMatchRegex(RegexConstant.POSITIVE_INTEGER, text);
    }

    public static boolean isNegativeInteger(String text) {
        return isMatchRegex(RegexConstant.NEGATIVE_INTEGER, text);
    }

    public static boolean isEmail(String text) {
        return isMatchRegex(RegexConstant.EMAIL, text);
    }

    public static boolean isTelephone(String text) {
        return isMatchRegex(RegexConstant.TELEPHONE, text);
    }

    public static boolean isPhone(String text) {
        if (TextUtils.isEmpty(text) || text.length() != 11) {
            return false;
        }
        return isMatchRegex(RegexConstant.PHONE, text);
    }

    public static boolean isCM(String text) {
        if (TextUtils.isEmpty(text) || text.length() != 11) {
            return false;
        }
        return isMatchRegex(RegexConstant.CM, text);
    }

    public static boolean isCU(String text) {
        if (TextUtils.isEmpty(text) || text.length() != 11) {
            return false;
        }
        return isMatchRegex(RegexConstant.CU, text);
    }

    public static boolean isCT(String text) {
        if (TextUtils.isEmpty(text) || text.length() != 11) {
            return false;
        }
        return isMatchRegex(RegexConstant.CT, text);
    }

    /**
     * 获取手机运营商品牌
     *
     * @param phone
     * @return
     */
    public static String getPhoneType(String phone) {
        return isCM(phone) ? "中国移动" : isCU(phone) ? "中国联通" : isCT(phone) ? "中国电信" : "未知";
    }

    public static boolean isMetCustomRule(String customRegex, String text) {
        return isMatchRegex(customRegex, text);
    }

    private static boolean isMatchRegex(@NonNull String regex, @NonNull String entireRegion) {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(entireRegion);
        return matcher.matches();
    }
}
