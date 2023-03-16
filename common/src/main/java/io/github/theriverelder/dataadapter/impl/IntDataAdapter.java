package io.github.theriverelder.dataadapter.impl;

public class IntDataAdapter extends DataAdapter {
    
    private int value;

    public IntDataAdapter(int value) {
        this.value = value;
    }


    //#region to 系列方法，可用直接转换，也可以失败

    public byte toByte() {
        return (byte) this.value;
    }

    short toShort() {
        return (short) this.value;
    }

    int toInt() {
        return this.value;
    }

    long toLong() {
        return this.value;
    }

    float toFloat() {
        return (float) this.value;
    }

    double toDouble() {
        return (double) this.value;
    }

    boolean toBoolean() {
        return this.value != 0;
    }

    String toString() {
        return String.valueOf(this.value);
    }

    Object toObject() {
        return Integer.valueOf(this.value);
    }

    //#endregion

    //#region as 系列方法，如果类型不对，则必定抛出异常

    public int asInt() {
        return this.value;
    }

    public Object asObject() {
        return Integer.valueOf(this.value);
    }

    <T> T as(Class<T> clazz) {
        if (clazz == Integer.class) return this.value;
        else return super.as(clazz);
    }

    //#endregion

}
