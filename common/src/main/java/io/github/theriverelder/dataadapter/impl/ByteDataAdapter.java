package io.github.theriverelder.dataadapter.impl;

public class ByteDataAdapter extends NumberDataAdapter {


    public ByteDataAdapter(long value) {
        super(value);
    }

    @Override
    public byte asByte() {
        return value.byteValue();
    }

}
