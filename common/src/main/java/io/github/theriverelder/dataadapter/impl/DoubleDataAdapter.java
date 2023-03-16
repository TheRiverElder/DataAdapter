package io.github.theriverelder.dataadapter.impl;

public class DoubleDataAdapter extends NumberDataAdapter {
    public DoubleDataAdapter(double value) {
        super(value);
    }

    @Override
    public double asDouble() {
        return value.doubleValue();
    }
}
