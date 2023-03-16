package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;

public class StringDataAdapter implements DataAdapter {

    protected final String value;

    public StringDataAdapter(String value) {
        this.value = value;
    }

    @Override
    public String toStr() {
        return value;
    }

    @Override
    public Object toObject() {
        return value;
    }

    @Override
    public String asString() {
        return value;
    }
}
