package utils;

import java.util.Locale;
import java.text.NumberFormat;


public final class Format {
    public static String formatMoney(Long money) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String price = currencyVN.format(money * 1000);
        return price;
    }
}
