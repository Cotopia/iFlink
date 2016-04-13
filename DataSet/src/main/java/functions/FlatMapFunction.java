package functions;

import functions.util.Collector;

import java.io.Serializable;

/**
 * Created by Acceml on 2016/4/11
 * Email: huminghit@gmail.com
 */
public interface FlatMapFunction<I, O> extends Function, Serializable {
    void flatMap(I input, Collector<O> out) throws Exception;
}
