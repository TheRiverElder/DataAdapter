package io.github.theriverelder.dataadapter.impl;

import io.github.theriverelder.dataadapter.DataAdapter;
import org.jetbrains.annotations.NotNull;

public class NumberDataAdapter implements DataAdapter {


    @NotNull
    protected final Number value;

    public NumberDataAdapter(@NotNull Number value) {
        this.value = value;
    }


    //#region to 系列方法，可用直接转换，也可以失败

    public byte toByte() {
        return value.byteValue();
    }

    public short toShort() {
        return value.shortValue();
    }

    public int toInt() {
        return value.intValue();
    }

    public long toLong() {
        return value.longValue();
    }

    public float toFloat() {
        return value.floatValue();
    }

    public double toDouble() {
        return value.doubleValue();
    }

    public boolean toBoolean() {
        return value.doubleValue() != 0.0;
    }

    public String toStr() {
        return value.toString();
    }

    public Object toObject() {
        return value;
    }

}
