package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;

public class NullDataAdapter implements DataAdapter {
    @Override
    public boolean toBoolean() {
        return false;
    }
}
