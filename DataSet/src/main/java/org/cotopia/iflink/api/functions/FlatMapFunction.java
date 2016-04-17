package org.cotopia.iflink.api.functions;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public interface FlatMapFunction<T, O> {
    /**
     * Takes an element from the input data set and transforms it into zero, one, or more elements.
     * Typical applications can be splitting elements.
     * @param value
     * @param out
     * @throws Exception
     */
    void flatMap(T value, Collector<O> out) throws Exception;
}
