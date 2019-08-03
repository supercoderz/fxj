package com.supercoderz.fxj;

public class FXJ {
    private static FXJ fxj;

    private FXJ() {
    }

    public static FXJ instance() {
        if (fxj == null) {
            fxj = new FXJ();
        }
        return fxj;
    }

    public Double get(String pair,Optional<Date> date) {
        return 70.78;
    }
}
