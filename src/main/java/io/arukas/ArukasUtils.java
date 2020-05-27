package io.arukas;

import org.apache.commons.codec.digest.DigestUtils;

public class ArukasUtils {

    public static String md5(String data) {
        if (data == null) return null;
        return DigestUtils.md5Hex(data);
    }


}
