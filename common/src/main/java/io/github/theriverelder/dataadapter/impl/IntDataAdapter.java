package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;
import org.jetbrains.annotations.NotNull;

public class IntDataAdapter extends NumberDataAdapter {


    public IntDataAdapter(int value) {
        super(value);
    }

    @Override
    public int asInt() {
        return value.intValue();
    }
}
