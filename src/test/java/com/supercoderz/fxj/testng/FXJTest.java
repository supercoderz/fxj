package com.supercoderz.fxj.testng;


import com.supercoderz.fxj.FXJ;
import org.junit.Test;

import static org.testng.Assert.assertNotNull;

public class FXJTest {

    @Test
    public void testInit() {
        assertNotNull(FXJ.instance());
    }

    @Test
    public void testGet() {
        assertNotNull(FXJ.instance().get("USDJPY"));
    }
}
