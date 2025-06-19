package rs2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LJWIWXSK")
public class JString {
    @OriginalMember(owner = "client!LJWIWXSK", name = "e", descriptor = "[C")
    private static final char[] BASE37_LOOKUP = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long toBase37(String string) {
        long l = 0L;
        for (int i = 0; i < string.length() && i < 12; i++) {
            char c = string.charAt(i);
            l *= 37L;
            if (c >= 'A' && c <= 'Z') {
                l += c + 1 - 65;
            } else if (c >= 'a' && c <= 'z') {
                l += c + 1 - 97;
            } else if (c >= '0' && c <= '9') {
                l += c + 27 - 48;
            }
        }
        while (l % 37L == 0L && l != 0L) {
            l /= 37L;
        }
        return l;
    }

    @OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static String fromBase37(long value) {
        if (value <= 0L || value >= 6582952005840035281L) {
            return "invalid_name";
        } else if (value % 37L == 0L) {
            return "invalid_name";
        } else {
            int len = 0;
            char[] chars = new char[12];
            while (value != 0L) {
                long l1 = value;
                value /= 37L;
                chars[11 - len++] = BASE37_LOOKUP[(int) (l1 - value * 37L)];
            }
            return new String(chars, 12 - len, len);
        }
    }

    @OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long hashCode(String string) {
        String upper = string.toUpperCase();
        long hash = 0L;
        for (int i = 0; i < upper.length(); i++) {
            hash = hash * 61L + (long) upper.charAt(i) - 32L;
            hash = hash + (hash >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return hash;
    }

    @OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String formatIPv4(int ip) {
        return (ip >> 24 & 0xFF) + "." + (ip >> 16 & 0xFF) + "." + (ip >> 8 & 0xFF) + "." + (ip & 0xFF);
    }

    @OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String formatName(String string) {
        if (string.isEmpty()) {
            return string;
        }
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '_') {
                chars[i] = ' ';
                if (i + 1 < chars.length && chars[i + 1] >= 'a' && chars[i + 1] <= 'z') {
                    chars[i + 1] = (char) (chars[i + 1] + 'A' - 97);
                }
            }
        }
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char) (chars[0] + 'A' - 97);
        }
        return new String(chars);
    }

    @OriginalMember(owner = "client!LJWIWXSK", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String toAsterisks(String arg1) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < arg1.length(); i++) {
            text.append("*");
        }
        return text.toString();
    }
}
