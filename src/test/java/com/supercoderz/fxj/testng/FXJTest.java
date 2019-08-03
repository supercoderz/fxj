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
        FXRate rate = FXJ.instance().get("USDJPY");
        assertNotNull(rate.value);
    }

    @Test
    public void testGetDate(){
        FXRate rate = FXJ.instance().get("USDJPY","20190101");
        assertNotNull(rate);
        assertNotNull(rate.date.orElse(null));
        assertNotNull(rate.value);
    }

    @Test
    public void testGetDateFuture(){
        FXRate rate = FXJ.instance().get("USDJPY","20190101");
        assertNotNull(rate);
        assertNotNull(rate.date.orElse(null));
        assertEquals(rate.value,Double.NaN);
    }

    @Test
    public void testGetDaily(){
        FXRate[] result = FXJ.instance().dailyRates();
        assertNotNull(result);
        assertTrue(result.length > 1)
    }

    @Test
    public void testGetHistorical(){
        FXRate[] result = FXJ.instance().historicalRates();
        assertNotNull(result);
        assertTrue(result.length > 1)
    }

}
