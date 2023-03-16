package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDataAdapter implements DataAdapter {

    private final List<DataAdapter> list;


    public ListDataAdapter(List<DataAdapter> list) {
        this.list = list;
    }

    public ListDataAdapter() {
        this(new ArrayList<>());
    }

    public ListDataAdapter(DataAdapter... elements) {
        this(new ArrayList<>(Arrays.asList(elements)));
    }

    @Override
    public List<DataAdapter> asList() {
        return list;
    }
}
