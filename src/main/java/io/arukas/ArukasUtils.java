package io.arukas;

import org.apache.commons.codec.digest.DigestUtils;

public class ArukasUtils {

    /**
     * Generates an MD5 hash of the given data.
     *
     * @param data The input string to hash.
     * @return The MD5 hash of the input string, or null if the input is null.
     */
    public static String md5(String data) {
        if (data == null) return null;
        return DigestUtils.md5Hex(data);
    }


}
