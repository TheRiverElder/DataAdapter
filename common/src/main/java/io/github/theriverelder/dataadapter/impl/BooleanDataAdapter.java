package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;

public class BooleanDataAdapter implements DataAdapter {

    public static final BooleanDataAdapter TRUE = new BooleanDataAdapter(true);
    public static final BooleanDataAdapter FALSE = new BooleanDataAdapter(false);


    protected final boolean value;

    public BooleanDataAdapter(boolean value) {
        this.value = value;
    }

    @Override
    public boolean toBoolean() {
        return value;
    }

    @Override
    public Object toObject() {
        return value;
    }

    @Override
    public boolean asBoolean() {
        return value;
    }
}
