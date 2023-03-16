package io.github.theriverelder.dataadapter.util;

import io.github.theriverelder.dataadapter.DataAdapter;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static class Entry<K, V> implements Map.Entry<K, V> {

        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return this.value = value;
        }
    }

    public static <K, V> Map.Entry<K, V> entry(K key, V value) {
        return new Entry<>(key, value);
    }

    public static <K, V> Map<K, V> ofEntries(Map.Entry<K, V>... entries) {
        Map<K, V> map = new HashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
