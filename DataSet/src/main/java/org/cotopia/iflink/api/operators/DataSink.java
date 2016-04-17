package org.cotopia.iflink.api.operators;

import org.cotopia.iflink.api.dataset.DataSet;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class DataSink<T> {
    private final DataSet<T> data;

    public DataSink(DataSet<T> data) {
        if (data == null) {
            throw new IllegalArgumentException("The data set must not be null.");
        }
        this.data = data;
    }
}
