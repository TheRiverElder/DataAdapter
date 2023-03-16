package io.github.theriverelder.dataadapter;

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

    default String toString() {
        throw new IllegalStateException("Cannot convert to String");
    }

    default Object toObject() {
        throw new IllegalStateException("Cannot convert to Object");
    }

    default <T> T to(@NotNull Class<T> clazz) {
        throw new IllegalStateException("Cannot convert to " + clazz.getName());
    }

    default byte[] toByteArray() {
        throw new IllegalStateException("Cannot convert to byte[]");
    }

    default short[] toShortArray() {
        throw new IllegalStateException("Cannot convert to short[]");
    }

    default int[] toIntArray() {
        throw new IllegalStateException("Cannot convert to int[]");
    }

    default long[] toLongArray() {
        throw new IllegalStateException("Cannot convert to long[]");
    }

    default float[] toFloatArray() {
        throw new IllegalStateException("Cannot convert to float[]");
    }

    default double[] toDoubleArray() {
        throw new IllegalStateException("Cannot convert to double[]");
    }

    default boolean[] toBooleanArray() {
        throw new IllegalStateException("Cannot convert to boolean[]");
    }

    default String[] toStringArray() {
        throw new IllegalStateException("Cannot convert to String[]");
    }

    default Object[] toObjectArray() {
        throw new IllegalStateException("Cannot convert to Object[]");
    }

    default <T> T[] toArray(@NotNull Class<T> clazz) {
        throw new IllegalStateException("Cannot convert to " + clazz.getName() + "[]");
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
