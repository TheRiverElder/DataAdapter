package io.github.theriverelder.dataadapter;

import java.util.*;

public interface DataAdapter {

    //#region to 系列方法，可用直接转换，也可以失败

    byte toByte();

    short toShort();

    int toInt();

    long toLong();

    float toFloat();

    double toDouble();

    boolean toBoolean();

    String toString();

    Object toObject();

    <T> T to(Class<T> clazz);

    byte[] toByteArray();

    short[] toShortArray();

    int[] toIntArray();

    long[] toLongArray();

    float[] toFloatArray();

    double[] toDoubleArray();

    boolean[] toBooleanArray();

    String[] toStringArray();

    Object[] toObjectArray();

    <T> T[] toArray(Class<T> clazz);

    //#endregion

    //#region as 系列方法，如果类型不对，则必定抛出异常

    // TODO 添加as系列方法

    //#endregion

    //#region 特殊的 as 方法，对其返回值的操作，也会对自己造成影响

    List<DataAdapter> asList();

    Map<String, DataAdapter> asMap();

    //#endregion

}
