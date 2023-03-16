package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;

public class LongDataAdapter extends NumberDataAdapter {

    public LongDataAdapter(long value) {
        super(value);
    }

    @Override
    public long asLong() {
        return value.longValue();
    }
}
