package io.github.theriverelder.dataadapter;

import io.github.theriverelder.dataadapter.impl.*;

import java.util.Map;

public class DataAdapterDefaults {

    public static ByteDataAdapter adaptByte(byte value) {
        return new ByteDataAdapter(value);
    }

    public static ShortDataAdapter adaptInt(short value) {
        return new ShortDataAdapter(value);
    }

    public static IntDataAdapter adaptInt(int value) {
        return new IntDataAdapter(value);
    }

    public static LongDataAdapter adaptLong(long value) {
        return new LongDataAdapter(value);
    }

    public static FloatDataAdapter adaptFloat(float value) {
        return new FloatDataAdapter(value);
    }

    public static DoubleDataAdapter adaptDouble(double value) {
        return new DoubleDataAdapter(value);
    }

    public static BooleanDataAdapter adaptBoolean(boolean value) {
        return value ? BooleanDataAdapter.TRUE : BooleanDataAdapter.FALSE;
    }

    public static StringDataAdapter adaptString(String value) {
        return new StringDataAdapter(value);
    }

    public static ListDataAdapter adaptList(DataAdapter... elements) {
        return new ListDataAdapter(elements);
    }

    public static MapDataAdapter adaptMap(Map.Entry<String, DataAdapter>... entries) {
        return new MapDataAdapter(entries);
    }
}
