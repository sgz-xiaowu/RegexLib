package com.neoteched.sdw.regexlib.constant;

import com.neoteched.sdw.regexlib.R;

/**
 * Created by shendawei on 16/9/5.
 */
public class RegexConstant {
    /*中文字符*/
    public static final String CHINESE_CHARACTER = "[\\u4e00-\\u9fa5]";
    /*字符串全部是中文*/
    public static final String CHINESE_CHARACTERS = "^[\\u4e00-\\u9fa5]*$";
    /*双子节字符串,包含中文*/
    public static final String DOUBLE_BYTE_CHARACTERS = "[^\\x00-\\xff]";
    /*空白行*/
    public static final String SPACE_LINE = "\\n\\s*\\r";
    /*网址*/
    public static final String URL = "[a-zA-z]+://[^\\s]*";
    /*腾讯QQ号*/
    public static final String QQ = "[1-9][0-9]{4,}";
    /*中国邮政编码*/
    public static final String POST_CODE = "[1-9]\\d{5}(?!\\d)";
    /*身份证号*/
    public static final String IDENTITY_CARD = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$";
    /*整数*/
    public static final String INTEGER = "^-?[1-9]\\d*$";
    /*正整数*/
    public static final String POSITIVE_INTEGER = "^[1-9]\\d*$";
    /*负整数*/
    public static final String NEGATIVE_INTEGER = "^-[1-9]\\d*$";
    /*邮箱*/
    public static final String EMAIL = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
    /*国内电话号码*/
    public static final String TELEPHONE = "\\d{3}-\\d{8}|\\d{4}-\\d{7,8}";
    /*手机号码 规则:必须是11位数字*/
    /*
     * 旧版手机号码:
     * 中国移动(China Mobile)：134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * 中国联通(China Unicom)：130,131,132,145,152,155,156,1709,171,176,185,186
     * 中国电信(China Telecom)：133,134,153,1700,177,180,181,189
     */
    public static final String OLD_PHONE = "^1(3[0-9]|4[57]|5[0-35-9]|7[01678]|8[0-9])\\d{8}$";
    public static final String OLD_CM = "^1(3[4-9]|4[7]|5[0-27-9]|7[0]|7[8]|8[2-478])\\d{8}$";
    public static final String OLD_CU = "^1(3[0-2]|4[5]|5[56]|709|7[1]|7[6]|8[56])\\d{8}$";
    public static final String OLD_CT = "^1(3[34]|53|77|700|8[019])\\d{8}$";
    /*
     * 新版手机号码: 13[0-9], 14[5,7], 15[0, 1, 2, 3, 5, 6, 7, 8, 9], 17[0, 1, 6, 7, 8], 18[0-9]
     * 中国移动(China Mobile): 134,135,136,137,138,139,147,150,151,152,157,158,159,170,178,182,183,184,187,188
     * 中国联通(China Unicom): 130,131,132,145,152,155,156,170,171,176,185,186
     * 中国电信(China Telecom): 133,134,153,170,177,180,181,189
     */
    public static final String PHONE = "^1(3[0-9]|4[57]|5[0-35-9]|7[01678]|8[0-9])\\d{8}$";
    public static final String CM = "^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$";
    public static final String CU = "^1(3[0-2]|4[5]|5[256]|7[016]|8[56])\\d{8}$";
    public static final String CT = "^1(3[34]|53|7[07]|8[019])\\d{8}$";
}
