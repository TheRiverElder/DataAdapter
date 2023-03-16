package io.github.theriverelder.dataadapter;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public interface DataAdapter {

    //#region to 系列方法，可用直接转换，也可以失败

    default byte toByte() {
        throw new IllegalStateException("Cannot convert to byte");
    }

    default short toShort() {
        throw new IllegalStateException("Cannot convert to short");
    }

    default int toInt() {
        throw new IllegalStateException("Cannot convert to int");
    }

    default long toLong() {
        throw new IllegalStateException("Cannot convert to long");
    }

    default float toFloat() {
        throw new IllegalStateException("Cannot convert to float");
    }

    default double toDouble() {
        throw new IllegalStateException("Cannot convert to double");
    }

    default boolean toBoolean() {
        throw new IllegalStateException("Cannot convert to boolean");
    }

    default String toStr() {
        throw new IllegalStateException("Cannot convert to String");
    }

    default Object toObject() {
        throw new IllegalStateException("Cannot convert to Object");
    }

    default <T> T to(@NotNull Class<T> clazz) {
        throw new IllegalStateException("Cannot convert to " + clazz.getName());
    }

    default byte[] toByteArray() {
        List<DataAdapter> list = this.asList();
        byte[] result = new byte[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toByte();
        }
        return result;
    }

    default short[] toShortArray() {
        List<DataAdapter> list = this.asList();
        short[] result = new short[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toShort();
        }
        return result;
    }

    default int[] toIntArray() {
        List<DataAdapter> list = this.asList();
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toInt();
        }
        return result;
    }

    default long[] toLongArray() {
        List<DataAdapter> list = this.asList();
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toLong();
        }
        return result;
    }

    default float[] toFloatArray() {
        List<DataAdapter> list = this.asList();
        float[] result = new float[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toFloat();
        }
        return result;
    }

    default double[] toDoubleArray() {
        List<DataAdapter> list = this.asList();
        double[] result = new double[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toDouble();
        }
        return result;
    }

    default boolean[] toBooleanArray() {
        List<DataAdapter> list = this.asList();
        boolean[] result = new boolean[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toBoolean();
        }
        return result;
    }

    default String[] toStringArray() {
        List<DataAdapter> list = this.asList();
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toStr();
        }
        return result;
    }

    default Object[] toObjectArray() {
        List<DataAdapter> list = this.asList();
        Object[] result = new Object[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).toObject();
        }
        return result;
    }

    default <T> T[] toArray(@NotNull Class<T> clazz) {
        List<DataAdapter> list = this.asList();
        Object[] result = new Object[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).to(clazz);
        }
        return (T[]) result;
    }

    //#endregion

    //#region as 系列方法，如果类型不对，则必定抛出异常

    default byte asByte() {
        throw new IllegalStateException("Cannot get as byte");
    }

    default short asShort() {
        throw new IllegalStateException("Cannot get as short");
    }

    default int asInt() {
        throw new IllegalStateException("Cannot get as int");
    }

    default long asLong() {
        throw new IllegalStateException("Cannot get as long");
    }

    default float asFloat() {
        throw new IllegalStateException("Cannot get as float");
    }

    default double asDouble() {
        throw new IllegalStateException("Cannot get as double");
    }

    default boolean asBoolean() {
        throw new IllegalStateException("Cannot get as boolean");
    }

    default String asString() {
        throw new IllegalStateException("Cannot get as String");
    }

    default Object asObject() {
        throw new IllegalStateException("Cannot get as Object");
    }

    default <T> T as(@NotNull Class<T> clazz) {
        throw new IllegalStateException("Cannot get as " + clazz.getName());
    }

    default byte[] asByteArray() {
        throw new IllegalStateException("Cannot get as byte[]");
    }

    default short[] asShortArray() {
        throw new IllegalStateException("Cannot get as short[]");
    }

    default int[] asIntArray() {
        throw new IllegalStateException("Cannot get as int[]");
    }

    default long[] asLongArray() {
        throw new IllegalStateException("Cannot get as long[]");
    }

    default float[] asFloatArray() {
        throw new IllegalStateException("Cannot get as float[]");
    }

    default double[] asDoubleArray() {
        throw new IllegalStateException("Cannot get as double[]");
    }

    default boolean[] asBooleanArray() {
        throw new IllegalStateException("Cannot get as boolean[]");
    }

    default String[] asStringArray() {
        throw new IllegalStateException("Cannot get as String[]");
    }

    default Object[] asObjectArray() {
        throw new IllegalStateException("Cannot get as Object[]");
    }

    default <T> T[] asArray(@NotNull Class<T> clazz) {
        throw new IllegalStateException("Cannot get as " + clazz.getName() + "[]");
    }

    //#endregion

    //#region 特殊的 as 方法，对其返回值的操作，也会对自己造成影响

    default List<DataAdapter> asList() {
        throw new IllegalStateException("Cannot get as List");
    }

    default Map<String, DataAdapter> asMap() {
        throw new IllegalStateException("Cannot get as Map");
    }

    //#endregion

}
