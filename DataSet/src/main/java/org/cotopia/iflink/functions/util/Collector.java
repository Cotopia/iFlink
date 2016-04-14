package org.cotopia.iflink.functions.util;

/**
 * Created by Acceml on 2016/4/11
 * Email: huminghit@gmail.com
 */
public interface Collector<T> {
    void collector(T record);
    void close();
}
