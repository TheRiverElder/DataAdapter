package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;
import io.github.theriverelder.dataadapter.util.Maps;

import java.util.*;

public class MapDataAdapter implements DataAdapter {
    private final Map<String, DataAdapter> map;


    public MapDataAdapter(Map<String, DataAdapter> map) {
        this.map = map;
    }

    public MapDataAdapter() {
        this(new HashMap<>());
    }

    public MapDataAdapter(Map.Entry<String, DataAdapter>... entries) {
        this(Maps.ofEntries(entries));
    }

    @Override
    public List<DataAdapter> asList() {
        return Collections.unmodifiableList(new ArrayList<>(map.values()));
    }

    @Override
    public Map<String, DataAdapter> asMap() {
        return map;
    }
}
