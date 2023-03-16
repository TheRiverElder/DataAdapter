package io.github.theriverelder.dataadapter.impl;

import org.jetbrains.annotations.NotNull;

public class FloatDataAdapter extends NumberDataAdapter {
    public FloatDataAdapter(float value) {
        super(value);
    }

    @Override
    public float asFloat() {
        return value.floatValue();
    }
}
