package io.arukas;

import org.junit.Assert;
import org.junit.Test;

public class ArukasUtilsTest {

    @Test
    public void testMd5() {
        String sign = ArukasUtils.md5("abc123");
        Assert.assertEquals("e99a18c428cb38d5f260853678922e03", sign);
    }

}
