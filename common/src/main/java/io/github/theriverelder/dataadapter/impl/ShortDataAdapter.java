package io.github.theriverelder.dataadapter.impl;

import org.jetbrains.annotations.NotNull;

public class ShortDataAdapter extends NumberDataAdapter {

    public ShortDataAdapter(short value) {
        super(value);
    }

    @Override
    public short asShort() {
        return value.shortValue();
    }
}
