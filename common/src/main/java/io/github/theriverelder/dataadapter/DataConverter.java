package io.github.theriverelder.dataadapter;

public interface DataConverter<T> {
    
    DataAdapter load(T source);

    T save(DataAdapter data);
}
