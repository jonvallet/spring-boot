package com.jonvallet.restdemo.formmater;

public class PhoneFormatter {
    public static String format(String unformattedPhone) {
        if (unformattedPhone.length() == 11) {
            return String.format("+%s %s-%s-%s",
                    unformattedPhone.substring(0,1),
                    unformattedPhone.substring(1,4),
                    unformattedPhone.substring(4,7),
                    unformattedPhone.substring(7));
        } else {
            return unformattedPhone;
        }
    }
}
